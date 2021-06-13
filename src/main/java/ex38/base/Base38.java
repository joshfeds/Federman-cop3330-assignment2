package ex38.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
Create a program that prompts for a list of numbers, separated by spaces.
Have the program print out a new list containing only the even numbers.

Example Output
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.
Constraints
Convert the input to an array.
Many languages can easily convert strings to arrays with a built-in function that splits apart a string
based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this.
The function takes in the old array and returns the new array.
 */
public class Base38 {
    public static final Scanner input = new Scanner(System.in);
    public String getNumbers(){
        System.out.print("Enter a list of numbers, separated by spaces: ");
        return input.nextLine();
    }
    public String [] onlyEvenValues(String [] numberArray){
        String [] tempArray = new String[numberArray.length];

        for(int i = 0; i < numberArray.length; i++){

                int number = Integer.parseInt(numberArray[i]);
                if(number % 2 == 0)
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
