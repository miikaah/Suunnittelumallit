

package singleton;

public enum ConcreteFactory implements AbstractFactory {

    INSTANCE;
    
    private String something = "Something";

    @Override
    public void doSomething() {
        System.out.println(something);
    }

    @Override
    public void doSomethingElse() {
        System.out.println("Something else");
    }

    @Override
    public void setSomething(String newSomething) {
        something = newSomething;
    }
    
}
