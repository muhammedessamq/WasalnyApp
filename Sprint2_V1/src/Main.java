import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityUser u = new EntityUser();
		ControllerUser cu = new ControllerUser();
		EntityDriver ed = new EntityDriver();
		ControllerDriver cd = new ControllerDriver();
		EntityAdminUser au = new EntityAdminUser();
		ControllerAdminUser cau = new ControllerAdminUser();
		au.setD(ed);

		Scanner scanner = new Scanner(System.in);
		String choice = "";
		System.out.println("<<WASALNY APP>>");
		while (true) {
			System.out.println("1. Admin");
			System.out.println("2. User");
			System.out.println("3. Driver");
			System.out.println("4. Exit");

			System.out.print("Enter choice: ");
			choice = scanner.nextLine();

			//ADMIN USER
			if (choice.equals("1")) {
				cau.adminUserController();
			}
			
			//USER USER
			if (choice.equals("2")) {
				cu.userController();
			}

			//DRIVER USER
			else if (choice.equals("3")) {
				cd.driverController();
				
			}
			 //EXIT
			 else if (choice.equals("4"))
				break;
		}
	}

}