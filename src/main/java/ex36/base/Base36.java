package ex36.base;
import java.util.ArrayList;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Base36 {
    public static final Scanner input = new Scanner(System.in);
    public boolean isDone(String test){
        if(test.equalsIgnoreCase("done"))
            return true;
        else
            return false;
    }
    public boolean isNumber(String test){
        if(test.equalsIgnoreCase("."))
            return false;
        else if(test.matches("[0-9.]+"))
            return true;
        else
            return false;
    }
    public ArrayList<Float> getNumbers(ArrayList<Float> numberArray){
        System.out.print("Enter a number: ");
        String number = input.nextLine();

        while(!isDone(number)){
            while(!isNumber(number)){
                System.out.print("Enter a number: ");
                number = input.nextLine();
            }
            float stringToNumber = Float.parseFloat(number);
            numberArray.add(stringToNumber);
            System.out.print("Enter a number: ");
            number = input.nextLine();
        }
        return numberArray;
    }
    public float getAverage(ArrayList<Float> numberArray){
        float total = 0;
        for(int i = 0; i < numberArray.size(); i++){
            total += numberArray.get(i);
        }
        return total / numberArray.size();
    }
    public float getMin(ArrayList<Float> numberArray){
        float min = Float.MAX_VALUE;
        for(int i = 0; i < numberArray.size(); i++){
            if(min > numberArray.get(i))
                min = numberArray.get(i);
        }
        return min;
    }
    public float getMax(ArrayList<Float> numberArray){
        float max = Float.MIN_VALUE;
        for(int i = 0; i < numberArray.size(); i++){
            if(max < numberArray.get(i))
                max = numberArray.get(i);
        }
        return max;
    }
    public float getSTD(ArrayList<Float> numberArray, float average){
        float std = 0;
        for(int i = 0; i < numberArray.size(); i++){
            std += Math.pow(numberArray.get(i) - average, 2);
        }
        float number = std/numberArray.size();
        return (float) Math.sqrt(number);
    }
    public void printResults(ArrayList<Float> numberArray, float average, float min, float max, float std){
        System.out.print("Numbers: ");
        for(int i = 0; i < numberArray.size(); i++){
            System.out.print(numberArray.get(i));
            if(i != numberArray.size() - 1)
                System.out.print(", ");
        }
        System.out.print("\nThe average is " + average +
                        "\nThe min is " + min +
                        "\nThe max is " + max +
                        "\nThe standard deviation is " + std);
    }
    public static void main(String[] args) {
        Base36 program = new Base36();
        ArrayList <Float> numberArray = new ArrayList <>();
        numberArray = program.getNumbers(numberArray);
        float average = program.getAverage(numberArray);
        float min = program.getMin(numberArray);
        float max = program.getMax(numberArray);
        float std = program.getSTD(numberArray, average);
        program.printResults(numberArray, average, min, max, std);
    }
}
