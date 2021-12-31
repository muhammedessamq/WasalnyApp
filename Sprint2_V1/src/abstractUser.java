import java.util.ArrayList;

public abstract class abstractUser {
	private String username, password, email, phoneNumber;
	private ArrayList<EntityUser> users = new ArrayList<EntityUser>();
	private ArrayList<EntityDriver> pindingDrivers = new ArrayList<EntityDriver>();
	private ArrayList<EntityDriver> varifiedDrivers = new ArrayList<EntityDriver>();

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
	};

	String getNatID() {
		return null;
	};

	void setDrivingLicense(String dLicense) {
	};

	String getDrivingLicense() {
		return null;
	};

	void registerU(String name, String password, String phoneNumber, String Email) {

	}

	void registerD(String name, String password, String phoneNumber, String Email, String nationalID,
			String drivingLicense) {

	}

	void registerAD(String name, String password) {

	}

	public ArrayList<EntityUser> getUsers() {
		return users;
	}

	public void addUsers(EntityUser u) {
		this.users.add(u);
	}

	public ArrayList<EntityDriver> getPendingDrivers() {
		return pindingDrivers;
	}

	public void addPendingDrivers(EntityDriver d) {
		this.pindingDrivers.add(d);
	}

	public ArrayList<EntityDriver> getVarifiedDrivers() {
		return varifiedDrivers;
	}

	public void setVarifiedDrivers(ArrayList<EntityDriver> varifiedDrivers) {
		this.varifiedDrivers = varifiedDrivers;
	}
}
