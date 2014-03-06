
package chainofresposibility;

public class ChainOfResposibility {

    public static void main(String[] args) {
        PayRaiser chain = createChain();
        
        chain.raisePay(3000, 3030);
        chain.raisePay(3000, 3080);
        chain.raisePay(3000, 3300);
    }
    
    private static PayRaiser createChain() {
        PayRaiser payraiser = new Manager(PayRaiser.SMALL);
        PayRaiser payraiser1 = new Boss(PayRaiser.MEDIUM);
        payraiser.setNext(payraiser1);
        PayRaiser payraiser2 = new CEO(PayRaiser.HIGH);
        payraiser1.setNext(payraiser2);
        return payraiser;
    }
}
