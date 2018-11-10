package strategy;

/**
 * Created by Asim on 11/10/2018.
 */
public class Paypal implements Payment {

    private String emailId;
    private String password;

    public Paypal(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
