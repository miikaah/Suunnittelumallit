package decorator;

import java.util.Scanner;

public class CheckPassword extends DataDecorator {

    private String password = "password";
    private Scanner scanner = new Scanner(System.in);

    public CheckPassword(DataComponent data) {
        super(data);
    }

    @Override
    public void showData() {
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();
        if (inputPassword.equals(password)) {
            super.showData();
        } else {
            System.out.println("Incorrect password");
        }
    }
}
