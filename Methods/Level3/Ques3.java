// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
import java.util.*;
public class Ques3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = countDigits(number);
        int[] digits = extractDigits(number, count);

        System.out.println("Input Number: " + number);
        System.out.println("Digit Count: " + count);

        int sum = sumOfDigits(digits);
        int squareSum = sumOfSquares(digits);

        System.out.println("Sum of Digits: " + sum);
        System.out.println("Sum of Squares of Digits: " + squareSum);
        System.out.println("Harshad Number: " + (isHarshad(number, sum) ? "Yes" : "No"));

        int[][] freq = getDigitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int[] freq1 : freq) {
            if (freq1[1] > 0) {
                System.out.println("Digit " + freq1[0] + " -> " + freq1[1] + " time(s)");
            }
        }
    }

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] extractDigits(int num, int count) {
        int[] digits = new int[count];
        int index = count - 1;
        while (num > 0) {
            digits[index--] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number, int digitSum) {
        return number % digitSum == 0;
    }

    public static int[][] getDigitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // [digit][0->digit, 1->count]

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }
}