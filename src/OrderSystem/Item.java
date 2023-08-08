package OrderSystem;

public class Item {
    private double shippingWeight, unitPrice;
    private boolean taxApplicable;
    private String description;

    Item(double ship, String description, double unitPrice){
        this.shippingWeight = ship;
        this.description = description;
        this.unitPrice = unitPrice;
        this.taxApplicable = true;
    }
    Item(double ship, String description, double unitPrice, boolean taxApplicable){
        this.shippingWeight = ship;
        this.description = description;
        this.unitPrice = unitPrice;
        this.taxApplicable = taxApplicable;
    }

    public double getPriceForQuantity(){
        return this.unitPrice;
    }

    public double getTax(){
        if(taxApplicable) return 0.15;
        else return 0.0;
    }

    public boolean inStock(){
        return true;
    }

    public double getShippingWeight() {
        return shippingWeight;
    }
}
