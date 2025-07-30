// Write a program Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()
import java.util.Scanner;

public class Ques9{

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        if (x2 == x1) {
            throw new IllegalArgumentException("The line is vertical; slope is undefined.");
        }
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        result[0] = m;
        result[1] = b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.4f\n", distance);

        try {
            double[] equation = lineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of Line: y = %.4fx + %.4f\n", equation[0], equation[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
