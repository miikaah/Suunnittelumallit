
package strategy;

public class Context {
    private SortStrategy strategy;
 
    public Context(SortStrategy strategy) {
        this.strategy = strategy;
    }
 
    public void executeStrategy(int a[]) {
        try {
            this.strategy.sort(a);
        } catch (Exception ex) {
            System.out.println("error " + ex.getMessage());
        }
    }
}
