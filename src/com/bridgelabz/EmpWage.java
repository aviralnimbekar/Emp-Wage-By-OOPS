package com.bridgelabz;

/**
 * Purpose - Employee Wage Computation program
 *
 * @author - Aviral N
 * @version - 1.7
 * date     - 14-08-2021
 */
public class EmpWage {

    public static final int IS_PRESENT = 1, IS_PART_TIME_PRESENT = 2;
    public static final int FULL_TIME_WORKING_HR = 8, PART_TIME_WORKING_HR = 4,
            WORKING_DAY_FOR_MONTH = 20, TOTAL_WORKING_HRS = 100;

    /**
     * Purpose - checks whether an EMP is present or absent
     *
     * @return - workingHrPerDay (8hr, 0hr)
     */
    public static int attendanceCheck() {

        int workingHrPerDay;
        int empCheck = (int) (Math.random() * 2);

        if (empCheck == IS_PRESENT) {
            workingHrPerDay = FULL_TIME_WORKING_HR;
        } else {
            System.out.println("Employee is Absent");
            workingHrPerDay = 0;
        }
        return workingHrPerDay;
    }

    /**
     * Purpose - Calculates daily wage if emp is  present
     *
     * @param workingHrPerDay working of a EMP in a day (8, 4, 0)
     * @return dailyWage (160, 80 , 0)
     */
    public static int dailyWage(int workingHrPerDay) {

        int WAGE_PER_HRS = 20;

        int dailyWage = WAGE_PER_HRS * workingHrPerDay;
        System.out.println("Daily wage: " + dailyWage);

        return dailyWage;
    }

    /**
     * Purpose - if emp is present it further checks whether he present full time or part-time
     *
     * @return workingHrPerDay (8hr, 4hr, 0hr)
     */
    public static int partTimeFullTime() {

        //assigning 8hrs or 0hr
        int workingHrPerDay = attendanceCheck();

        if (workingHrPerDay == FULL_TIME_WORKING_HR) {

            //generating random number to check whether emp is full time or part-time
            int durationCheck = (int) (Math.random() * 2);

            //full time = 1
            if (durationCheck == IS_PRESENT) {
                System.out.println("Employee is full time Present");

            } else {
                System.out.println("Employee is part time Present");
                workingHrPerDay = PART_TIME_WORKING_HR;
            }
        }
        return workingHrPerDay;
    }

    /**
     * Purpose - checks attendance and calculate working per hr using case switch method
     *
     * @return workingHrPerDay
     */
    public static int switchCase() {

        int workingHrPerDay;
        int rand = (int) (Math.random() * 3);

        switch (rand) {

            case IS_PRESENT:
                System.out.println("Employee is full time Present");
                workingHrPerDay = FULL_TIME_WORKING_HR;
                break;

            case IS_PART_TIME_PRESENT:
                System.out.println("Employee is part time Present");
                workingHrPerDay = PART_TIME_WORKING_HR;
                break;

            default:
                System.out.println("Employee is absent");
                workingHrPerDay = 0;
        }
        return workingHrPerDay;
    }

    /**
     * Purpose - Calculate wage for a month
     *
     * @return monthly wage
     */
    public static int monthlyWage() {

        int monthlyWage = 0, workingHrsPerMonth = 0;

        for (int i = 1; i <= WORKING_DAY_FOR_MONTH; i++) {
            System.out.println("Day-" + i);
            int workingHrsPerDay = partTimeFullTime();
            int dailyWage = dailyWage(workingHrsPerDay);

            monthlyWage += dailyWage;
            workingHrsPerMonth += workingHrsPerDay;

            if (workingHrsPerMonth >= TOTAL_WORKING_HRS)
                break;
        }
        System.out.println("Working Hrs Per Month = " + workingHrsPerMonth);
        return monthlyWage;
    }

    /**
     * Purpose - Execution of all methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        System.out.println("Monthly wage: " + monthlyWage());
    }
}