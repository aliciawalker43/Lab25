package GC.Lab25API.model;

public class Forecast {

	
	private Location location;
	private Data data;
	
	
	public Forecast() {
		super();
	}

	@Override
	public String toString() {
		return "Forecast [location=" + location + ", data=" + data + "]";
	}

	public Forecast(Location location, Data data) {
		super();
		this.location = location;
		this.data = data;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	
	
	
	
	
	
}
