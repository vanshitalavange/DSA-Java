//  Question link: https://leetcode.com/problems/maximum-population-year/
package arrays.easy;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = new int[][] {
                { 1993, 1999 },
                { 2000, 2010 }
        };
        System.out.println("Ouptut: " + maximumPopulation(logs));
    }

    public static int maximumPopulation(int[][] logs) {
        int populationCount = 0;
        int currentYear = 0;
        int earliestYear = 0;
        int prevPopulationCount = 0;
        for (int i = 0; i < logs.length; i++) {
            for (int j = 0; j < logs[i].length; j++) {
                currentYear = logs[i][j];
                populationCount = checkPopulationInYear(currentYear, logs);
                if (populationCount > prevPopulationCount) {
                    earliestYear = currentYear;
                    prevPopulationCount = populationCount;
                } else if (populationCount == prevPopulationCount) {
                    if (currentYear < earliestYear) {
                        earliestYear = currentYear;
                    }
                }
            }
        }
        return earliestYear;
    }

    public static int checkPopulationInYear(int year, int[][] logs) {
        int count = 0;
        for (int i = 0; i < logs.length; i++) {
            int birthYear = logs[i][0];
            int deathYear = logs[i][1];
            if (year >= birthYear && year < deathYear) {
                count++;
            }
        }
        return count;
    }
}
