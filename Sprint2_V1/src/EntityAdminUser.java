import java.util.ArrayList;

public class EntityAdminUser extends abstractUser {
	
	protected String username = "";
	protected String password = "";
	protected ArrayList<EntityDriver> pendingDrivers = new ArrayList<EntityDriver>();
	protected ArrayList<EntityDriver> varifiedDrivers = new ArrayList<EntityDriver>();
	protected EntityDriver ed = new EntityDriver();
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String passaword) {
		this.password = passaword;
	}

	public EntityDriver getD() {
		return ed;
	}

	public void setD(EntityDriver ed) {
		this.ed = ed;
	}

	public ArrayList<EntityDriver> getVarifiedDrivers() {
		return varifiedDrivers;
	}

	public void setVarifiedDrivers(ArrayList<EntityDriver> varifiedDrivers) {
		this.varifiedDrivers = varifiedDrivers;
	}

	public void setPendingDrivers() {
		this.pendingDrivers = ed.getPendingDrivers();
	}

	public ArrayList<EntityDriver> getPendingDrivers() {
		return pendingDrivers;
	}
	
	
}
