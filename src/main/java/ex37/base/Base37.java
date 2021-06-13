package ex37.base;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Base37 {
    public static final Scanner input = new Scanner(System.in);
    public int getLength(){
        System.out.print("What's the minimum length? ");
        return input.nextInt();
    }
    public int getSpecial(){
        System.out.print("How many special characters? ");
        return input.nextInt();
    }
    public int getNumbers(){
        System.out.print("How many numbers? ");
        return input.nextInt();
    }
    public boolean isLetterTime(int letter, int number, int special){
        if(letter < number + special)
            return true;
        else
            return false;
    }
    public List <Character> createPassword(int pwLength, int special, int number,
                                             List <Character> passwordString) {
        Random randomGenerator = new Random();
        int letterCount = 0;
        int specialCount = 0;
        int numberCount = 0;

        for (int i = 0; i < pwLength; i++) {
            if (isLetterTime(letterCount, numberCount, specialCount)) {
                char letter = (char) ('a' + randomGenerator.nextInt(26));
                passwordString.add(letter);
                letterCount++;
            } else {
                if (numberCount != number) {
                    char randNumb = (char) ('0' + randomGenerator.nextInt(9));
                    passwordString.add(randNumb);
                    numberCount++;
                } else {
                    if (specialCount != special) {
                        char randSpec = (char) ('!' + randomGenerator.nextInt(9));
                        passwordString.add(randSpec);
                        specialCount++;
                    }
                }
            }
        }
        while (randomGenerator.nextInt(2) != 1) {
            if (letterCount < specialCount + numberCount) {
                char letter = (char) ('a' + randomGenerator.nextInt(26));
                passwordString.add(letter);
                letterCount++;
            } else {
                if (passwordString.size() % 2 == 0 && numberCount != number) {
                    char randNumb = (char) ('0' + randomGenerator.nextInt(9));
                    passwordString.add(randNumb);
                    numberCount++;
                } else {
                    if (specialCount != special) {
                        char randSpec = (char) ('!' + randomGenerator.nextInt(9));
                        passwordString.add(randSpec);
                        specialCount++;
                    }
                }
            }
        }
        return passwordString;
    }
    public void printPassword(List <Character> passwordString){
        System.out.print("Your password is ");
        for(int i = 0; i < passwordString.size(); i++){
            System.out.print(passwordString.get(i));
        }
    }
    public static void main(String[] args) {
        Base37 program = new Base37();
        List<Character> passwordString = new ArrayList <>();
        int pwLength = program.getLength();
        int special = program.getSpecial();
        int number = program.getNumbers();

        passwordString = program.createPassword(pwLength, special, number, passwordString);
        program.printPassword(passwordString);
    }
}
