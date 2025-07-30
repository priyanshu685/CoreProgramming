import java.util.Scanner;
public class Level1{

    // 1. Simple Interest
    // public static double calculateSimpleInterest(double principal, double rate, double time) {
    //     return (principal * rate * time) / 100;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     double principal = sc.nextDouble();
    //     double rate = sc.nextDouble();
    //     double time = sc.nextDouble();
    //     double si = calculateSimpleInterest(principal, rate, time);
    //     System.out.println("The Simple Interest is " + si + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    // }

    // 2. Maximum numbers of handshakes
    // public static int calculateHandshakes(int n) {
    //     return (n * (n - 1)) / 2;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int numberOfStudents = sc.nextInt();
    //     int handshakes = calculateHandshakes(numberOfStudents);
    //     System.out.println("Maximum number of handshakes: " + handshakes);
    // }

    // 3. Display the number of possible handshakes.
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int nofhandshakes = (n * (n - 1)) / 2 ;
    //     System.out.println(nofhandshakes);
    // }

    // 4. Athlete Rounds in Triangular Park
    // public static double calculateRounds(double a, double b, double c) {
    //     double perimeter = a + b + c;
    //     return 5000 / perimeter;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     double side1 = sc.nextDouble();
    //     double side2 = sc.nextDouble();
    //     double side3 = sc.nextDouble();
    //     double rounds = calculateRounds(side1, side2, side3);
    //     System.out.println("Rounds needed: " + rounds);
    // }

    // 5. Check Positive, Negative or Zero
    // public static int checkNumber(int n) {
    //     if (n > 0) return 1;
    //     else if (n < 0) return -1;
    //     else return 0;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int num = sc.nextInt();
    //     int result = checkNumber(num);
    //     System.out.println("Result: " + result);
    // }

    // 6. Spring Season Check
    // public static boolean isSpringSeason(int month, int day) {
    //     return (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int month = sc.nextInt();
    //     int day = sc.nextInt();
    //     if (isSpringSeason(month, day)) {
    //         System.out.println("It's a Spring Season");
    //     } else {
    //         System.out.println("Not a Spring Season");
    //     }
    // }

    // 7. Sum of N Natural Numbers
    // public static int sumOfNaturalNumbers(int n) {
    //     int sum = 0;
    //     for (int i = 1; i <= n; i++) sum += i;
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int sum = sumOfNaturalNumbers(n);
    //     System.out.println("Sum of first " + n + " natural numbers: " + sum);
    // }

    // 8. Smallest and Largest of 3 Numbers
    // public static int[] findSmallestAndLargest(int a, int b, int c) {
    //     int smallest = Math.min(a, Math.min(b, c));
    //     int largest = Math.max(a, Math.max(b, c));
    //     return new int[]{smallest, largest};
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();
    //     int[] result = findSmallestAndLargest(a, b, c);
    //     System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
    // }

    // 9. Quotient and Remainder
    // public static int[] findRemainderAndQuotient(int number, int divisor) {
    //     int quotient = number / divisor;
    //     int remainder = number % divisor;
    //     return new int[]{quotient, remainder};
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int number = sc.nextInt();
    //     int divisor = sc.nextInt();
    //     int[] result = findRemainderAndQuotient(number, divisor);
    //     System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
    // }

    // 10. Divide Chocolates Among Children
    // public static int[] findRemainderAndQuotient(int chocolates, int children) {
    //     int eachChild = chocolates / children;
    //     int remaining = chocolates % children;
    //     return new int[]{eachChild, remaining};
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int chocolates = sc.nextInt();
    //     int children = sc.nextInt();
    //     int[] result = findRemainderAndQuotient(chocolates, children);
    //     System.out.println("Each child gets: " + result[0] + ", Remaining chocolates: " + result[1]);
    // }

    // 11. Wind Chill Calculation
    // public static double calculateWindChill(double temp, double windSpeed) {
    //     return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     double temperature = sc.nextDouble();
    //     double windSpeed = sc.nextDouble();
    //     double windChill = calculateWindChill(temperature, windSpeed);
    //     System.out.println("Wind Chill: " + windChill);
    // }

    // 12. Trigonometric Functions
    // public static double[] calculateTrigonometricFunctions(double angle) {
    //     double radians = Math.toRadians(angle);
    //     double sin = Math.sin(radians);
    //     double cos = Math.cos(radians);
    //     double tan = Math.tan(radians);
    //     return new double[]{sin, cos, tan};
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     double angle = sc.nextDouble();
    //     double[] results = calculateTrigonometricFunctions(angle);
    //     System.out.println("Sine: " + results[0]);
    //     System.out.println("Cosine: " + results[1]);
    //     System.out.println("Tangent: " + results[2]);
    // }
}