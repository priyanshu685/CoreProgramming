// Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the total, average, and the percentage score 

import java.util.Random;
import java.util.Scanner;

public class Ques12 {

    public static int[][] generatePCMScores(int n) {
        int[][] scores = new int[n][3];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + rand.nextInt(61);
            scores[i][1] = 40 + rand.nextInt(61);
            scores[i][2] = 40 + rand.nextInt(61);
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3];

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + scores[i][0]);
            System.out.println("Chemistry: " + scores[i][1]);
            System.out.println("Maths: " + scores[i][2]);
            System.out.println("Total: " + (int) results[i][0]);
            System.out.println("Average: " + results[i][1]);
            System.out.println("Percentage: " + results[i][2] + "%");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generatePCMScores(n);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}
