import java.util.Scanner;
public class Level1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
        // int[] ages = new int[10];
        // System.out.println("Enter the ages of 10 students:");
        // for (int i = 0; i < ages.length; i++) {
        //     System.out.print("Enter age of student " + (i + 1) + ": ");
        //     ages[i] = sc.nextInt();
        // }
        // System.out.println("\nVoting Eligibility Results:");
        // for (int i = 0; i < ages.length; i++) {
        //     int age = ages[i];
        //     if (age < 0) {
        //         System.out.println("Invalid age entered for student " + (i + 1));
        //     } else if (age >= 18) {
        //         System.out.println("The student with the age " + age + " can vote.");
        //     } else {
        //         System.out.println("The student with the age " + age + " cannot vote.");
        //     }
        // }

        // 2. Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less.
        // int[] numbers = new int[5];
        // System.out.println("Enter 5 numbers:");
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.print("Enter number " + (i + 1) + ": ");
        //     numbers[i] = sc.nextInt();
        // }
        // System.out.println("\nNumber Analysis:");
        // for (int i = 0; i < numbers.length; i++) {
        //     int num = numbers[i];
        //     if (num > 0) {
        //         if (num % 2 == 0) {
        //             System.out.println("Number " + num + " is positive and even.");
        //         } else {
        //             System.out.println("Number " + num + " is positive and odd.");
        //         }
        //     } else if (num < 0) {
        //         System.out.println("Number " + num + " is negative.");
        //     } else {
        //         System.out.println("Number is zero.");
        //     }
        // }
        // System.out.println("\nComparison between first and last element:");
        // if (numbers[0] == numbers[4]) {
        //     System.out.println("First and last elements are equal.");
        // } else if (numbers[0] > numbers[4]) {
        //     System.out.println("First element is greater than the last element.");
        // } else {
        //     System.out.println("First element is less than the last element.");
        // }

        // 3. Create a program to print a multiplication table of a number.
        // int number = sc.nextInt();
        // int[] table = new int[10];
        // for (int i = 1; i <= 10; i++) {
        //     table[i - 1] = number * i;
        // }
        // System.out.println("\nMultiplication Table of " + number + ":");
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(number + " * " + i + " = " + table[i - 1]);
        // }

        // 4. Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 
        // double[] numbers = new double[10];
        // double total = 0.0;
        // int index = 0;
        // System.out.println("Enter up to 10 positive numbers (enter 0 or negative number to stop):");
        // while (true) {
        //     System.out.print("Enter number " + (index + 1) + ": ");
        //     double input = sc.nextDouble();
        //     if (input <= 0) {
        //         break;
        //     }
        //     if (index == 10) {
        //         break;
        //     }
        //     numbers[index] = input;
        //     index++;
        // }
        // System.out.println("\nNumbers entered:");
        // for (int i = 0; i < index; i++) {
        //     System.out.print(numbers[i] + " ");
        //     total += numbers[i];
        // }
        // System.out.println("\nTotal sum of all numbers: " + total);

        // 5. Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
        // int number = sc.nextInt();
        // int[] multiplicationResult = new int[4]; // For 6, 7, 8, 9
        // for (int i = 0; i < 4; i++) {
        //     multiplicationResult[i] = number * (i + 6);
        // }
        // System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        // for (int i = 0; i < 4; i++) {
        //     int multiplier = i + 6;
        //     System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        // }

        // 6. Create a program to find the mean height of players present in a football team.
        // double[] heights = new double[11];
        // double sum = 0.0;
        // System.out.println("Enter the heights (in cm or meters) of 11 football players:");
        // for (int i = 0; i < heights.length; i++) {
        //     System.out.print("Enter height of player " + (i + 1) + ": ");
        //     heights[i] = sc.nextDouble();
        //     sum += heights[i];
        // }
        // double mean = sum / 11;
        // System.out.println("\nMean height of the football team: " + mean);

        // 7. Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
        // int number = sc.nextInt();
        // if (number <= 0) {
        //     System.out.println("Error: Please enter a natural number (greater than 0).");
        //     return;
        // }
        // int size = number / 2 + 1;
        // int[] evenNumbers = new int[size];
        // int[] oddNumbers = new int[size];
        // int evenIndex = 0, oddIndex = 0;
        // for (int i = 1; i <= number; i++) {
        //     if (i % 2 == 0) {
        //         evenNumbers[evenIndex] = i;
        //         evenIndex++;
        //     } else {
        //         oddNumbers[oddIndex] = i;
        //         oddIndex++;
        //     }
        // }
        // System.out.println("\nEven numbers:");
        // for (int i = 0; i < evenIndex; i++) {
        //     System.out.print(evenNumbers[i] + " ");
        // }
        // System.out.println("\n\nOdd numbers:");
        // for (int i = 0; i < oddIndex; i++) {
        //     System.out.print(oddNumbers[i] + " ");
        // }

        // 8. Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
        // int number = sc.nextInt();
        // if (number <= 0) {
        //     System.out.println("Please enter a positive integer.");
        //     return;
        // }
        // int maxFactor = 10;
        // int[] factors = new int[maxFactor];
        // int index = 0;
        // for (int i = 1; i <= number; i++) {
        //     if (number % i == 0) {
        //         if (index == maxFactor) {
        //             maxFactor *= 2;
        //             int[] temp = new int[maxFactor];
        //             for (int j = 0; j < factors.length; j++) {
        //                 temp[j] = factors[j];
        //             }
        //             factors = temp;
        //         }
        //         factors[index] = i;
        //         index++;
        //     }
        // }
        // System.out.println("\nFactors of " + number + ":");
        // for (int i = 0; i < index; i++) {
        //     System.out.print(factors[i] + " ");
        // }

        // 9. Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
        // int rows = sc.nextInt();
        // System.out.print("Enter number of columns: ");
        // int cols = sc.nextInt();
        // int[][] matrix = new int[rows][cols];
        // System.out.println("Enter elements of the matrix:");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print("Element [" + i + "][" + j + "]: ");
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // int[] array = new int[rows * cols];
        // int index = 0;
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         array[index] = matrix[i][j];
        //         index++;
        //     }
        // }
        // System.out.println("\n1D Array elements copied from the 2D Matrix:");
        // for (int i = 0; i < array.length; i++) {
        //     System.out.print(array[i] + " ");
        // }

        // 10. Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
        // int number = sc.nextInt();
        // if (number <= 0) {
        //     System.out.println("Error: Please enter a positive integer.");
        //     return;
        // }
        // String[] results = new String[number + 1];
        // for (int i = 0; i <= number; i++) {
        //     if (i % 3 == 0 && i % 5 == 0 && i != 0) {
        //         results[i] = "FizzBuzz";
        //     } else if (i % 3 == 0 && i != 0) {
        //         results[i] = "Fizz";
        //     } else if (i % 5 == 0 && i != 0) {
        //         results[i] = "Buzz";
        //     } else {
        //         results[i] = Integer.toString(i);
        //     }
        // }
        // System.out.println("\nFizzBuzz Results:");
        // for (int i = 0; i <= number; i++) {
        //     System.out.println("Position " + i + " = " + results[i]);
        // }
    }
}