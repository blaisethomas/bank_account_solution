/**
 * Created by blaise on 4/19/16.
 */
public class Main {
    public static void main(String[] args) {
//         create a new class for a bank account
//         create fields for the account number, balance, customer name, email and phone number
//         create all getters and setters
//         create two additional methods
//         1. to allow the customer to deposit funds(increment the balance)
//         2. to allow the customer to withdraw funds, but not become overdrawn (balance < 0)

        BankAccount blaise = new BankAccount(636, 432.51, "Blaise", "blaise@ga.co", "615-7373030");
        BankAccount noName = new BankAccount();
        System.out.println("balance : " + blaise.getBalance());
        blaise.deposit(68.49);
        blaise.withdraw(151.00);

//        create a new class VipCustomer
//        it should have 3 fields; name, creditLimit and email
//        the 1st constructor is empty and calls the constructor with 3 parameters
//        the 2nd passes on 2 values and defaults a 3rd
//        the 3rd should save all fields
//        create getters

        VipAccount blaiseVip = new VipAccount();
        VipAccount graemeVip = new VipAccount("Graeme", 100000.0, "graeme@email.com");
        VipAccount twoParams = new VipAccount("Testing", "email@lksdjf.com");
    }
}
