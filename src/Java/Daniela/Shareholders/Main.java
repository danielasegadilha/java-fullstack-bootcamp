package Java.Daniela.Shareholders;

import java.util.Scanner;
import java.text.ParseException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        // Read input data as described in this Challenge.
        Scanner scanner = new Scanner(System.in);
        String startDate = scanner.nextLine();
        String endDate = scanner.nextLine();

        ShareholdersSystem shareholdersSystem = new ShareholdersSystem();
        List<String> analyses = shareholdersSystem.getPerformanceAnalysis(startDate, endDate);

        for (String analysis : analyses) {
            System.out.println(analysis);
        }
    }
}