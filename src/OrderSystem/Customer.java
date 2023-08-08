package OrderSystem;

import java.util.Set;

public class Customer {
    private String name, address;

    private Order checkoutOrder ;
    Customer(String name, String address){
        this.name = name;
        this.address = address;
    }

    Customer(String name, String address, Order order){
        this.name = name;
        this.address = address;
        this.checkoutOrder = order;
    }

    public void placeOrder(){
        if (this.checkoutOrder == null)
            System.out.println("You have not selected any items");
        else {
            System.out.println("You can continue to payment");
            checkoutOrder.checkout();
        }
    }
}
