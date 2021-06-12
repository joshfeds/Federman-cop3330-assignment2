package ex35.base;
import java.util.ArrayList;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 * Create a program that picks a winner for a contest or prize drawing.
 * Prompt for names of contestants until the user leaves the entry blank.
 * Then randomly select a winner.

Example Output
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.
Constraints
Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time.
* You may need to find another data structure, like an ArrayList.
 */
public class Base35 {
    public static final Scanner input = new Scanner(System.in);
    public boolean isEmpty(String test){
        if(test.isEmpty())
            return true;
        else
            return false;
    }
    public ArrayList<String> getNames (ArrayList<String> array){
        System.out.print("Enter a name: ");
        String name = input.nextLine();
        while(!isEmpty(name)){
            array.add(name);
            System.out.print("Enter a name: ");
            name = input.nextLine();
        }
        return array;
    }
    public int rng (ArrayList <String> array){
        int upper = array.size();
        int lower = 0;
        return (int)Math.floor(Math.random()*(upper-lower+1)+lower);
    }
    public boolean isWinner(int randNumber, int testNumber){
        if(randNumber == testNumber)
            return true;
        else
            return false;
    }
    public void getAnswer(ArrayList<String> array, int randNumber) {
        for (int i = 0; i < array.size(); i++) {
            if (isWinner(randNumber, i)){
                System.out.print("The winner is... " + array.get(i));
                break;
            }

        }
    }
    public static void main(String[] args){
        Base35 program = new Base35();
        ArrayList <String> array = new ArrayList <>();
        array = program.getNames(array);
        int randomNumber = program.rng(array);
        program.getAnswer(array, randomNumber);
    }
}
