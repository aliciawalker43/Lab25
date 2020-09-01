package GC.Lab25API.model;

public class Location {

	private Double longitude;
	private Double latitude;
	
	
	
	
	
	
	public Location() {
		super();
	}
	public Location(Double longitude, Double latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "Location [longitude=" + longitude + ", latitude=" + latitude + "]";
	}
	
	
	
}
