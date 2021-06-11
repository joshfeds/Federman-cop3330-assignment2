package ex29.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 *
 */
public class Base29 {
    public static final Scanner input = new Scanner(System.in);
    public String getInvestmentTime(){
        System.out.print("What is the rate of return? ");
        return input.nextLine();
    }
    public boolean isProperNumber(String ror){
        if(ror.matches("0"))
            return false;
        else if(!ror.matches("[0-9]+"))
            return false;
        else
            return true;
    }
    public String becomeProperNumber(String ror, boolean isCorrectNumber){
        while(!isCorrectNumber){
            System.out.print("Sorry. That's not a valid input.\n" +
                    "What is the rate of return? ");
            ror = input.nextLine();
            isCorrectNumber = isProperNumber(ror);
        }
        return ror;
    }
    public float doMath(String ror){
        float rateOfChange = Float.parseFloat(ror);
        return 72 / rateOfChange;
    }
    public void printResult(float result){
        System.out.print("It will take " + Math.ceil(result) + " years to double your initial investment.");
    }
    public static void main(String[] args){
        Base29 program = new Base29();
        String ror = program.getInvestmentTime();
        boolean isCorrectNumber = program.isProperNumber(ror);

        if(!isCorrectNumber)
            ror = program.becomeProperNumber(ror, isCorrectNumber);

        float result = program.doMath(ror);
        program.printResult(result);
    }
}
