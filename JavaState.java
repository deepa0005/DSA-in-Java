//conditional statements in Java
// This file contains examples of conditional statements in Java.
// It includes a simple example of using if-else statements to determine discounts based on age.

import java.util.*;

public class JavaState {
    public static void main(String args[]) {
        /*
         * int age = 16;
         * if(age>=18){
         * System.out.println("you got 30% discount on your first purchase");
         * }if(age<=18 && age>=16){
         * System.out.println("you got 20% discount on ur first purchase");
         * }
         * else{
         * System.out.println("you got 10% discount on your first purchase");
         * }
         */

        // largest of two numbvers
        // Scanner sc = new Scanner(System.in);
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // if (A > B) {
        // System.out.println("A is greater than B");
        // } else if (A < B) {
        // System.out.println("B is greater than A");
        // } else {
        // System.out.println("A is equal to B");
        // }

        // //even or odd
        // int num = 8;
        // if(num % 2 == 0){
        // System.out.println(num + " is an even number");
        // } else{
        // System.out.println(num + " is an odd number");
        // }
        // }

        // income tax claculation
        // int income = 500000;
        // if (income < 500000){
        // System.out.println("No tax to be paid");
        // }else if (income >= 500000 && income < 1000000){
        // System.out.println("10% tax to be paid");
        // }
        // else if (income >= 1000000 && income < 2000000){
        // System.out.println("20% tax to be paid");
        // }

        // largest of three numbers
        // Scanner sc = new Scanner(System.in);
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();

        // if(A>B && A>C){
        // System.out.println("A is the largest number");
        // }else if(B>C){
        // System.out.println("B is the largest number");
        // }else{
        // System.out.println("C is the largest number");
        // }

        // ternary operator example
        // Scanner sc = new Scanner(System.in);
        // int marks = sc.nextInt();
        // int passingMarks = 33;
        // String result = (marks >= passingMarks) ? "You passed the exam" : "You failed
        // the exam";
        // System.out.println(result);
        // sc.close();

        // check if a number is positive or negative

        // Scanner sc = new Scanner (System.in);
        // int num = sc.nextInt();
        // if (num >=0){
        // System.out.println(num + " is a positive number");

        // }else{
        // System.out.println(num + " is a negative number");
        // }

        // check the fever status of a person
        // double temp = 103.5;
        // if(temp >=103.5){
        // System.out.println("You have a high fever, please consult a doctor.");
        // }else if(temp >= 100.4 && temp < 103.5){
        // System.out.println("You have a moderate fever, rest and hydrate.");
        // }else if (temp >= 98.6 && temp < 100.4){
        // System.out.println("You have a normal temperature, no fever.");
        // }

        // switch case example
        // weekday example
        // Scanner sc = new Scanner(System.in);
        // int Day = sc.nextInt();
        // switch (Day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:System.out.println("Invalid day number, please enter a number between 1 and 7.");
        //         break;
        // }



        //leap year example
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        }else { 
            System.out.println(year + " is not a leap year.");
        }
    }
}
