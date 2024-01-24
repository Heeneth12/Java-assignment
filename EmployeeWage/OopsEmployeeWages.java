import java.util.Random;

class InnerOopsEmployeeWages {
    public int IS_PART_TIME;
    public int IS_FULL_TIME;
    public int EMP_RATE_PER_HOUR;
    public int NUM_OF_WORKING_DAY;
    public int MAX_HRS_IN_MONTH;

    private InnerOopsEmployeeWages(int isPartTime, int isFullTime, int empRatePerHour, int numOfWorkingDay,
            int maxHrsInMonth) {
        IS_PART_TIME = isPartTime;
        IS_FULL_TIME = isFullTime;
        EMP_RATE_PER_HOUR = empRatePerHour;
        NUM_OF_WORKING_DAY = numOfWorkingDay;
        MAX_HRS_IN_MONTH = maxHrsInMonth;
    }

    public static InnerOopsEmployeeWages createInstance(int isPartTime, int isFullTime, int empRatePerHour,
            int numOfWorkingDay, int maxHrsInMonth) {
        return new InnerOopsEmployeeWages(isPartTime, isFullTime, empRatePerHour, numOfWorkingDay, maxHrsInMonth);
    }

    public void TotalWages() {
        int empHrs = 0;
        int totalWorkingDay = 0;
        int totalEmpHrs = 0;

        Random random = new Random();

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDay < NUM_OF_WORKING_DAY) {
            totalWorkingDay++;
            int empCheck = random.nextInt(3); // Generates a random integer between 0 (inclusive) and 3 (exclusive)

            if (empCheck == IS_PART_TIME) {
                empHrs = 4; // Assigning part-time hours
            } else if (empCheck == IS_FULL_TIME) {
                empHrs = 8; // Assigning full-time hours
            } else {
                empHrs = 0;
            }

            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDay + " Emp hr : " + empHrs);
        }

        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}

public class OopsEmployeeWages {
    public static void main(String[] args) {
        // Creating an instance of InnerOopsEmployeeWages
        InnerOopsEmployeeWages employee = InnerOopsEmployeeWages.createInstance(1, 2, 20, 20, 100);

        // Invoking the TotalWages method
        employee.TotalWages();
    }
}
