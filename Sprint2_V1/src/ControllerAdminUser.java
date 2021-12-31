import java.util.Scanner;

public class ControllerAdminUser extends EntityAdminUser{
	public void adminUserController() {
		
		EntityAdminUser au = new EntityAdminUser();
		BoundryAdminUser bau = new BoundryAdminUser();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Default Admin username: ADMIN");
		System.out.println("Default Admin Password: ADMIN");

		System.out.println("1. Register with default admin.");	
		System.out.println("2. Register with new admin.");	
		
		String auChoice = "";
		System.out.print("Enter Choice: ");
		auChoice = scanner.nextLine();
		
		if (auChoice.equals("1"))
			bau.defaultLoginAdmin("ADMIN", "ADMIN");
		
		else if(auChoice.equals("2")) {
			System.out.print("Enter username: ");
			username = scanner.nextLine();
			System.out.println("Enter password: ");
			password = scanner.nextLine();
			bau.LoginAdmin(username, password);		
		}

		System.out.println("1. List pending drivers.");
		System.out.println("2. Varify drivers.");

		String auChoice1 = "";
		System.out.print("Enter choice: ");
		auChoice1 = scanner.nextLine();

		if (auChoice1.equals("1")) {
			System.out.println(au.getPendingDrivers());
		}
		
		if (auChoice1.equals("2")) {
			bau.varify(ed);
		}
	}
}
