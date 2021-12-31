import java.util.ArrayList;

public class EntityUser extends abstractUser {
	protected String username, password, email, phoneNumber;
	private ArrayList<EntityUser> users = new ArrayList<EntityUser>();

	public EntityUser() {
		username = "";
		password = "";
		email = "";
		phoneNumber = "";
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
	public ArrayList<EntityUser> getUsers() {
		return users;
	}
	public void addUsers(EntityUser u) {
		this.users.add(u);
	}
}
