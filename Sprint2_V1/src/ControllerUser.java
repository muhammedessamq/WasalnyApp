import java.util.Scanner;

public class ControllerUser extends EntityUser {
	
	public void userController() {
		
		BoundryUser bu = new BoundryUser();
		
		System.out.println("1. Register.");
		System.out.println("2. Login.");
		Scanner scanner = new Scanner(System.in);
		String uchoice = "";
		System.out.print("Enter choice: ");
		uchoice = scanner.nextLine();

		if (uchoice.equals("1")) {
			System.out.print("Enter username: ");
			username = scanner.nextLine();

			System.out.print("Enter your password: ");
			password = scanner.nextLine();

			System.out.print("Enter E-mail(Optional): ");
			email = scanner.nextLine();

			System.out.print("Enter phone number: ");
			phoneNumber = scanner.nextLine();

			bu.registerU(username, password, phoneNumber, email);
			bu.addUsers(bu);
			
		} else if (uchoice.equals("2")) {
			System.out.print("Enter username: ");
			username = scanner.nextLine();

			System.out.print("Enter your password: ");
			password = scanner.nextLine();

			bu.login(username, password);
		}
	}
}
