public class EmployeeWageSolution {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAY = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args) {
        // Variables
        int empHrs = 0;
        int totalWorkingDay = 0;
        int totalEmpHrs = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDay < NUM_OF_WORKING_DAY) {
            totalWorkingDay++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4; // Assigning part-time hours
                    totalEmpHrs += empHrs;
                    System.out.println("Day " + totalWorkingDay + " Emp hr : " + empHrs);
                    break;
                case IS_FULL_TIME:
                    empHrs = 8; // Assigning full-time hours
                    totalEmpHrs += empHrs;
                    System.out.println("Day " + totalWorkingDay + " Emp hr : " + empHrs);
                    break;
                default:
                    empHrs = 0;
                    totalEmpHrs += empHrs;
                    System.out.println("Day " + totalWorkingDay + " Emp hr : " + empHrs);
            }

        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage :" + totalEmpWage);
    }
}
