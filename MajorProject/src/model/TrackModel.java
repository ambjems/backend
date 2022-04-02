package model;

public class TrackModel {

	private String trackId;
	private String status;
	
	public TrackModel() {
		super();
	}
	public TrackModel(String trackId, String status) {
		super();
		this.trackId = trackId;
		this.status = status;
	}
	public String getTrackId() {
		return trackId;
	}
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
