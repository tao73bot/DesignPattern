package OrderSystem;

public class OrderDetail {
    private double quantity;
    private String taxStatus;
    private Item item;
    OrderDetail(double quantity, String taxStatus){
        this.quantity = quantity;
        this.taxStatus = taxStatus;
    }
    public double calcSubTotal(){
        return  item.getPriceForQuantity() * quantity + this.calcTax();
    }
    public double calcWeight(){
        return item.getShippingWeight();
    }

    public double calcTax(){
        return item.getTax();
    }
}
