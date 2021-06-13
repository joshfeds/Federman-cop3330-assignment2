package ex38.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Base38 {
    public static final Scanner input = new Scanner(System.in);
    public String getNumbers(){
        System.out.print("Enter a list of numbers, separated by spaces: ");
        return input.nextLine();
    }
    public boolean isEven(int number){
        if(number % 2 == 0)
            return true;
        else
            return false;
    }
    public String [] onlyEvenValues(String [] numberArray){
        String [] tempArray = new String[numberArray.length];

        for(int i = 0; i < numberArray.length; i++){

                int number = Integer.parseInt(numberArray[i]);
                if(isEven(number))
                    tempArray[i] = numberArray[i];
                else
                    tempArray[i] = "";

        }
        return tempArray;
    }
    public void printNewArray(String [] numbersEven){
        System.out.print("The even numbers are ");
        for(int i = 0; i < numbersEven.length; i++){
            System.out.print(numbersEven[i] + " ");
        }
    }
    public static void main(String[] args) {
        Base38 program = new Base38();
        String numbers = program.getNumbers();
        String [] numbersArray = numbers.split(" ");
        numbersArray = program.onlyEvenValues(numbersArray);
        program.printNewArray(numbersArray);
    }
}
