import java.util.Random;

public class Ques11 {

    public static double[][] generateSalaryAndService(int employees) {
        double[][] data = new double[employees][2];
        Random rand = new Random();

        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);
            data[i][1] = rand.nextInt(11);
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        int employees = data.length;
        double[][] result = new double[employees][3];

        for (int i = 0; i < employees; i++) {
            double oldSalary = data[i][0];
            int years = (int) data[i][1];
            double bonus = (years > 5) ? 0.05 * oldSalary : 0.02 * oldSalary;
            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    public static void displayReport(double[][] salaryService, double[][] salaryBonus) {
        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;

        for (int i = 0; i < salaryService.length; i++) {
            double oldSalary = salaryBonus[i][0];
            int years = (int) salaryService[i][1];
            double bonus = salaryBonus[i][1];
            double newSalary = salaryBonus[i][2];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.println("Emp " + (i + 1) + " - Old Salary: " + oldSalary + ", Years: " + years + ", Bonus: " + bonus + ", New Salary: " + newSalary);
        }

        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {
        int employeeCount = 10;
        double[][] salaryService = generateSalaryAndService(employeeCount);
        double[][] salaryBonus = calculateNewSalaryAndBonus(salaryService);
        displayReport(salaryService, salaryBonus);
    }
}