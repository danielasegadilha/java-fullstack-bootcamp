package Java.Daniela.Bank.AccountTypes;

import java.text.DecimalFormat;
public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void printInformation() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println("Information:");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: $ " + decimalFormat.format(getBalance()));
    }
}
