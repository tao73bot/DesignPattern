package OrderSystem.payment;

public abstract class Payment {
    private float amount;
    abstract protected void makePayment();
}
