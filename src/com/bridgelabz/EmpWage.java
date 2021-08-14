package com.bridgelabz;

/**
 * Purpose - Employee Wage Computation program
 *
 * @author - Aviral N
 * @version - 1.2
 * date     - 14-08-2021
 */
public class EmpWage {

    public static final int IS_PRESENT = 1, WAGE_PER_HRS = 20;

    /**
     * Purpose - checks whether an EMP is present or absent
     *
     * @return - random number generated (empCheck)
     */
    public static int attendanceCheck() {

        int empCheck = (int) (Math.random() * 2);

        if (empCheck == IS_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

        return empCheck;    //random number generated will be returned
    }

    /**
     * Purpose - Calculates daily wage if emp is  present
     *
     * @return daily wage of EMP
     */
    public static int dailyWage() {

        int empCheck = attendanceCheck();
        int empWorkingHrs = 0;

        if (empCheck == IS_PRESENT)
            empWorkingHrs = 8;

        int dailyWage = WAGE_PER_HRS * empWorkingHrs;
        return dailyWage;
    }

    /**
     * Purpose - Execution of all methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        System.out.println("Daily wage: " + dailyWage());
    }
}