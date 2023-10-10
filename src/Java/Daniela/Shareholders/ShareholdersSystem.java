package Java.Daniela.Shareholders;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;

public class ShareholdersSystem {
    public List<String> getPerformanceAnalysis(String startDateStr, String endDateStr) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date startDate = df.parse(startDateStr);
        Date endDate = df.parse(endDateStr);

        // Simulate a database with a list of analyses:
        List<Analysis> analyses = new ArrayList<>();
        analyses.add(new Analysis(df.parse("01/01/2023"), "Financial Performance Analysis"));
        analyses.add(new Analysis(df.parse("15/02/2023"), "Risk and Exposure Analysis"));
        analyses.add(new Analysis(df.parse("31/03/2023"), "Corporate Analyses"));
        analyses.add(new Analysis(df.parse("01/04/2023"), "Policy and Regulations Analysis"));
        analyses.add(new Analysis(df.parse("15/05/2023"), "Asset Analysis"));
        analyses.add(new Analysis(df.parse("30/06/2023"), "Innovation and Technology Analysis"));

        // TODO: Implement the filter for analyses within the specified period. Hint: Create a list to store the filtered analyses and use a for loop to filter the analyses.
        List<String> filteredAnalyses = new ArrayList<>();
        for (Analysis analysis : analyses) {
            if (!analysis.date.before(startDate) && !analysis.date.after(endDate)) {
                filteredAnalyses.add(analysis.getDescription());
            }
        }

        // TODO: Return the list of filtered analyses.
        return filteredAnalyses;
    }

    class Analysis {
        Date date;
        String description;

        private Analysis(Date date, String description) {
            this.date = date;
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }
    }
}
