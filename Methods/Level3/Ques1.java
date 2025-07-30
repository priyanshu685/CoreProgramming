// Create a program to find the shortest, tallest, and mean height of players present in a football team.

import java.util.*;

public class Ques1{
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        int sum = getSum(heights);
        double mean = getMean(heights);
        int shortest = getMin(heights);
        int tallest = getMax(heights);

        System.out.println("Heights of players:");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\nShortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + mean + " cm");
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    static double getMean(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }

    static int getMin(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            if (h < min) min = h;
        }
        return min;
    }

    static int getMax(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            if (h > max) max = h;
        }
        return max;
    }
}