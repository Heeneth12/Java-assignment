// Check Employee is Present or Absent
public class EmployeeWageSolution {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");

        } else {
            System.out.println("Employee is Abscent");
        }
    }

}

// [Running] cd "c:\Users\nithi\javaAssignment\EmployeeWage\" && javac
// EmployeeWageSolution.java && java EmployeeWageSolution
// Employee is Abscent
// Employee is Present