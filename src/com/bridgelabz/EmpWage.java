package com.bridgelabz;

/**
 * Purpose - Employee Wage Computation program
 *
 * @author - Aviral N
 * @version - 1.3
 * date     - 14-08-2021
 */
public class EmpWage {

    public static final int IS_PRESENT = 1;

    /**
     * Purpose - checks whether an EMP is present or absent
     *
     * @return - workingHrPerDay per day
     */
    public static int attendanceCheck() {

        int workingHrPerDay;
        int empCheck = (int) (Math.random() * 2);

        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is Present");
            workingHrPerDay = 8;
        } else {
            System.out.println("Employee is Absent");
            workingHrPerDay = 0;
        }
        return workingHrPerDay;
    }

    /**
     * Purpose - Calculates daily wage if emp is  present
     *
     * @return daily wage of EMP
     */
    public static int dailyWage(int workingHrPerDay) {

        int WAGE_PER_HRS = 20;

        int dailyWage = WAGE_PER_HRS * workingHrPerDay;
        System.out.println(dailyWage);

        return dailyWage;
    }

    /**
     * Purpose - Execution of all methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

         dailyWage(attendanceCheck());
    }
}