package OrderSystem;

import OrderSystem.payment.Cash;
import OrderSystem.payment.Check;
import OrderSystem.payment.Credit;
import OrderSystem.payment.Payment;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private String date, status;
    private ArrayList<OrderDetail> cart;
    private Payment payment;
    Order(ArrayList<OrderDetail> cart, String date, String status){
        this.cart.equals(cart);
        this.date = date;
        this.status = status;
    }
    Order(ArrayList<OrderDetail> cart, String date){
        this.cart.equals(cart);
        this.date = date;
        this.status = "Checkout";
    }
    public double calcTax(){
        return 1.1;
    }
    public double calcTotal(){
        double total = 0;
        for (OrderDetail oD: cart) {
            total += oD.calcSubTotal();
        }
        return total;
    }
    public double calcTotalWeight(){
        double weight = 0;
        for (OrderDetail oD: cart) {
            weight += oD.calcWeight();
        }
        return weight;
    }
    public void checkout(){
        int var;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the payment method you will be using...");
        System.out.println("1. Cash");
        System.out.println("2. Credit Card");
        System.out.println("3. Check");
        System.out.println("4. Cancel");


        while (true){
            var = sc.nextInt();
            if(var == 1) {
                payment = new Cash();
                break;
            }
            else if (var == 2) {
                payment = new Credit();
                break;
            }
            else if (var == 3) {
                payment = new Check();
                break;
            }
            else if (var == 4) {
                System.out.println("Payment Cancelled");
                break;
            }
            else {
                System.out.println("invalid input");
            }
        }
    }
}
