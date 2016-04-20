/**
 * Created by blaise on 4/19/16.
 */
public class BankAccount {
    // create fields for the account number, balance, customer name, email and phone number
    // create all getters and setters
    // create two additional methods
    // 1. to allow the customer to deposit funds(increment the balance)
    // 2. to allow the customer to withdraw funds, but not become overdrawn (balance < 0)

    private int number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(int number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        double current = getBalance();
        setBalance(current + depositAmount);
        System.out.println("Thank you for your " + depositAmount + " deposit. Your new balance is " + getBalance());
    }

    public void withdraw(double withdrawalAmount){
        double current = getBalance();
        if (current < withdrawalAmount){
            System.out.println("you have insufficient funds");
        } else {
            setBalance(current - withdrawalAmount);
            System.out.println(withdrawalAmount + " withdrawn, current balance : " + getBalance());
        }
    }
}
