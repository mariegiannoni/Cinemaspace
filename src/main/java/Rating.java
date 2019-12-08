
import org.bson.types.*;

public class Rating {
	private ObjectId userId;
	private ObjectId filmId;
	private double rating;
	private int timestamp;
	private int ageOfUser;
	private String gender;
	
	
	public Rating(ObjectId userId, ObjectId filmId, double rating, int timestamp, int ageOfUser, String gender) {
		this.userId = userId;
		this.filmId = filmId;
		this.rating = rating;
		this.timestamp = timestamp;
		this.ageOfUser = ageOfUser;
		this.gender = gender;
	}
	
	
	public ObjectId getUserId() {
		return userId;
	}
	
	public ObjectId getFilmId() {
		return filmId;
	}
	
	public String getGender() {
		return gender;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public int getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}
	
	public int getAgeOfUser() {
		return ageOfUser;
	}
	
	public void setAgeOfUser(int ageOfUser) {
		this.ageOfUser = ageOfUser;
	}
}
