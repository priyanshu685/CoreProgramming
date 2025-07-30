// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
import java.util.*;
public class Ques2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = countDigits(number);
        int[] digits = extractDigits(number, count);

        System.out.println("Digit Count: " + count);
        System.out.println("Duck Number: " + isDuck(digits));
        System.out.println("Armstrong Number: " + isArmstrong(digits, number));
        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }

    static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    static int[] extractDigits(int num, int count) {
        int[] digits = new int[count];
        int index = count - 1;
        while (num > 0) {
            digits[index--] = num % 10;
            num /= 10;
        }
        return digits;
    }

    static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    static boolean isArmstrong(int[] digits, int number) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    static void findLargestAndSecondLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1) {
                max2 = d;
            }
        }
        System.out.println("Largest: " + max1 + ", Second Largest: " + max2);
    }

    static void findSmallestAndSecondSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1) {
                min2 = d;
            }
        }
        System.out.println("Smallest: " + min1 + ", Second Smallest: " + min2);
    }
}