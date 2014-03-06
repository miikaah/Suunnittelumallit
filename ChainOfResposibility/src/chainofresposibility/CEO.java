
package chainofresposibility;

public class CEO extends PayRaiser {
    
    public CEO(double mask) {
        this.mask = mask;
    }

    @Override
    protected void handlePayRaise(double newSalary) {
        System.out.println("CEO has handled your pay raise. Your new salary is: " + newSalary);
    }

    @Override
    protected void cantHandle() {
        System.out.println("CEO has run out of money.");
    }
    
}
