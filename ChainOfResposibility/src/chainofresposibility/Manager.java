
package chainofresposibility;

public class Manager extends PayRaiser {
    public Manager(double mask) {
        this.mask = mask;
    }

    @Override
    protected void handlePayRaise(double newSalary) {
        System.out.println("Manager has handled your pay raise. Your new salary is: " + newSalary);
    }

    @Override
    protected void cantHandle() {
        System.out.println("Manager has moved your pay raise issue up the chain.");
    }
}
