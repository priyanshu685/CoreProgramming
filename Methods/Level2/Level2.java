import java.util.*;
public class Level2{
    // 1. Factors of a Number
    // public static int[] getFactors(int n) {
    //     int count = 0;
    //     for (int i = 1; i <= n; i++) if (n % i == 0) count++;
    //     int[] factors = new int[count];
    //     int index = 0;
    //     for (int i = 1; i <= n; i++) if (n % i == 0) factors[index++] = i;
    //     return factors;
    // }
    // public static int sum(int[] arr) {
    //     int sum = 0;
    //     for (int i : arr) sum += i;
    //     return sum;
    // }
    // public static int product(int[] arr) {
    //     int product = 1;
    //     for (int i : arr) product *= i;
    //     return product;
    // }
    // public static double sumOfSquares(int[] arr) {
    //     double sum = 0;
    //     for (int i : arr) sum += Math.pow(i, 2);
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] factors = getFactors(n);
    //     for (int i : factors) System.out.print(i + " ");
    //     System.out.println("\nSum = " + sum(factors));
    //     System.out.println("Product = " + product(factors));
    //     System.out.println("Sum of squares = " + sumOfSquares(factors));
    // }


    // 2. Sum of N Natural Numbers (Recursion vs Formula)
    // public static int recursiveSum(int n) {
    //     if (n == 1) return 1;
    //     return n + recursiveSum(n - 1);
    // }
    // public static int formulaSum(int n) {
    //     return n * (n + 1) / 2;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     if (n <= 0) {
    //         System.out.println("Not a natural number");
    //         return;
    //     }
    //     int recSum = recursiveSum(n);
    //     int formSum = formulaSum(n);
    //     System.out.println("Recursive Sum: " + recSum);
    //     System.out.println("Formula Sum: " + formSum);
    // }
    
    // 3. Leap Year Checker
    public static boolean isLeapYear(int year) {
        return year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");
    }

    // 4. Unit Converter - Distance
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }
    
    // 5. Unit Converter - Length
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }
    
    // 6. Unit Converter - Temperature, Mass, Volume
    public static double convertFarhenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double convertCelsiusToFarhenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    
    // 7. Voting Eligibility
    // public static boolean canStudentVote(int age) {
    //     if (age < 0) return false;
    //     return age >= 18;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int[] ages = new int[10];
    //     for (int i = 0; i < 10; i++) {
    //         ages[i] = sc.nextInt();
    //         System.out.println(canStudentVote(ages[i]) ? "Can vote" : "Cannot vote");
    //     }
    // }
    
    // 8. Youngest and Tallest Among Friends
    public static int getYoungestIndex(int[] ages) {
        int min = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[min]) min = i;
        }
        return min;
    }
    public static int getTallestIndex(double[] heights) {
        int max = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[max]) max = i;
        }
        return max;
    }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int[] ages = new int[3];
    //     double[] heights = new double[3];
    //     for (int i = 0; i < 3; i++) {
    //         ages[i] = sc.nextInt();
    //         heights[i] = sc.nextDouble();
    //     }
    //     String[] names = {"Amar", "Akbar", "Anthony"};
    //     System.out.println("Youngest: " + names[getYoungestIndex(ages)]);
    //     System.out.println("Tallest: " + names[getTallestIndex(heights)]);
    // }


    // 9. Number Classification and Comparison
    public static boolean isPositive(int n) {
        return n >= 0;
    }
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int[] nums = new int[5];
    //     for (int i = 0; i < 5; i++) {
    //         nums[i] = sc.nextInt();
    //         if (isPositive(nums[i])) {
    //             System.out.println("Positive " + (isEven(nums[i]) ? "Even" : "Odd"));
    //         } else {
    //             System.out.println("Negative");
    //         }
    //     }
    //     int cmp = compare(nums[0], nums[4]);
    //     if (cmp == 0) {System.out.println("First and last are equal");
    //     else if (cmp == 1) System.out.println("First is greater");
    //     else System.out.println("Last is greater");
    // }

    // 10. BMI Calculator
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }
    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     double[][] data = new double[10][3];
    //     String[] status = new String[10];
    //     for (int i = 0; i < 10; i++) {
    //         double weight = sc.nextDouble();
    //         double height = sc.nextDouble();
    //         double bmi = calculateBMI(weight, height);
    //         data[i][0] = weight;
    //         data[i][1] = height;
    //         data[i][2] = bmi;
    //         status[i] = getStatus(bmi);
    //     }
    //     for (int i = 0; i < 10; i++) {
    //         System.out.println("Person " + (i+1) + " Weight: " + data[i][0] + " Height: " + data[i][1] + " BMI: " + data[i][2] + " Status: " + status[i]);
    //     }
    // }


    // 11. Quadratic Equation Roots
    public static void findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Roots: " + r1 + ", " + r2);
        } else if (delta == 0) {
            double r = -b / (2 * a);
            System.out.println("Single root: " + r);
        } else {
            System.out.println("No real roots");
        }
    }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     double a = sc.nextDouble();
    //     double b = sc.nextDouble();
    //     double c = sc.nextDouble();
    //     findRoots(a, b, c);
    // }
    
    // 12. 4-Digit Random Numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return new double[]{(double) sum / numbers.length, min, max};
    }
    // public static void main(String[] args) {
    //     int[] arr = generate4DigitRandomArray(5);
    //     for (int i : arr) System.out.print(i + " ");
    //     System.out.println();
    //     double[] result = findAverageMinMax(arr);
    //     System.out.println("Avg: " + result[0] + " Min: " + result[1] + " Max: " + result[2]);
    // }
}