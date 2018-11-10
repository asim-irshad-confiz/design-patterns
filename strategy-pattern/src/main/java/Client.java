import model.Item;
import strategy.CreditCard;
import strategy.Paypal;

/**
 * Created by Asim on 11/10/2018.
 */
public class Client {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new Paypal("abc@example.com", "mypwd"));
        cart.pay(new CreditCard("Asim Irshad", "1234567890123456", "786", "12/15"));
    }
}
