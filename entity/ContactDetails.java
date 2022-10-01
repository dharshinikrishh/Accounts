package entity;

public class ContactDetails {

	private String houseNo;
	private String locName;
	private String cityName;
	private String stateName;
	private String countryName;
	private long pincode;
	private long mobileNo;
	private long email;
	
	public ContactDetails()
	{
		super();
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getEmail() {
		return email;
	}
	public void setEmail(long email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "ContactDetails [houseNo=" + houseNo + ", locName=" + locName + ", cityName=" + cityName + ", stateName="
				+ stateName + ", countryName=" + countryName + ", pincode=" + pincode + ", mobileNo=" + mobileNo
				+ ", email=" + email + "]";
	}
	public ContactDetails(String houseNo, String locName, String cityName, String stateName, String countryName,
			long pincode, long mobileNo, long email) {
		super();
		this.houseNo = houseNo;
		this.locName = locName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
		this.pincode = pincode;
		this.mobileNo = mobileNo;
		this.email = email;
	}
}