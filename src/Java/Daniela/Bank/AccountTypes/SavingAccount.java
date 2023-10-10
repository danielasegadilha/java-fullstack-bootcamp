package Java.Daniela.Bank.AccountTypes;

import java.text.DecimalFormat;

public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayInfo() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println("Savings Account:");
        super.printInformation();
        System.out.println("Interest Rate: " + decimalFormat.format(interestRate) + "%");
    }
}
