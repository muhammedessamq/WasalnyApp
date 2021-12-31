
public class BoundryDriver extends EntityDriver implements Login {
	
	public void registerD(String name, String password, String phoneNumber, String Email, String nationalID,
			String drivingLicense) {
		// take Driver data and pass it to admin then add data to an array and pass it
		// to admin
		// then print waiting for admin response if admin varify print successful
		// register
		this.username=name;
		this.password = password;
		this.email = Email;
		this.phoneNumber = phoneNumber;
		this.nationalID = nationalID;
		this.drivingLicense = drivingLicense;
		System.out.println("Waiting for admin to varify.");
	}


	@Override
	public String toString() {
		if (this.email.equals(""))
			return "User name: " + this.username + ", No E-mail entered" + ", Phone number: " + this.phoneNumber
					+ ", National ID:" + this.getNatID() + ", Driving license id: " + this.getDrivingLicense() + "\n";
		else
			return "User name: " + this.username + ", E-mail: " + this.email + ", Phone number: " + this.phoneNumber
					+ ", National ID:" + this.getNatID() + ", Driving license id: " + this.getDrivingLicense() + "\n";

	}

	@Override
	public void login(String username, String password) {
		if (username.equals(this.getUsername()) && password.equals(this.getPassword())) {
			System.out.println("Login successful.");
		} else
			System.out.println("Wrong username or password or admin hasn't varify driver yet.");
	}
}