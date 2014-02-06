package decorator;

import java.util.Scanner;

public class CheckUsername extends DataDecorator {

    private String username = "username";
    private Scanner scanner = new Scanner(System.in);

    public CheckUsername(DataComponent data) {
        super(data);
    }

    @Override
    public void showData() {
        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();
        if (inputUsername.equals(username)) {
            super.showData();            
        } else {
            System.out.println("No such username");
        }
    }
}
