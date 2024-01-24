import java.util.Random;

class InnerOopsEmployeeWages {
    public int IS_PART_TIME;
    public int IS_FULL_TIME;
    public int EMP_RATE_PER_HOUR;
    public int NUM_OF_WORKING_DAY;
    public int MAX_HRS_IN_MONTH;

    public InnerOopsEmployeeWages(int isPartTime, int isFullTime, int empRatePerHour, int numOfWorkingDay,
            int maxHrsInMonth) {
        IS_PART_TIME = isPartTime;
        IS_FULL_TIME = isFullTime;
        EMP_RATE_PER_HOUR = empRatePerHour;
        NUM_OF_WORKING_DAY = numOfWorkingDay;
        MAX_HRS_IN_MONTH = maxHrsInMonth;
    }

    public static void TotalWages(InnerOopsEmployeeWages employee) {
        int empHrs = 0;
        int totalWorkingDay = 0;
        int totalEmpHrs = 0;

        Random random = new Random();

        while (totalEmpHrs <= employee.MAX_HRS_IN_MONTH && totalWorkingDay < employee.NUM_OF_WORKING_DAY) {
            totalWorkingDay++;
            int empCheck = random.nextInt(3); // Generates a random integer between 0 (inclusive) and 3 (exclusive)

            if (empCheck == employee.IS_PART_TIME) {
                empHrs = 4; // Assigning part-time hours
            } else if (empCheck == employee.IS_FULL_TIME) {
                empHrs = 8; // Assigning full-time hours
            } else {
                empHrs = 0;
            }

            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDay + " Emp hr : " + empHrs);
        }

        int totalEmpWage = totalEmpHrs * employee.EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }

    public static void main(String[] args) {
        InnerOopsEmployeeWages employee = new InnerOopsEmployeeWages(1, 2, 20, 20, 100);
        InnerOopsEmployeeWages.TotalWages(employee);
    }
}
