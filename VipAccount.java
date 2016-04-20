/**
 * Created by blaise on 4/20/16.
 */
public class VipAccount {
//        create a new class VipCustomer
//        it should have 3 fields; name, creditLimit and email
//        the 1st constructor is empty and calls the constructor with 3 parameters
//        the 2nd passes on 2 values and defaults a 3rd
//        the 3rd should save all fields
//        create getters
    private String name;
    private double creditLimit;
    private String email;

    public VipAccount(){
        this("vip not known", 500.0, "no email");
    }

    public VipAccount(String email, String name) {
        this(name, 1000.0, email);
    }

    public VipAccount(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
