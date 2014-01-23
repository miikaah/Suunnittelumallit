
package pkgabstract.factory;

public class AbstractFactory {

    public static void main(String[] args) {
        Jasper jasper = new Jasper(new BossFactory());
        System.out.println(jasper);
    }
    
}
