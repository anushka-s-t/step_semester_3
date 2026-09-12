public class GridAnalyzer {
    // Private helper method to compute average for a single row
    private static double rowAverage(int[] row) {
        if (row.length == 0) return 0.0;
        double sum = 0;
        for (int runs : row) {
            sum += runs;
        }
        return sum / row.length;
    }

    static String classifyMatches(int[][] runsPerOver, int threshold) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < runsPerOver.length; i++) {
            double average = rowAverage(runsPerOver[i]);
            String classification = (average >= threshold) ? "Power Surge" : "Normal";
            
            result.append("Match ").append(i).append(": ").append(classification);
            
            // Add a visual separator if it's not the last element
            if (i < runsPerOver.length - 1) {
                result.append(" | ");
            }
        }

        return result.toString();
    }
}
