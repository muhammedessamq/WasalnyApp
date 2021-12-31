import java.util.Scanner;

public class ControllerDriver extends EntityDriver  {
	
	public void driverController() {
		
		BoundryDriver bd = new BoundryDriver();
		BoundryAdminUser bau = new BoundryAdminUser();
		System.out.println("1. Register.");
		System.out.println("2. Login.");
		Scanner scanner = new Scanner(System.in);
		String Dchoice = "";
		System.out.print("Enter choice: ");
		Dchoice = scanner.nextLine();

		if (Dchoice.equals("1")) {
			System.out.print("Enter username: ");
			username = scanner.nextLine();

			System.out.print("Enter your password: ");
			password = scanner.nextLine();

			System.out.print("Enter E-mail(Optional): ");
			email = scanner.nextLine();

			System.out.print("Enter phone number: ");
			phoneNumber = scanner.nextLine();

			System.out.print("Enter national id: ");
			nationalID = scanner.nextLine();

			System.out.print("Enter driving license id: ");
			drivingLicense = scanner.nextLine();

			bd.registerD(username, password, phoneNumber, email, nationalID, drivingLicense );
			bd.addPendingDrivers(bd);
		} else if (Dchoice.equals("2")) {
			if(bau.getFlag() == true) {
				System.out.print("Enter username: ");
				username = scanner.nextLine();

				System.out.print("Enter your password: ");
				password = scanner.nextLine();
				bd.login(username, password);
				
			}
			else 
				System.out.println("Admin didn't verify driver yet");
		}
	} 
}