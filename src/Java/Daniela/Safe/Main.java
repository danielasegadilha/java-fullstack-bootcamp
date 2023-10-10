package Java.Daniela.Safe;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String safeType = scanner.nextLine();

        if (safeType.equalsIgnoreCase("digital")) {
            int password = scanner.nextInt();

            DigitalSafe digitalSafe = new DigitalSafe(password);
            digitalSafe.printInformation();

            int confirmPassword = scanner.nextInt();
            digitalSafe.validatePassword(confirmPassword);
            digitalSafe.printValidation(confirmPassword);
        } else {
            PhysicalSafe physicalSafe = new PhysicalSafe();
            physicalSafe.printInformation();
        }
    }
}
