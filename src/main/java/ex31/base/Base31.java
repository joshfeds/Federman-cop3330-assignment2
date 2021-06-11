package ex31.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Base31 {
    public static final Scanner input = new Scanner(System.in);
    public boolean isNumber(String value){
        if(value.matches("[0-9]+"))
            return true;
        else
            return false;
    }
    public int getAge(){
        System.out.print("What is your age?");
        String age = input.nextLine();
        boolean isNumber = isNumber(age);

        while(!isNumber){
            System.out.print("Please enter a numerical value");
            age = input.nextLine();
            isNumber = isNumber(age);
        }
        return Integer.parseInt(age);
    }
    public int getRHR(){
        System.out.print("What is your resting heart rate?");
        String rhr = input.nextLine();
        boolean isNumber = isNumber(rhr);

        while(!isNumber){
            System.out.print("Please enter a numerical value");
            rhr = input.nextLine();
            isNumber = isNumber(rhr);
        }
        return Integer.parseInt(rhr);
    }
    public float doMath(int age, int restingHR, float intensity){
        return (((220 - age) - restingHR) * intensity) + restingHR;
    }
    public void displayTable(int age, int restingHR){
        System.out.printf("Resting Pulse: %d          Age: %d\n", restingHR, age);
        System.out.print("Intensity       | Rate\n");
        System.out.print("________________|_____\n");
        float intensity = 0.55F;

        for(int i = 0; i < 9; i++){
            float bpm = doMath(age, restingHR, intensity);

            float intensityAsPercentage = intensity * 100F;
            System.out.printf("%.0f", intensityAsPercentage);
            System.out.print("%             | ");
            System.out.printf("%.0f bpm\n", bpm);
            intensity += .05F;
        }

    }
    public static void main(String[] args){
        Base31 program = new Base31();
        int age = program.getAge();
        int bpm = program.getRHR();
        program.displayTable(age, bpm);
    }
}
