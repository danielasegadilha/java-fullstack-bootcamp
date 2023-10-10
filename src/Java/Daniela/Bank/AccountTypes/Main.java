package Java.Daniela.Bank.AccountTypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Read input data:
        Scanner scanner = new Scanner(System.in);
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after entering the account number
        String accountHolderName = scanner.nextLine();
        double balance = scanner.nextDouble();

        // Create an instance of "BankAccount" with the input values.
        BankAccount bankAccount = new BankAccount(accountNumber, accountHolderName, balance);
        bankAccount.printInformation();
        // Print the account information using the object created above.
    }
}
