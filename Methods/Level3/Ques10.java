// Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling. 
import java.util.Scanner;

public class Ques10 {

    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeAB == slopeAC;
    }

    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();

        System.out.print("Enter x3 and y3: ");
        double x3 = sc.nextDouble(), y3 = sc.nextDouble();

        boolean bySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean byArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear by Slope Method: " + bySlope);
        System.out.println("Collinear by Area Method : " + byArea);

        sc.close();
    }
}
