// Program 1: Bonus Calculation for 10 Employees
import java.util.*;

public class Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Program 1
        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1));
            salary[i] = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1));
            service[i] = sc.nextDouble();
            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid input. Try again.");
                i--;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (service[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Program 2: Youngest and Tallest Friend
        int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i]);
            age[i] = sc.nextInt();
            System.out.println("Enter height of " + names[i]);
            height[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) youngestIndex = i;
            if (height[i] > height[tallestIndex]) tallestIndex = i;
        }

        System.out.println("Youngest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);

        // Program 3: Store digits and find 2 largest
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int maxDigit = 10, index = 0;
        int[] digits = new int[maxDigit];
        while (number != 0) {
            if (index == maxDigit) break;
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);

        // Program 4: Rework with expandable array
        System.out.println("Enter another number:");
        number = sc.nextInt();
        maxDigit = 10;
        index = 0;
        digits = new int[maxDigit];
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }
        largest = 0;
        secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("[Resizable Array] Largest: " + largest + ", Second Largest: " + secondLargest);

        // Program 5: Reverse number using array
        System.out.println("Enter a number:");
        number = sc.nextInt();
        int count = 0, tempNum = number;
        while (tempNum != 0) {
            tempNum /= 10;
            count++;
        }
        int[] revDigits = new int[count];
        for (int i = 0; i < count; i++) {
            revDigits[i] = number % 10;
            number /= 10;
        }
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(revDigits[i]);
        }
        System.out.println();

        // Program 6: BMI using arrays
        System.out.println("Enter number of persons:");
        int persons = sc.nextInt();
        double[] heightArray = new double[persons];
        double[] weightArray = new double[persons];
        double[] bmiArray = new double[persons];
        String[] status = new String[persons];

        for (int i = 0; i < persons; i++) {
            System.out.println("Enter height (in m) for person " + (i + 1));
            heightArray[i] = sc.nextDouble();
            System.out.println("Enter weight (in kg) for person " + (i + 1));
            weightArray[i] = sc.nextDouble();

            bmiArray[i] = weightArray[i] / (heightArray[i] * heightArray[i]);
            if (bmiArray[i] < 18.5) status[i] = "Underweight";
            else if (bmiArray[i] < 25) status[i] = "Normal";
            else if (bmiArray[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < persons; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + heightArray[i] + ", Weight = " + weightArray[i] + ", BMI = " + bmiArray[i] + ", Status = " + status[i]);
        }

        // Program 7: BMI using 2D array
        double[][] personData = new double[persons][3];
        String[] weightStatus = new String[persons];

        for (int i = 0; i < persons; i++) {
            System.out.println("[2D] Enter height (in m) for person " + (i + 1));
            personData[i][0] = sc.nextDouble();
            System.out.println("[2D] Enter weight (in kg) for person " + (i + 1));
            personData[i][1] = sc.nextDouble();

            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            double bmi = personData[i][2];
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        for (int i = 0; i < persons; i++) {
            System.out.println("[2D] Person " + (i + 1) + ": Height = " + personData[i][0] + ", Weight = " + personData[i][1] + ", BMI = " + personData[i][2] + ", Status = " + weightStatus[i]);
        }

        // Program 8: Marks, percentage, grade (1D)
        System.out.println("Enter number of students:");
        int students = sc.nextInt();
        int[] phy = new int[students], chem = new int[students], math = new int[students];
        double[] perc = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks in Physics, Chemistry, Maths for student " + (i + 1));
            phy[i] = sc.nextInt(); chem[i] = sc.nextInt(); math[i] = sc.nextInt();
            if (phy[i] < 0 || chem[i] < 0 || math[i] < 0) { i--; continue; }
            perc[i] = (phy[i] + chem[i] + math[i]) / 3.0;
            grade[i] = perc[i] >= 90 ? 'A' : perc[i] >= 75 ? 'B' : perc[i] >= 60 ? 'C' : perc[i] >= 40 ? 'D' : 'F';
        }
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) + " -> %: " + perc[i] + ", Grade: " + grade[i]);
        }

        // Program 9: Marks in 2D Array
        int[][] marks2D = new int[students][3];
        perc = new double[students];
        grade = new char[students];

        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks in Phy, Chem, Math for student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                marks2D[i][j] = sc.nextInt();
                if (marks2D[i][j] < 0) { i--; break; }
            }
            perc[i] = (marks2D[i][0] + marks2D[i][1] + marks2D[i][2]) / 3.0;
            grade[i] = perc[i] >= 90 ? 'A' : perc[i] >= 75 ? 'B' : perc[i] >= 60 ? 'C' : perc[i] >= 40 ? 'D' : 'F';
        }
        for (int i = 0; i < students; i++) {
            System.out.println("[2D] Student " + (i + 1) + " -> %: " + perc[i] + ", Grade: " + grade[i]);
        }

        // Program 10: Frequency of digits
        System.out.println("Enter a number to find frequency of each digit:");
        int freqNum = sc.nextInt();
        int[] freqDigits = new int[10];
        while (freqNum > 0) {
            int digit = freqNum % 10;
            freqDigits[digit]++;
            freqNum /= 10;
        }
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freqDigits[i] > 0) {
                System.out.println("Digit " + i + ": " + freqDigits[i]);
            }
        }
    }
}
