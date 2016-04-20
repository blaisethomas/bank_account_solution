/**
 * Created by blaise on 4/20/16.
 */
//        create a new class VipCustomer
//        it should have 3 fields; name, creditLimit and email
//        the 1st constructor is empty and calls the constructor with 3 parameters
//        the 2nd passes on 2 values and defaults a 3rd
//        the 3rd should save all fields
//        create getters

public class VipAccount extends BankAccount {

    private double creditLimit;

    public VipAccount(int number, double balance, String customerName, String email, String phoneNumber){
        super(number, balance, customerName, email, phoneNumber);
        creditLimit = 1000d;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public void withdraw(double withdrawalAmount) {
        if (getBalance() + getCreditLimit() < withdrawalAmount) {
            System.out.println("Insufficient Funds exceeded limit");
        }
        else {
            setBalance(getBalance() - withdrawalAmount);
            System.out.println("Transaction completed, new account balance is: " + getBalance());
        }
    }
}