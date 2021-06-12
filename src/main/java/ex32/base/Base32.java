package ex32.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Base32 {
    public static final Scanner input = new Scanner(System.in);
    public boolean isDifficulty(String value){
        if(value.matches("[1-3]+"))
            return true;
        else
            return false;
    }
    public boolean isNumber(String value){
        if(value.matches("[0-9]+"))
            return true;
        else
            return false;
    }
    public boolean isHigher(int value, int randomNumber){
        if(value > randomNumber)
            return true;
        else
            return false;
    }
    public int difficultyLvl(){
        System.out.print("Let's play Guess the Number!\n\n" +
                "Enter the difficulty level (1, 2, or 3): ");
        String level = input.nextLine();
        boolean isDifficulty = isDifficulty(level);
        while(!isDifficulty){
            System.out.print("Please enter the difficulty level (1, 2, or 3): ");
            level = input.nextLine();
            isDifficulty = isDifficulty(level);
        }
        return Integer.parseInt(level);
    }
    public String randomNumber(int level){
        int upperBoundary;
        int lowerBoundary;
        int random_number = 0;
        switch(level){
            case 1:
                lowerBoundary = 1;
                upperBoundary = 10;
                random_number = (int)Math.floor(Math.random()*(upperBoundary-lowerBoundary+1)+lowerBoundary);
                break;
            case 2:
                lowerBoundary = 1;
                upperBoundary = 100;
                random_number = (int)Math.floor(Math.random()*(upperBoundary-lowerBoundary+1)+lowerBoundary);
                break;
            case 3:
                lowerBoundary = 1;
                upperBoundary = 1000;
                random_number = (int)Math.floor(Math.random()*(upperBoundary-lowerBoundary+1)+lowerBoundary);
                break;
            default:
                break;
        }
        String randNumberString = Integer.toString(random_number);
        return randNumberString;
    }
    public String guessNumber(String randomNumber){
        System.out.print("I have my number. What's your guess? ");
        String guess = input.nextLine();
        boolean isNumber = isNumber(guess);
        int count = 1;
            while(!randomNumber.equalsIgnoreCase(guess)){
                count++;
                if(!isNumber){
                    System.out.print("That is not a number :( Guess again: ");
                    guess = input.nextLine();
                    isNumber = isNumber(guess);
                }
                else{
                    int guessNumber = Integer.parseInt(guess);
                    int randNumberDigit = Integer.parseInt(randomNumber);
                        if(isHigher(guessNumber, randNumberDigit)){
                            System.out.print("Too high. Guess again: ");
                            guess = input.nextLine();
                            isNumber = isNumber(guess);
                        }
                        else{
                            System.out.print("Too low. Guess again: ");
                            guess = input.nextLine();
                            isNumber = isNumber(guess);
                        }
                }

            }
         System.out.printf("You got it in %d guesses!\n\n" +
                 "Do you wish to play again (Y/N)? ", count);
            String response = input.nextLine();
            while(!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n")){
                System.out.print("Do you wish to play again (Y/N)? ");
                response = input.nextLine();
            }
            return response;
        }

    public static void main(String[] args){
        Base32 program = new Base32();
        int level = program.difficultyLvl();
        String randomNumber = program.randomNumber(level);
        String playAgain = program.guessNumber(randomNumber);
        while(playAgain.equalsIgnoreCase("y")){
            level = program.difficultyLvl();
            randomNumber = program.randomNumber(level);
            playAgain = program.guessNumber(randomNumber);
        }
    }
}
