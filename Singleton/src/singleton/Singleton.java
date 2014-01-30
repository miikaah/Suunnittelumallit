
package singleton;

public class Singleton {

    public static void main(String[] args) {
        AbstractFactory factory = ConcreteFactory.INSTANCE;
        factory.doSomething();
        factory.doSomethingElse();
        factory.setSomething("Something has changed!");
        
        AbstractFactory secondFactory = ConcreteFactory.INSTANCE;
        secondFactory.doSomethingElse();
        secondFactory.doSomething();
    }
    
}
