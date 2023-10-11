package Java.Daniela.Counter;

public class Counter {
    public static void count(int firstParameter, int secondParameter) throws InvalidParametersException {
        if (firstParameter > secondParameter) {
            int count = firstParameter - secondParameter;
            for (int number = 1; number <= count; number++) {
                System.out.println("Número " + number);
            }
        } else {
            throw new InvalidParametersException("Os parâmetros estão inválidos: primeiro parâmetro maior que o segundo.");
        }
    }
}
