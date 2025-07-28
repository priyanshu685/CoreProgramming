import java.util.Scanner;
public class Level2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 1. Create a program to print odd and even numbers between 1 to the number entered by the user.
        // int n = sc.nextInt();
        // for(int  i=1; i<=n; i++){
        //     if(i%2==0){
        //         System.out.println(i+" is even");
        //     }
        // }
        // for(int i = 1 ; i <= n;i++){
        //     if(i%2 !=0){
        //         System.out.println(i+"is odd");
        //     }
        // }

        // 2. Create a program to find the bonuses of employees based on their years of service.
        // double salary = sc.nextDouble();
        // int years = sc.nextInt();
        // if(years > 5){
        //     double bonus = salary * 0.05;
        //     System.out.println(bonus);
        // }else{
        //     System.out.println("No bonus");
        // }

        // 3. Create a program to find the multiplication table of a number entered by the user from 6 to 9.
        // int n = sc.nextInt();
        // for(int i= 6; i<=9;i++){
        //     System.out.println(n+"*"+i+"="+(n*i));
        // }

        // 4. Write a program FizzBuzz, take a number as user input, and check for a positive integer. If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
        // int number = sc.nextInt();
        // if (number > 0) {
        //     for (int i = 1; i <= number; i++) {
        //         if (i % 3 == 0 && i % 5 == 0) {
        //             System.out.println("FizzBuzz");
        //         } else if (i % 3 == 0) {
        //             System.out.println("Fizz");
        //         } else if (i % 5 == 0) {
        //             System.out.println("Buzz");
        //         } else {
        //             System.out.println(i);
        //         }
        //     }
        // } else {
        //     System.out.println("The number " + number + " is not a positive integer.");
        // } 

        // 5. Rewrite the program 4 FizzBuzz using the while loop 
        // int number = scanner.nextInt();
        // if (number > 0) {
        //     int i = 1;
        //     while (i <= number) {
        //         if (i % 3 == 0 && i % 5 == 0) {
        //             System.out.println("FizzBuzz");
        //         } else if (i % 3 == 0) {
        //             System.out.println("Fizz");
        //         } else if (i % 5 == 0) {
        //             System.out.println("Buzz");
        //         } else {
        //             System.out.println(i);
        //         }
        //         i++;
        //     }
        // } else {
        //     System.out.println("The number " + number + " is not a positive integer.");
        // }

        // 6. Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
        // int ageAmar = sc.nextInt();
        // System.out.print("Enter Amar's height (in cm): ");
        // int heightAmar = sc.nextInt();
        // System.out.print("Enter Akbar's age: ");
        // int ageAkbar = sc.nextInt();
        // System.out.print("Enter Akbar's height (in cm): ");
        // int heightAkbar = sc.nextInt();
        // System.out.print("Enter Anthony's age: ");
        // int ageAnthony = sc.nextInt();
        // System.out.print("Enter Anthony's height (in cm): ");
        // int heightAnthony = sc.nextInt();
        // String youngest = "Amar";
        // int minAge = ageAmar;
        // if (ageAkbar < minAge) {
        //     minAge = ageAkbar;
        //     youngest = "Akbar";
        // }
        // if (ageAnthony < minAge) {
        //     youngest = "Anthony";
        // }
        // String tallest = "Amar";
        // int maxHeight = heightAmar;
        // if (heightAkbar > maxHeight) {
        //     maxHeight = heightAkbar;
        //     tallest = "Akbar";
        // }
        // if (heightAnthony > maxHeight) {
        //     tallest = "Anthony";
        // }
        // System.out.println("\nThe youngest friend is: " + youngest);
        // System.out.println("The tallest friend is: " + tallest);

        // 7. Create a program to find the factors of a number taken as user input.
        // int number = sc.nextInt();
        // if (number > 0) {
        //     System.out.println("Factors of " + number + " are:");
        //     for (int i = 1; i <= number; i++) {
        //         if (number % i == 0) {
        //             System.out.println(i);
        //         }
        //     }
        // } else {
        //     System.out.println("Please enter a positive integer.");
        // }

        // 8. Rewrite the above program 7 to find the factors of a number using the while loop
        // int number = sc.nextInt();
        // if (number > 0) {
        //     System.out.println("Factors of " + number + " are:");
        //     int i = 1;
        //     while (i <= number) {
        //         if (number % i == 0) {
        //             System.out.println(i);
        //         }
        //         i++;
        //     }
        // } else {
        //     System.out.println("Please enter a positive integer.");
        // }

        // 9. Create a program to print the greatest factor of a number beside itself using a loop.
        // int number = sc.nextInt();
        // if (number > 1) {
        //     int greatestFactor = 1;
        //     for (int i = number - 1; i >= 1; i--) {
        //         if (number % i == 0) {
        //             greatestFactor = i;
        //             break;
        //         }
        //     }
        //     System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        // } else {
        //     System.out.println("Please enter a number greater than 1.");
        // }

        // 10. Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
        // int number = sc.nextInt();
        // if (number > 1) {
        //     int greatestFactor = 1;
        //     int counter = number - 1;

        //     while (counter >= 1) {
        //         if (number % counter == 0) {
        //             greatestFactor = counter;
        //             break;
        //         }
        //         counter--;
        //     }

        //     System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        // } else {
        //     System.out.println("Please enter a number greater than 1.");
        // }

        // 11. Create a program to find all the multiples of a number taken as user input below 100.
        // int number = sc.nextInt();
        // if (number > 0 && number < 100) {
        //     System.out.println("Multiples of " + number + " below 100 are:");
        //     for (int i = 100; i >= 1; i--) {
        //         if (i % number == 0) {
        //             System.out.println(i);
        //         }
        //     }
        // } else {
        //     System.out.println("Please enter a positive integer less than 100.");
        // }

        // 12. Create a program to find the power of a number.
        // int power = sc.nextInt();
        // if (power < 0) {
        //     System.out.println("Power must be non-negative.");
        //     return;
        // }
        // int result = 1;
        // for (int i = 1; i <= power; i++) {
        //     result *= number;
        // }
        // System.out.println(number + " raised to the power " + power + " is: " + result);

        // 13. Rewrite the program to find all the multiples of a number below 100 using while loop.
        // int number = sc.nextInt();
        // if (number > 0 && number < 100) {
        //     System.out.println("Multiples of " + number + " below 100:");
        //     int counter = 1;
        //     while (number * counter < 100) {
        //         System.out.println(number * counter);
        //         counter++;
        //     }
        // } else {
        //     System.out.println("Please enter a valid positive number less than 100.");
        // }

        // 14. Rewrite the above program to find the power of a number using a while loop.
        // int number = sc.nextInt();
        // System.out.print("Enter the power (non-negative integer): ");
        // int power = sc.nextInt();
        // if (power < 0) {
        //     System.out.println("Power must be a non-negative integer.");
        //     return;
        // }
        // int result = 1;
        // int counter = 0;
        // while (counter < power) {
        //     result *= number;
        //     counter++;
        // }
        // System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}