// Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

import java.util.Scanner;

public class Ques6 {

    static class NumberChecker {

        public static int[] findFactors(int number) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) count++;
            }

            int[] factors = new int[count];
            int index = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    factors[index++] = i;
                }
            }
            return factors;
        }

        public static int greatestFactor(int[] factors) {
            int max = factors[0];
            for (int f : factors) {
                if (f > max) max = f;
            }
            return max;
        }

        public static int sumOfFactors(int[] factors) {
            int sum = 0;
            for (int f : factors) {
                sum += f;
            }
            return sum;
        }

        public static long productOfFactors(int[] factors) {
            long product = 1;
            for (int f : factors) {
                product *= f;
            }
            return product;
        }

        public static double productOfCubes(int[] factors) {
            double product = 1;
            for (int f : factors) {
                product *= Math.pow(f, 3);
            }
            return product;
        }

        public static boolean isPerfect(int number) {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return sum == number;
        }

        public static boolean isAbundant(int number) {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return sum > number;
        }

        public static boolean isDeficient(int number) {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return sum < number;
        }

        public static boolean isStrong(int number) {
            int temp = number;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp /= 10;
            }
            return sum == number;
        }

        public static int factorial(int n) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = NumberChecker.findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + NumberChecker.greatestFactor(factors));
        System.out.println("Sum of Factors: " + NumberChecker.sumOfFactors(factors));
        System.out.println("Product of Factors: " + NumberChecker.productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + NumberChecker.productOfCubes(factors));

        System.out.println("Is Perfect Number? " + (NumberChecker.isPerfect(number) ? "Yes" : "No"));
        System.out.println("Is Abundant Number? " + (NumberChecker.isAbundant(number) ? "Yes" : "No"));
        System.out.println("Is Deficient Number? " + (NumberChecker.isDeficient(number) ? "Yes" : "No"));
        System.out.println("Is Strong Number? " + (NumberChecker.isStrong(number) ? "Yes" : "No"));

    }
}
