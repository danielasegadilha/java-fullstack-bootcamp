package Java.Daniela.Bank.Actions;

import java.text.DecimalFormat;

class Transaction {
    private String date;
    private String time;
    private String description;
    private double value;

    public Transaction(String date, String time, String description, double value) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.value = value;
    }

    public void print() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        System.out.print(this.description + "\n" + this.date + "\n" + this.time + "\n" + decimalFormat.format(this.value));
    }

}
