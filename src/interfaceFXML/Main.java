package interfaceFXML;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import main.java.CinemaSpaceArchive;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {	
	@Override
	public void start(Stage stage){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("connection.fxml"));
			Scene sceneConnection = new Scene(root);
			stage.setTitle("CinemaSpace");
			stage.setScene(sceneConnection);
			stage.show();
			CinemaSpaceArchive.openConnection("127.0.0.1","27017");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

