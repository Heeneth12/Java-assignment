// UC5 Calculating Wages fora Month assuming 20
//Working Days in a Month

public class EmployeeWageSolution {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAY = 20;

    public static void main(String[] args) {
        // Varibles
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        for (int day = 0; day < NUM_OF_WORKING_DAY; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    empWage = empHrs * EMP_RATE_PER_HOUR;
                    totalEmpWage += empWage;
                    System.out.println("Emp Wag" + empWage);

                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    empWage = empHrs * EMP_RATE_PER_HOUR;
                    totalEmpWage += empWage;
                    System.out.println("Emp Wag" + empWage);
                    break;

                default:
                    empHrs = 0;
                    empWage = empHrs * EMP_RATE_PER_HOUR;
                    totalEmpWage += empWage;
                    System.out.println("Emp Wag" + empWage);

            }

        }
        System.out.println("Total Emp Wage : " + totalEmpWage);
    }

}
