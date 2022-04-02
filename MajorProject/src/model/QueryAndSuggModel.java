package model;

public class QueryAndSuggModel {

	private String trackId;
	private String message;
	
	public QueryAndSuggModel() {
		super();
	}
	public QueryAndSuggModel(String trackId, String message) {
		super();
		this.trackId = trackId;
		this.message = message;
	}
	public String getTrackId() {
		return trackId;
	}
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
