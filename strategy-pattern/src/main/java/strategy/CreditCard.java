package strategy;

/**
 * Created by Asim on 11/10/2018.
 */
public class CreditCard implements Payment {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCard(String nm, String ccNum, String cvv, String expiryDate){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}
