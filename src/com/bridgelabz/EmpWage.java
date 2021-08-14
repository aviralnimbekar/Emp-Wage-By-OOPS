package com.bridgelabz;

/**
 * Purpose - Employee Wage Computation program
 *
 * @author - Aviral N
 * @version - 1.1
 * date     - 14-08-2021
 */
public class EmpWage {

    /**
     * Purpose - checks whether a EMP is present or absent
     */
    public static void attendanceCheck() {

        int IS_PRESENT = 1;
        int empCheck = (int) (Math.random() * 2);

        if (empCheck == IS_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }

    /**
     * Purpose - Execution of all methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        attendanceCheck();
    }
}