import java.util.Date;

public class Appointment {
	private String appId;
	private Date appDate;
	private String appDescription;
	//Appointment object constructor
	Appointment(String appId, Date appDate, String appDescription) {
		if (appId == null || appId.length() > 10) {
			throw new IllegalArgumentException("Invalid Appointment ID.");
		}
		if (appDate == null || appDate.before(new Date())) {
			throw new IllegalArgumentException("Invalid Appointment Date.");
		}
		if (appDescription == null || appDescription.length() > 50) {
			throw new IllegalArgumentException("Invalid Appointment Description.");
		}
		this.appId = appId;
		this.appDate = appDate;
		this.appDescription = appDescription;
	}
	//Appointment object accessor methods
	public String getAppId() {
		return this.appId;
	}
	public Date getAppDate() {
		return this.appDate;
	}
	public String getAppDescription() {
		return this.appDescription; 
	}
	//Appointment object mutator methods
	public void setAppDate(Date appDate) {
		if (appDate == null || appDate.before(new Date())) {
			throw new IllegalArgumentException("Invalid Appointment Date.");
		}
		this.appDate = appDate;
	}
	public void setAppDescription(String appDescription) {
		if (appDescription == null || appDescription.length() > 50) {
			throw new IllegalArgumentException("Invalid Appointment Description.");		
		}
		this.appDescription = appDescription;
	}
}