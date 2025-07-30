// Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar as shown below
import java.util.Scanner;

public class Ques8{

    // Month names
    static final String[] months = {
        "", "January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};
    static final int[] days = {0, 31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month];
    }
    public static int getFirstDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }
    public static void printCalendar(int month, int year) {
        int firstDay = getFirstDay(month, year);
        int numberOfDays = getNumberOfDays(month, year);

        System.out.println("\n      " + months[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDay) % 7 == 0) System.out.println(); 
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input.");
        } else {
            printCalendar(month, year);
        }
    }
}
