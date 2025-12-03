package BankAppProject;
import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DetailOfBank customerAccount = new DetailOfBank();

//CUSTOMER DETAIL AND EXCEPTIONAL CASE

        String customerName;
        try {
            System.out.print("Enter Customer Name: ");
            customerName = sc.nextLine();
            if (customerName.trim().isEmpty()) {
                throw new BankAccountException("Name cannot be empty!");
            }else if( !customerName.matches("[a-zA-Z ]+")){
                throw new BankAccountException("Name cannot be Numeric");
            }

            System.out.print("Enter Customer Address: ");
            String customerAddress = sc.nextLine();
            if (customerAddress.trim().isEmpty()) {
                throw new BankAccountException("Address cannot be empty!");
            }

            System.out.print("Enter Customer Phone Number: ");
            String customerPhone = sc.nextLine();
            if (!customerPhone.matches("\\d{10}")) {
                throw new BankAccountException("Phone number must be 10 digits!");
            }

            System.out.print("Enter Customer E-mail: ");
            String customerEmail = sc.nextLine();
            if (!customerEmail.contains("@gmail.com")) {
                throw new BankAccountException("Invalid email format!");
            }

            //CHOICE FOR BANK TYPE AFTER VALIDATING THE CUSTOMER
            boolean BankAccountException = true;
            if (BankAccountException == true) {
                System.out.println("\nChoose Account Type:");
                System.out.println("1. Savings Account");
                System.out.println("2. Current Account");
                System.out.println("3. Fixed Deposit Account");
                System.out.print("Enter option from 1 to 3 = ");
                int choice = sc.nextInt();
                String customerAccountType = "";

                switch (choice) {
                    case 1:
                        customerAccountType = "SAVING ACCOUNT";
                        break;

                    case 2:
                        customerAccountType = "CURRENT ACCOUNT";
                        break;

                    case 3:
                        customerAccountType = "FIXED DEPOSIT ACCOUNT";
                        break;

                    default:
                        System.out.println("Invalid option! Please choose option from 1 to 3.");
                }

                System.out.println("Selected Account Type: " + customerAccountType);
            } else {
                System.out.println("\n⚠ Account type selection skipped due to invalid details.");
            }

        } catch (BankAccountException e) {
            System.out.println("\n❌ Error: " + e.getMessage());
            System.out.println("Please enter correct information. Thank you!");
        }


    }
}
