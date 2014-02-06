
package decorator;

public abstract class DataDecorator implements DataComponent {
    private DataComponent decoratedData;
    
    public DataDecorator(DataComponent data) {
        this.decoratedData = data;
    }

    @Override
    public void showData() {
        decoratedData.showData();
    }
    
}
