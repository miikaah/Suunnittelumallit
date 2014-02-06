
package decorator;

public class DataView implements DataComponent {
    private String[] data = {"Important", "data", "that", "exists", "here"};

    @Override
    public void showData() {
        for (String string : data) {
            System.out.println(string);
        }
    }
    
}
