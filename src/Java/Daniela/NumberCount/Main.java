package Java.Daniela.NumberCount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.print("Informe o primeiro parâmetro: ");
        int firstParameter = terminal.nextInt();
        System.out.print("Informe o segundo parâmetro: ");
        int secondParameter = terminal.nextInt();

        try {
            Counter.count(firstParameter, secondParameter);
        } catch (InvalidParametersException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}