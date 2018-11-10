import model.Item;
import strategy.Payment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asim on 11/10/2018.
 */
public class ShoppingCart {

    List<Item> items;

    public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(Payment paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
