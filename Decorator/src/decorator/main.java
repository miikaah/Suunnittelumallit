
package decorator;

public class main {

    public static void main(String[] args) {
        DataComponent data = new DataView();
        data.showData();
        
        data = new CheckUsername(new CheckPassword(new DataView()));
        data.showData();
    }
    
}
