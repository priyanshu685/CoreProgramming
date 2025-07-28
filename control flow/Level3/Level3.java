import java.util.Scanner;
public class Level3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 1. Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
        // int year = sc.nextInt();
        // if (year < 1582) {
        //     System.out.println("Year must be greater than or equal to 1582 (Gregorian Calendar).");
        // } else {
        //     System.out.print("Using if-else: ");
        //     if (year % 4 != 0) {
        //         System.out.println("Not a Leap Year");
        //     } else if (year % 100 != 0) {
        //         System.out.println("Leap Year");
        //     } else if (year % 400 == 0) {
        //         System.out.println("Leap Year");
        //     } else {
        //         System.out.println("Not a Leap Year");
        //     }
        //     System.out.print("Using single if with logic: ");
        //     if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        //         System.out.println("Leap Year");
        //     } else {
        //         System.out.println("Not a Leap Year");
        //     }
        // }

        // 2. Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
        // int year = sc.nextInt();
        // if (year >= 1582) {
        //     if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        //         System.out.println("Leap Year");
        //     } else {
        //         System.out.println("Not a Leap Year");
        //     }
        // } else {
        //     System.out.println("Invalid input: Year must be >= 1582 (Gregorian calendar).");
        // }

        // 3. Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 
        // System.out.print("Enter marks in Physics: ");
        // int physics = sc.nextInt();
        // System.out.print("Enter marks in Chemistry: ");
        // int chemistry = sc.nextInt();
        // System.out.print("Enter marks in Maths: ");
        // int maths = sc.nextInt();
        // double average = (physics + chemistry + maths) / 3.0;
        // System.out.printf("Average Marks: %.2f%%\n", average);
        // if (average >= 80) {
        //     System.out.println("Grade: A");
        //     System.out.println("Remarks: Level 4, above agency-normalized standards");
        // } else if (average >= 70) {
        //     System.out.println("Grade: B");
        //     System.out.println("Remarks: Level 3, at agency-normalized standards");
        // } else if (average >= 60) {
        //     System.out.println("Grade: C");
        //     System.out.println("Remarks: Level 2, below, but approaching agency-normalized standards");
        // } else if (average >= 50) {
        //     System.out.println("Grade: D");
        //     System.out.println("Remarks: Level 1, well below agency-normalized standards");
        // } else if (average >= 40) {
        //     System.out.println("Grade: E");
        //     System.out.println("Remarks: Level 1-, too below agency-normalized standards");
        // } else {
        //     System.out.println("Grade: R");
        //     System.out.println("Remarks: Remedial standards");
        // }

        // 4. Write a Program to check if the given number is a prime number or not
        // int number = sc.nextInt();
        // boolean isPrime = true;
        // if (number <= 1) {
        //     isPrime = false;
        // } else {
        //     for (int i = 2; i < number; i++) {
        //         if (number % i == 0) {
        //             isPrime = false;
        //             break;
        //         }
        //     }
        // }
        // if (isPrime) {
        //     System.out.println(number + " is a Prime Number ");
        // } else {
        //     System.out.println(number + " is NOT a Prime Number ");
        // }

        // 5. Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code
        // int number = sc.nextInt();
        // int originalNumber = number;
        // int sum = 0;
        // while (originalNumber != 0) {
        //     int digit = originalNumber % 10;
        //     sum += digit * digit * digit;
        //     originalNumber = originalNumber / 10;
        // }
        // if (sum == number) {
        //     System.out.println(number + " is an Armstrong number ✅");
        // } else {
        //     System.out.println(number + " is NOT an Armstrong number ❌");
        // }

        // 6. Create a program to count the number of digits in an integer.
        // int number = sc.nextInt();
        // if (number == 0) {
        //     System.out.println("The number has 1 digit.");
        // } else {
        //     int count = 0;
        //     int originalNumber = Math.abs(number);
        //     while (originalNumber != 0) {
        //         originalNumber /= 10;
        //         count++;
        //     }
        //     System.out.println("The number has " + count + " digit(s).");
        // }

        // 7. Create a program to find the BMI of a person
        // double weight = sc.nextDouble();
        // System.out.print("Enter your height in centimeters: ");
        // double heightCm = sc.nextDouble();
        // double heightM = heightCm / 100.0;
        // double bmi = weight / (heightM * heightM);
        // System.out.printf("Your BMI is: %.2f\n", bmi);
        // if (bmi < 18.5) {
        //     System.out.println("You are underweight.");
        // } else if (bmi >= 18.5 && bmi < 24.9) {
        //     System.out.println("You are normal weight.");
        // } else if (bmi >= 25 && bmi < 29.9) {
        //     System.out.println("You are overweight.");
        // } else {
        //     System.out.println("You are obese.");
        // }

        // 8. Create a program to check if a number taken from the user is a Harshad Number.
        // int number = sc.nextInt();
        // int originalNumber = number;
        // int sum = 0;
        // while (number > 0) {
        //     int digit = number % 10;
        //     sum += digit;
        //     number /= 10;
        // }
        // if (originalNumber % sum == 0) {
        //     System.out.println(originalNumber + " is a Harshad Number.");
        // } else {
        //     System.out.println(originalNumber + " is NOT a Harshad Number.");
        // }

        // 9. Create a program to check if a number is an Abundant Number.
        // int number = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i < number; i++) {
        //     if (number % i == 0) {
        //         sum += i;
        //     }
        // }
        // if (sum > number) {
        //     System.out.println(number + " is an Abundant Number.");
        // } else {
        //     System.out.println(number + " is NOT an Abundant Number.");
        // }

        // 10. Write a program to create a calculator using switch...case.
        // double first = sc.nextDouble();
        // System.out.print("Enter the second number: ");
        // double second = sc.nextDouble();
        // System.out.print("Enter the operator (+, -, *, /): ");
        // String op = sc.next();
        // double result;
        // switch (op) {
        //     case "+":
        //         result = first + second;
        //         System.out.println("Result: " + result);
        //         break;
        //     case "-":
        //         result = first - second;
        //         System.out.println("Result: " + result);
        //         break;
        //     case "*":
        //         result = first * second;
        //         System.out.println("Result: " + result);
        //         break;
        //     case "/":
        //         if (second != 0) {
        //             result = first / second;
        //             System.out.println("Result: " + result);
        //         } else {
        //             System.out.println("Error: Division by zero is not allowed.");
        //         }
        //         break;
        //     default:
        //         System.out.println("Invalid Operator.");
        // }

        // 11. Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on.
        // if (args.length != 3) {
        //     System.out.println("Usage: java DayOfWeek <month> <day> <year>");
        //     return;
        // }
        // int m = Integer.parseInt(args[0]);
        // int d = Integer.parseInt(args[1]);
        // int y = Integer.parseInt(args[2]);
        // if (m < 3) {
        //     m += 12;
        //     y -= 1;
        // }
        // int k = y % 100;
        // int j = y / 100;
        // int dayOfWeek = (d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        // int finalDay = (dayOfWeek + 6) % 7;
        // System.out.println("Day of the week: " + finalDay);

    }
}