import java.util.Scanner;

public class Level1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 1. Write a program to check if a number is divisible by 5
        // int n = sc.nextInt();
        // if(n%5==0){
        //     System.out.println(n+" is divisible by 5.");
        // }else{
        //     System.out.println(n+" is not divisible by 5.");
        // }

        // 2. Write a program to check if the first is the smallest of the 3 numbers.
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        // if(n1 < n2 || n1 <n3){
        //     System.out.println("Number 1 "+n1+" is the smallest.");
        // }else{
        //     System.out.println("Number 1 " + n1+ " is not the smallest");
        // }

        // 3. Write a program to check if the first, second, or third number is the largest of the three.
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        // int l = n1;
        // if(n2>l){
        //     l = n2;
        // }
        // if(n3>l){
        //     l = n3;
        // }
        // System.out.println("The Largest number is : " + l);

        // 4. Write a program to check for the natural number and write the sum of n natural numbers 
        // int n = sc.nextInt();
        // if( n > 0){
        //     int sum = n * (n+1)/2;
        //     System.out.println(sum);
        // }else{
        //     System.out.println(n + " is not a natural number");
        // }

        // 5. Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
        // int age = sc.nextInt();
        // if(age>=18){
        //     System.out.println("You are eligible to vote");
        // }else{
        //     System.out.println("You are not eligible to vote");
        // }.

        // 6. Write a program to check whether a number is positive, negative, or zero.
        // int n = sc.nextInt();
        // if( n >= 1 ){
        //     System.out.println(n + " is a positive integer");
        // }else if( n <= -1){
        //     System.out.println(n + " is a negitive integer");
        // }else{
        //     System.out.println(n + " is Zero");
        // }

        // 7. Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
        // int month = sc.nextInt();
        // int date = sc.nextInt();
        // if(month == 3 && date >=20 || month == 4 || month == 5 || month == 6 && date<=20 ){
        //     System.out.println("It is spring season");
        // }else{
        //     System.out.println("It is not spring season");
        // }

        // 8. Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch.
        // int count = sc.nextInt();
        // while(count >= 1){
        //     System.out.println(count);
        //     count--;
        // }
        // System.out.println("Launch");

        // 9. Rewrite program 8 to do the countdown using the for-loop.
        // int count = sc.nextInt();
        // for( int i = count; i >= 1; i--){
        //     System.out.println(i);
        // }
        // System.out.println("Launch");

        // 10. Write a program to find the sum of numbers until the user enters 0.
        // double total = 0.0;
        // double n = sc.nextDouble();
        // while(n !=0){
        //     total += n;
        //     System.out.println("Enter 0 to Stop : ");
        //     n = sc.nextDouble();
        // }
        // System.out.println("Total sum is : " + total);

        // 11. Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement.
        // double total = 0.0;
        // while(true){
        //     System.out.println("Enter a number (0 or negative to stop): ");
        //     double n = sc.nextDouble();
        //     if(n <= 0){
        //         break;
        //     }
        //     total += n;
        // }
        // System.out.print("Total sum is: "+total);

        // 12. Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
        // int n = sc.nextInt();
        // if(n <= 0){
        //     System.out.println(n + " is not natural number.");
        // }else{
        //     int sumFormula = n * (n+1)/2;
        //     int sumLoop = 0;
        //     int i = 1;
        //     while( i <= n){
        //         sumLoop +=i;
        //         i++;
        //     }
        //     System.out.println(sumFormula);
        //     System.out.println(sumLoop);
        //     if(sumFormula == sumLoop){
        //         System.out.println("Both computations are correct.");
        //     }else{
        //         System.out.println("Mismatch in computation");
        //     }
        // }

        // 13. Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
        // int n = sc.nextInt();
        // if (n <= 0) {
        //     System.out.println("The number " + n + " is not a natural number.");
        // } else {
        //     int sumFormula = n * (n + 1) / 2;
        //     int sumLoop = 0;
        //     for (int i = 1; i <= n; i++) {
        //         sumLoop += i;
        //     }
        //     System.out.println(sumFormula);
        //     System.out.println(sumLoop);
        //     if (sumFormula == sumLoop) {
        //         System.out.println("Both computations are correct.");
        //     } else {
        //         System.out.println("Mismatch in computations!");
        //     }
        // }

        // 14. Write a Program to find the factorial of an integer entered by the user.
        // int n = sc.nextInt();
        // if(n < 0){
        //     System.out.println("Factorial not defined for negative");
        // }else{
        //     int fact = 1;
        //     int i = 1;

        //     while(i<=n){
        //         fact *= i;
        //         i++;
        //     }
        //     System.out.println(fact);
        // }

        // 15. Rewrite program 14 using for loop
        // int n = sc.nextInt();
        // if(n < 0){
        //     System.out.println("Invalid");
        // }else{
        //     int fact = 1;
        //     for(int i=1; i <= n; i++){
        //         fact*=i;
        //     }
        //     System.out.println(fact);
        // }

        // 16. Create a program to print odd and even numbers between 1 to the number entered by the user.
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

        // 17. Create a program to find the bonus of employees based on their years of service.
        // double salary = sc.nextDouble();
        // int years = sc.nextInt();
        // if(years > 5){
        //     double bonus = salary * 0.05;
        //     System.out.println(bonus);
        // }else{
        //     System.out.println("No bonus");
        // }

        // 18. Create a program to find the multiplication table of a number entered by the user from 6 to 9.
        // int n = sc.nextInt();
        // for(int i= 6; i<=9;i++){
        //     System.out.println(n+"*"+i+"="+(n*i));
        // }
    }
}