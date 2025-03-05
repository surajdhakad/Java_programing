package has_a_realtion_28_11_24;

public class Address {

	private String cityName;
	private String districtName;
	private String statename;
	
	
	public Address(String cityName, String districtName, String statename) {
		super();
		this.cityName = cityName;
		this.districtName = districtName;
		this.statename = statename;
	}


	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", districtName=" + districtName + ", statename=" + statename + "]";
	}
	
	
	
	
}
