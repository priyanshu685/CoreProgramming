// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

import java.util.Scanner;

public class Ques4{

    public static int countDigits(int number){
        return String.valueOf(number).length();
    }

    public static int[] extractDigits(int number, int count){
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr){
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = extractDigits(number, count);

        System.out.println("Digit Count: " + count);

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int[] reversed = reverseArray(digits);
        System.out.print("Reversed Digits: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Is Palindrome? " + (isPalindrome(digits) ? "Yes" : "No"));
        System.out.println("Is Duck Number? " + (isDuckNumber(digits) ? "Yes" : "No"));
    }
}
