package interfaceFXML;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FXMLControllerAdmin {
	//Switch page controller
	private Parent root;
	private Stage stage;
	
	//FXML elements
	@FXML private TextField fileNameField;
	@FXML private Button addFilmsButton;
	@FXML private Button uploadFileButton;
	@FXML private Button confirmButton;
	
	public FXMLControllerAdmin() {
		super();
	}
	
	@FXML protected void initialize() {
	}
	
	@FXML protected void handleHomeButtonAction (ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("home.fxml"));
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(new Scene(root));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	@FXML protected void handleHighestRatedButtonAction (ActionEvent event) {
		try {
			FXMLLoader load = new FXMLLoader(getClass().getResource("home.fxml"));
			root = load.load();
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(new Scene(root));
			FXMLControllerHome controller = load.<FXMLControllerHome>getController();
			controller.highestRated();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	@FXML protected void handleMostPopularButtonAction (ActionEvent event) {
		try {
			FXMLLoader load = new FXMLLoader(getClass().getResource("home.fxml"));
			root = load.load();
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(new Scene(root));
			FXMLControllerHome controller = load.<FXMLControllerHome>getController();
			controller.mostPopular();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	@FXML protected void handleAddFilmsButtonAction (ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("admin.fxml"));
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(new Scene(root));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	@FXML protected void handleDisconnectionButtonAction (ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("connection.fxml"));
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setScene(new Scene(root));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	@FXML protected void handleUploadFileButtonAction (ActionEvent event) {
		FileChooser chooser = new FileChooser();
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("JSON files (*.json)", "*.json");
		chooser.getExtensionFilters().add(extFilter);
		File file = chooser.showOpenDialog(stage);
		fileNameField.setText(file.getAbsolutePath());
		
	}

	@FXML protected void handleConfirmAddFilmsButtonAction (ActionEvent event) {

	}

}
