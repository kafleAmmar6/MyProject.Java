/*package BankAppProject;
import java.util.*;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DetailOfBank customerAccount = new DetailOfBank();

        System.out.println("########  WELCOME TO AMMAR'S BANK LIMITED  ########");

        System.out.println("\t\t\t\tLOGIN AND SIGN-UP PAGE");
        System.out.println("1. Sign-up");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Enter the Option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("\t\t\t\t<<<<<<<<<<<<<  SIGN-UP PAGE  >>>>>>>>>>>\n");
                System.out.println("Please give your Correct Information For Us");

                try {
                    System.out.print("Enter Customer Name: ");
                    String customerName = sc.nextLine();
                    if (customerName.trim().isEmpty()) throw new BankAccountException("Name cannot be empty!");
                    if (!customerName.matches("[a-zA-Z ]+")) throw new BankAccountException("Name cannot be numeric!");

                    System.out.print("Enter Customer Address: ");
                    String customerAddress = sc.nextLine();
                    if (customerAddress.trim().isEmpty()) throw new BankAccountException("Address cannot be empty!");

                    System.out.print("Enter Customer Phone Number: ");
                    String customerPhone = sc.nextLine();
                    if (!customerPhone.matches("\\d{10}")) throw new BankAccountException("Phone number must be 10 digits!");

                    System.out.print("Enter Customer E-mail: ");
                    String customerEmail = sc.nextLine();
                    if (!customerEmail.contains("@gmail.com")) throw new BankAccountException("Invalid email format!");

                    System.out.println("\n\nYou are Successfully Registered.");

                    // CHOOSE ACCOUNT TYPE
                    String customerAccountType = "";
                    do {
                        System.out.println("\nPlease Select Account Type:");
                        System.out.println("1. Savings Account");
                        System.out.println("2. Current Account");
                        System.out.println("3. Fixed Deposit Account");
                        System.out.print("Enter option from 1 to 3 = ");
                        choice = sc.nextInt();
                        sc.nextLine();

                        switch (choice) {
                            case 1: customerAccountType = "SAVING ACCOUNT"; break;
                            case 2: customerAccountType = "CURRENT ACCOUNT"; break;
                            case 3: customerAccountType = "FIXED DEPOSIT ACCOUNT"; break;
                            default:
                                System.out.println("❌ Invalid choice! Please choose 1 to 3.");
                        }
                    } while (customerAccountType.isEmpty());

                    // Generate account number
                    String accNumber = "1000000000000000";
                    customerAccount.customerAccNumber(accNumber, customerAccountType);

                    System.out.println("\n\nYour " + customerAccountType.toLowerCase() + " is Successfully Created!!");

                    // Banking operations
                    do {
                        System.out.println("\nChoose an option:");
                        System.out.println("1 = Deposit");
                        System.out.println("2 = Withdrawal");
                        System.out.println("3 = Check Balance");
                        System.out.println("4 = Show Statement");
                        System.out.println("4 = Exit");
                        System.out.print("Enter choice: ");
                        choice = sc.nextInt();
                        sc.nextLine();

                        switch (choice) {
                            case 1:
                                System.out.print("Enter deposit amount: ");
                                double depositAmount = sc.nextDouble();
                                customerAccount.depositFunds(depositAmount);
                                break;
                            case 2:
                                System.out.print("Enter withdrawal amount: ");
                                double withdrawalAmount = sc.nextDouble();
                                customerAccount.withdrawlFunds(withdrawalAmount);
                                break;
                            case 3:
                                customerAccount.checkCustomerBalance(customerAccount.getCustomerBalance());
                                break;
                            case 4:
                                System.out.println("Our Application is Closed. Thanks for visiting!");
                                break;
                            default:
                                System.out.println("❌ Invalid choice! Please choose 1 to 4.");
                        }
                    } while (choice != 4);

                } catch (BankAccountException e) {
                    System.out.println("\n❌ Error: " + e.getMessage());
                    System.out.println("Please enter correct information. Thank you!");
                }
                break;
            case 2:
                System.out.println("\t\t\t\t<<<<<<<<<<<<<  LOGIN PAGE  >>>>>>>>>>>");
                break;
            case 3:
                System.out.println("Thanks for using the App!");
                break;
            default:
                System.out.println("❌ Invalid option! Please choose 1 to 3.");
                System.exit(0);
        }
        sc.close();
    }
}*/