import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String choice;
		User u = new User();
		Driver d = new Driver();
		AdminUser au = new AdminUser();
		Notification n = new Notification();
		
	
		while (true) {
			
			System.out.println("<<WASALNY APP>>");
			System.out.println("1. Admin");
			System.out.println("2. User");
			System.out.println("3. Driver");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.next();
			
			// ADMIN
			if(choice.equals("1")) {
				
				String adminChoice;
				
				System.out.println("Default Admin username: ADMIN");
				System.out.println("Default Admin Password: ADMIN");
				au.LoginAdmin();
				
				System.out.println("press 1 to varify drivers");
				
				adminChoice = scanner.next();
				
				if (adminChoice.equals("1")) {
					
					au.varify(d);
					System.out.println("");
				}			
			}
			
			// USER
			else if (choice.equals("2")) {
				
				String userChoice;
				System.out.println("1. Signup user.");
				System.out.println("2. Login user.");
				System.out.println("3. User request ride.");
				System.out.println("4. Notify user with driver offer.");
				
				System.out.print("Enter choice: ");
				userChoice = scanner.next();
				
				// Signup
				if (userChoice.equals("1")) {
					u.signup();
					System.out.println("");
				}
				
				// login
				else if (userChoice.equals("2")) {
					u.login();
					System.out.println("");
				}
				
				// request ride
				else if (userChoice.equals("3")) {
					u.requestRide();
					System.out.println("");
				}
				
				// notify
				else if (userChoice.equals("4")) {
					n.setDriver(d);
					u.setNotifier(n);
					u.offerNotification();
					Scanner enter = new Scanner(System.in);
					String choice1;
					System.out.println("Do you accept driver's offer? (Y/N)");
					choice1 = enter.nextLine();
					while (true) {
						if (choice1.equals("Y") || choice1.equals("y")) {
							u.acceptOffer();
							break;
						} else if (choice1.equals("N") || choice1.equals("n")) {
							u.declineOffer();
							break;
						} else {
							System.out.println("Please enter (Y/N)");
							continue;
						}

					}

					System.out.println("");
				}
				
			}
			
			// DRIVER
			else if (choice.equals("3")) {

				String driverChoice;
				
				System.out.println("1. Signup driver.");				
				System.out.println("2 Login driver."); 
				System.out.println("3. Driver list favorite areas."); 
				System.out.println("4. Get driver list favorite areas.");
				System.out.println("5. Check new ride requests."); 
				System.out.println("6. Driver get source and destination locations."); 
				System.out.println("7. Notify driver with user offer."); 
				System.out.println("8. Driver enter his offer."); 
				
				System.out.print("Enter choice: ");
				driverChoice = scanner.next();
				
				if (driverChoice.equals("1")) {
					d.signup();
					System.out.println("");
				}

				else if (driverChoice.equals("2")) {
					d.login();
					System.out.println("");
				}

				else if (driverChoice.equals("3")) {
					d.setFavArea();
					System.out.println("");
				}

				else if (driverChoice.equals("4")) {
					System.out.println(d.getFavArea());
					System.out.println("");
				}

				else if (driverChoice.equals("5")) {
					n.setUser(u);
					d.setNotifier(n);
					d.RideRequests();
					System.out.println("");
				}

				else if (driverChoice.equals("6")) {
					d.setDestnation(u.getSource());
					d.setSource(u.getDestnation());
					System.out.println("[ " + d.getSource() + ", " + d.getDestnation() + " ]");
					System.out.println("");
				}

				else if (driverChoice.equals("7")) {
					n.setUser(u);
					d.setNotifier(n);
					d.offerNotification();

					Scanner enter = new Scanner(System.in);
					String choice1;
					System.out.println("Do you accept user's offer? (Y/N)");
					choice1 = enter.nextLine();
					while (true) {
						if (choice1.equals("Y") || choice1.equals("y")) {
							d.acceptOffer();
							break;
						} else if (choice1.equals("N") || choice1.equals("n")) {
							d.declineOffer();
							break;
						} else {
							System.out.println("Please enter (Y/N)");
							continue;
						}

					}

					System.out.println("");
				}

				else if (driverChoice.equals("8")) {
					
					System.out.print("Enter your offer: ");
					double offer = 0;
					offer = scanner.nextDouble();
					d.setOffer(offer);
					
				}

			}
			
			// EXIT
			else if (choice.equals("4")) {
				System.exit(0);
			}
			
			else
				System.out.println("Wrong choice enter valid choice.");
			
			
			
		}
		
		
	
		
/*
		while (true) {
			System.out.println("<<WASALNY APP>>");
			System.out.println("1. Login as Admin.");
			System.out.println("2. Signup user.");
			System.out.println("3. Signup driver.");
			System.out.println("4. Login user.");
			System.out.println("5 Login driver.");
			System.out.println("6. Varify drivers.");
			System.out.println("7. Driver list favorite areas.");
			System.out.println("8. Get driver list favorite areas.");
			System.out.println("10. User request ride.");
			System.out.println("11. Check new ride requests.");
			System.out.println("12. Driver get source and destination locations.");
			System.out.println("13. Notify driver with user offer.");
			System.out.println("14. Driver enter his offer.");
			System.out.println("15. Notify user with driver offer.");
			System.out.println("16. exit.");

			System.out.print("Enter your choice: ");
			choice = scanner.nextLine();

			if (choice.equals("1")) {
				System.out.println("Default Admin username: ADMIN");
				System.out.println("Default Admin Password: ADMIN");
				au.LoginAdmin();
				System.out.println("");
				continue;
			}

			else if (choice.equals("2")) {
				u.signup();
				System.out.println("");
				continue;
			}

			else if (choice.equals("3")) {
				d.signup();
				System.out.println("");
				continue;
			}

			else if (choice.equals("4")) {
				u.login();
				System.out.println("");
				continue;
			}

			else if (choice.equals("5")) {
				d.login();
				System.out.println("");
				continue;
			}

			else if (choice.equals("6")) {
				au.varify(d);
				System.out.println("");
				continue;
			}

			else if (choice.equals("7")) {
				d.setFavArea();
				System.out.println("");
				continue;
			}

			else if (choice.equals("8")) {
				System.out.println(d.getFavArea());
				System.out.println("");
				continue;
			}

			else if (choice.equals("10")) {
				u.requestRide();
				System.out.println("");
				continue;

			}

			else if (choice.equals("11")) {
				n.setUser(u);
				d.setNotifier(n);
				d.RideRequests();
				System.out.println("");
				continue;
			}

			else if (choice.equals("12")) {
				d.setDestnation(u.getSource());
				d.setSource(u.getDestnation());
				System.out.println("[ " + d.getSource() + ", " + d.getDestnation() + " ]");
				System.out.println("");
				continue;

			}

			else if (choice.equals("13")) {				
				n.setUser(u);
				d.setNotifier(n);
				d.offerNotification();

				Scanner enter = new Scanner(System.in);
				String choice1;
				System.out.println("Do you accept user's offer? (Y/N)");
				choice1 = enter.nextLine();
				while (true) {
					if (choice1.equals("Y")) {
						d.acceptOffer();
						break;
					} else if (choice1.equals("N")) {
						d.declineOffer();
						break;
					} else {
						System.out.println("Please enter (Y/N)");
						continue;
					}

				}

				System.out.println("");
			}

			else if (choice.equals("14")) {
				Scanner input = new Scanner(System.in);
				System.out.print("Enter your offer: ");
				double offer = 0;
				offer = input.nextDouble();
				d.setOffer(offer);

			}

			else if (choice.equals("15")) {
				n.setDriver(d);
				u.setNotifier(n);
				u.offerNotification();
				Scanner enter = new Scanner(System.in);
				String choice1;
				System.out.println("Do you accept driver's offer? (Y/N)");
				choice1 = enter.nextLine();
				while (true) {
					if (choice1.equals("Y")) {
						u.acceptOffer();
						break;
					} else if (choice1.equals("N")) {
						u.declineOffer();
						break;
					} else {
						System.out.println("Please enter (Y/N)");
						continue;
					}

				}

				System.out.println("");
			}

			else if (choice.equals("16")) {
				System.exit(0);
			}

			else
				System.out.println("Invalid choice.");

			System.out.println("");

		}
*/
	}

}
