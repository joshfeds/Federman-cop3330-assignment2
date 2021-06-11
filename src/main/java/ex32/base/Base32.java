package ex32.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 * Write a Guess the Number game that has three levels of difficulty.
 * The first level of difficulty would be a number between 1 and 10.
 * The second difficulty set would be between 1 and 100.
 * The third difficulty set would be between 1 and 1000.

Prompt for the difficulty level, and then start the game.
* The computer picks a random number in that range and prompts the player to guess that number.
* Each time the player guesses, the computer should give the player a hint as to whether the number is
* too high or too low.
* The computer should also keep track of the number of guesses.
* Once the player guesses the correct number, the computer should present the number of guesses and ask
* if the player would like to play again.

Example Output
Let's play Guess the Number!

Enter the difficulty level (1, 2, or 3): 1
I have my number. What's your guess? 5
Too low. Guess again: 7         can do function for isHigher to test
Too low. Guess again: 9
You got it in 3 guesses!

Do you wish to play again (Y/N)? y

Enter the difficulty level (1, 2, or 3): 3
I have my number. What's your guess? 500
Too low. Guess again: 750
Too high. Guess again: 600
Too low. Guess again: 700
Too low. Guess again: 725
Too high. Guess again: 715
Too high. Guess again: 710
Too high. Guess again: 705
Too high. Guess again: 701
Too low. Guess again: 702
You got it in 10 guesses!

Do you wish to play again (Y/N)? n
Constraints
Don’t allow any non-numeric data entry.
During the game, count non-numeric entries as wrong guesses.
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
