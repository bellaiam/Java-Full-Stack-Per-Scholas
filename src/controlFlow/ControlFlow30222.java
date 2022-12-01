package controlFlow;

import java.util.Scanner;

public class ControlFlow30222 {
    //Write a program that declares 1 integer variable x, and then assigns 7 to it.
    // Write an if statement to print out “Less than 10” if x is less than 10.
    // Change x to equal 15, and notice the result (console should not display anything).
    public static void main(String[] args){
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
        problem6();
        problem7();
    }
    public static void problem1() {
        int x = 7;
        if (x < 10) {
            System.out.println("x is less than 10");
        }
        x = 15;
    }
    public static void problem2() {
        //Write a program that declares 1 integer variable x, and then assigns 7 to it.
        // Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10” if x is greater than 10.
        // Change x to 15 and notice the result.
        int x = 7;
        if (x < 10) {
            System.out.println("x is less than 10");
        }
        if (x > 10) {
            System.out.println("x is greater than 10");
        }
        x = 15;
    }
    public static void problem3() {
        //Write a program that declares 1 integer variable x, and then assigns 15 to it.
        // Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
        // “Between 10 and 20” if x is greater than 10 but less than 20, and
        // “Greater than or equal to 20” if x is greater than or equal to 20.
        // Change x to 50 and notice the result.
        int x = 15;
        if (x < 10) {
            System.out.println("x is less than 10");
        }
        if (x > 20) {
            System.out.println("x is greater than 20");
        }
        if (x >10 && x < 20) {
            System.out.println("Greater than or equal to 20");
        }
        x = 15;
    }
    public static void problem4(){
    //4. Write a program that declares 1 integer variable x, and then assigns 15 to it.
        // Write an if-else statement that prints “Out of range” if the number is less than 10 or
        // greater than 20 and prints “In range” if the number is between 10 and 20 (including equal
        // to 10 or 20).
        // Change x to 5 and notice the result.
        int x = 15;
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        }
        else {
            System.out.println("In range");
        }
    }
    public static void problem5(){
        //Write a program that uses if-else-if statements to print out grades A, B, C, D, F
        // according to the following criteria:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: <60
        //Use the Scanner class to accept a number score from the user to determine the letter grade.
        // Print out “Score out of range” if the score is less than 0 or greater than 100.
        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();
        if (grade >=90) {
            System.out.println("A");
        } else if (grade >=80 && grade < 90) {
            System.out.println("B");
        } else if (grade >=70 && grade < 80) {
            System.out.println("C");
        } else if (grade >=60 && grade < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
    public static void problem6(){
        //  Write a program that accepts an integer between 1 and 7 from the user.
        //  Use a switch statement to print out the corresponding weekday.
        //  Print “Out of range” if the number is less than 1 or greater than 7.
        //  Do not forget to include “break” statements in each of your cases.
        int day = 2;

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }
    }
    public static void problem7(){
        //  Create a program that lets the users input their filing status and income.
        //  Display how much tax the user would have to pay according to status and income.
        //The U.S. federal personal income tax is calculated based on the filing status and taxable income.
        //There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately,
        // and Head of Household.
        //The tax rates for 2009 are shown below.
        Scanner s = new Scanner(System.in);
        String status = "";
        double taxRate = 0;
        int income = s.nextInt();
        if (status.equals("single")) {
            if (income <=8350) {
               taxRate = income * 0.1;
            } else if (income <=33950) {
                taxRate = income * 0.15;
            } else if (income <=82250) {
                taxRate = income * 0.25;
            } else if (income <=171550) {
                taxRate = income * 0.28;
            }  else if (income <=372950) {
                taxRate = income * 0.33;
            } else {
                taxRate = income * 0.35;
            }
        }
        if (status.equals("married filing jointly")) {
            if (income <= 16700) {
                taxRate = income * 0.1;
            } else if (income <=67900) {
                taxRate = income * 0.15;
            } else if (income <=137050) {
                taxRate = income * 0.25;
            } else if (income <=208850) {
                taxRate = income * 0.28;
            }  else if (income <=372950) {
                taxRate = income * 0.33;
            } else {
                taxRate = income * 0.35;
            }

        }
        if (status.equals("married filing separately")) {
            if (income <=8350) {
                taxRate = income * 0.1;
            } else if (income <=33950) {
                taxRate = income * 0.15;
            } else if (income <=68525) {
                taxRate = income * 0.25;
            } else if (income <=104425) {
                taxRate = income * 0.28;
            }  else if (income <=186475) {
                taxRate = income * 0.33;
            } else {
                taxRate = income * 0.35;
            }
        }
        if (status.equals("head of household")) {
            if (income <=11950) {
                taxRate = income * 0.1;
            } else if (income <=45500) {
                taxRate = income * 0.15;
            } else if (income <=117450) {
                taxRate = income * 0.25;
            } else if (income <=190200) {
                taxRate = income * 0.28;
            }  else if (income <=372950) {
                taxRate = income * 0.33;
            } else {
                taxRate = income * 0.35;
            }
        }
    }
}
