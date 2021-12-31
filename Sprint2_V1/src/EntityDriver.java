import java.util.ArrayList;

public class EntityDriver extends abstractUser  {
	protected String username, password, email, phoneNumber, nationalID, drivingLicense;
	private ArrayList<EntityDriver> pendingDrivers = new ArrayList<EntityDriver>();
	
	public EntityDriver() {
		username = "";
		password = "";
		email = "";
		phoneNumber = "";
		nationalID = "";
		drivingLicense = "";
	}

	public void setUsername(String un) {
		this.username = un;
	}

	public String getUsername() {
		return username;
	}

	public void setPassaword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPhoneNumber(String pn) {
		this.phoneNumber = pn;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setEmail(String e) {
		this.email = e;
	}

	public String getEmail() {
		return email;
	}

	void setNatID(String nID) {
		this.nationalID = nID;
	};

	String getNatID() {
		return nationalID;
	};

	void setDrivingLicense(String dLicense) {
		this.drivingLicense = dLicense;
	};

	String getDrivingLicense() {
		return drivingLicense;
	}
	public ArrayList<EntityDriver> getPendingDrivers() {
		return pendingDrivers;
	}

	public void addPendingDrivers(EntityDriver d) {
		this.pendingDrivers.add(d);
	}
	

}