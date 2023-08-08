package OrderSystem.payment;

public class Check extends Payment{
    private String name, bankID;
    public boolean authorized(){
        return true;
    }

    @Override
    protected void makePayment() {
        if(authorized())
            System.out.println("Payment done using Check");
        else
            System.out.println("Check declined");
    }
}
