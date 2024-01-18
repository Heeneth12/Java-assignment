// UC1 Check Employee is Present or Absent
// UC2 Add Part time Employee & Wage

public class EmployeeWageSolution {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;

        int empHrs = 0;
        int empWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
            empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Employee is Present");
            System.out.println("Emp Wage: " + empWage);

        } else {

            empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Employee is Adscent");
            System.out.println("Emp Wage: " + empWage);

        }
    }

}

// EmployeeWageSolution.java && java EmployeeWageSolution
// Employee is Abscent
// Employee is Present

// EmployeeWageSolution.java && java EmployeeWageSolution
// Employee is Present
// Emp Wage:
// 160