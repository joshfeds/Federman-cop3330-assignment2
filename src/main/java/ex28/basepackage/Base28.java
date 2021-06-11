package ex28.basepackage;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 *
 */

public class Base28 {
    public static final Scanner input = new Scanner(System.in);
    public float addNumbers(String [] number){
        float total = 0;
        float newNumber;
        for(int i = 0; i < 5; i++){

            if(number[i].matches("[0-9-.]+")){
                newNumber = Float.parseFloat(number[i]);
                total += newNumber;
            }

        }
        return total;
    }
    public void printResult(float answer){
        System.out.printf("The total is %.2f", answer);
    }
    public String [] getNumbers(){
        String [] number = new String[5];
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            number[i] = input.nextLine();
        }
        return number;
    }
    public static void main(String[] args){
        Base28 program = new Base28();
        String [] numbers = program.getNumbers();
        float answer = program.addNumbers(numbers);
        program.printResult(answer);
    }
}
