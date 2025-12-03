package BankAppProject;
public class DetailOfBank {

    private String customerName;
    private String customerAddress;
    private String customerPhone;
    private String customerEmail;
    private String customerAccNumber;
    private double customerBalance;

    public void depositFunds( double depositAmount){
        customerBalance += depositAmount;
        System.out.println("You made a Deposit = " + " NPR" + depositAmount);
        System.out.println("Your Total Balance =  " + "NPR" + customerBalance);
    }

    public void withdrawlFunds(double withdrawlAmount){
        if(customerBalance-withdrawlAmount<0){
            System.out.println("Insufficient Funds !");
        }else{
            customerBalance-=withdrawlAmount;
            System.out.println("You have Withdrawl = " + "NPR" + withdrawlAmount);
        }
    }

    public void checkCustomerBalance( double customerBalance){
        System.out.println("You have Balance =" + "NPR" + customerBalance);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAccNumber() {
        return customerAccNumber;
    }

    public void setCustomerAccNumber(String customerAccNumber) {
        this.customerAccNumber = customerAccNumber;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }
}
