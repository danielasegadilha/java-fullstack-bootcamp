package Java.Daniela.Bank.Actions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] parts = input.split(",");

        String description = parts[0];
        String date = parts[1];
        String time = parts[2];
        double value = Double.parseDouble(parts[3]);

        Transaction transaction = new Transaction(description, date, time, value);
        transaction.print();
    }
}
