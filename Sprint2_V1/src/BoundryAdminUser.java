import java.util.Scanner;

public class BoundryAdminUser extends EntityAdminUser {
	private boolean flag = true;
	public void defaultLoginAdmin(String username, String password) {

		if (username.equals("ADMIN") && password.equals("ADMIN"))
			System.out.println("Welcome Admin.");
	}

	public void LoginAdmin(String username, String password) {

		if (this.username.equals(username) && this.password.equals(password))
			System.out.println("Welcome Admin.");
		else
			System.out.println("Wrong admin username or password");

	}

	public void registerAD(String name, String password) {
		this.username = name;
		this.password = password;
		System.out.println("Successful registeration.");

	}
	public void setFlag() {
		if (varify(ed) == true) {
			this.flag = true;
		}
		else if (varify(ed) == false) {
			this.flag = false;
		}	
	}
	
	public boolean getFlag() {
		return flag;
	}

	public boolean varify(EntityDriver d2) {
		Scanner scanner = new Scanner(System.in);
		String userName = "";
		System.out.print("Enter driver name: ");
		userName = scanner.nextLine();
		if (d2.getUsername().equals(userName)) {
			varifiedDrivers.add(d2);
			System.out.println("Driver " + userName + " is varified");
			return true;
		} else {
			System.out.println("Driver is not found");
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		if (pendingDrivers.equals(null))
			return "No drivers in list \n";
		else
			return "Pending drivers: " + this.getPendingDrivers() + "\n";

	}
}
