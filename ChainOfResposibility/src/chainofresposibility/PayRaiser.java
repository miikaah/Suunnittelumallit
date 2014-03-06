package chainofresposibility;

public abstract class PayRaiser {

    public static final double SMALL = 1.99;
    public static final double MEDIUM = 4.99;
    public static final double HIGH = 10000.0;
    protected double mask;
    protected PayRaiser next;

    public void setNext(PayRaiser pr) {
        this.next = pr;
    }

    public void raisePay(double oldSalary, double newSalary) {
        double percentage = (newSalary - oldSalary) / oldSalary * 100;

        if (percentage < mask) {
            handlePayRaise(newSalary);          
        } else {
            if (next != null) {
                cantHandle();
                next.raisePay(oldSalary, newSalary);
            }
        }
    }

    abstract protected void handlePayRaise(double newSalary);
    abstract protected void cantHandle();
}
