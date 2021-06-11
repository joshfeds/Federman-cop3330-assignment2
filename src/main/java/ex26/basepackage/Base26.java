package ex26.basepackage;
import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
Write a program that will help you determine how many months it will take to pay off a credit card balance.
* The program should ask the user to enter the balance of a credit card, the APR of the card,
* and their monthly payment.
* The program should then return the number of months needed (rounded up to the next integer value).

The formula for this is

n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where

n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.
*
Example Output
What is your balance? 5000
What is the APR on the card (as a percent)? 12
What is the monthly payment you can make? 100
It will take you 70 months to pay off this card.
*
Constraints
Prompt for the card’s APR. Do the division internally.
Prompt for the APR as a percentage, not a decimal.
Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff,
* which returns the number of months.
Round fractions of a cent up to the next cent.
 */
public class Base26 {
    public static final Scanner input = new Scanner(System.in);
    public String getBalance(){
        System.out.print("What is your balance? ");
        return input.nextLine();
    }
    public String getAPR(){
        System.out.print("What is the APR on the card (as a percent)? ");
        return input.nextLine();
    }
    public String getPayment(){
        System.out.print("What is the monthly payment you can make? ");
        return input.nextLine();
    }
    public void printResult(float month){
        System.out.printf("It will take you %.0f months to pay off this card.", month);
    }
    public static void main(String[] args){
        Base26 program = new Base26();
        PaymentCalculator calculator = new PaymentCalculator();
        String balance = program.getBalance();
        String apr = program.getAPR();
        String payment = program.getPayment();

        float months = calculator.calculateMonthsUntilPaidOff(balance, apr, payment);
        program.printResult(months);
    }
}
