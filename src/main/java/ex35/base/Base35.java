package ex35.base;
import java.util.ArrayList;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman

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
