
public class BoundryUser extends EntityUser implements Login{
	
	public void registerU(String name, String password, String phoneNumber, String Email) {
		// take user data and save it in a database then print successful register
		this.username = name;
		this.password = password;
		this.email = Email;
		this.phoneNumber = phoneNumber;
		System.out.println("Successful registeration.");
	};

	
	@Override
	public String toString() {
		if (this.email.equals(""))
			return "User name: " + this.username + ", No E-mail entered" + ", Phone number: " + this.phoneNumber + "\n";
		else
			return "User name: " + this.username + ", E-mail: " + this.email + ", Phone number: "
					+ this.phoneNumber +"\n";

	}

	@Override
	public void login(String username, String password) {
		if (username.equals(this.getUsername()) && password.equals(this.getPassword())) {
			System.out.println("Login successful.");
		} else
			System.out.println("Wrong username or password.");

	}
}
