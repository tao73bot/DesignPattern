package OrderSystem.payment;

public class Credit extends Payment{
    private String number,type, expDate;
    public boolean authorized(){
        return true;
    }

    @Override
    protected void makePayment() {
        if (authorized())
            System.out.println("Payment done using Credit Card");
        else
            System.out.println("Card is declined");
    }
}
