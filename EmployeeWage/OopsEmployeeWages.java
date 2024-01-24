import java.util.Random;
import java.util.Stack;

class EmpWageBuilderMultiCompany {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public void computeEmpWage(String Company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDay = 0;

        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDay < numOfWorkingDays) {
            totalWorkingDay++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;

                    break;
                case IS_FULL_TIME:
                    empHrs = 8;

                default:
                    empHrs = 0;

            }
            totalEmpHrs += empHrs;
            System.out.println("Day# " + totalWorkingDay + "Emp HR: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for company :" + Company + " is:" + totalEmpWage);

    }

}

public class OopsEmployeeWages {
    public static void main(String[] args) {
        EmpWageBuilderMultiCompany obj = new EmpWageBuilderMultiCompany();
        obj.computeEmpWage("Dmart", 20, 2, 10);

    }
}
