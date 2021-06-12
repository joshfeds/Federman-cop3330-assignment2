package ex33.base;
import java.util.ArrayList;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman

 */
public class Base33 {
    public static final Scanner input = new Scanner(System.in);
    public void getQuestion(){
        System.out.print("What is your question for the 8 ball?");
        input.nextLine();
    }
    public ArrayList<String> addToList( ArrayList<String> list){
        list.add("Yes");
        list.add("No");
        list.add("Maybe");
        list.add("Ask again later");
        return list;
    }
    public int rng (){
        int upper = 3;
        int lower = 0;
        return (int)Math.floor(Math.random()*(upper-lower+1)+lower);
    }
    public boolean isCorrectResponse(int randNumber, int testNumber){
        if(randNumber == testNumber)
            return true;
        else
            return false;
    }
    public void getAnswer(ArrayList<String> list, int randNumber){
        for(int i = 0; i < 4; i++){
            if(isCorrectResponse(randNumber, i))
                System.out.print(list.get(i));
        }


    }
    public static void main(String [] args){
        Base33 program = new Base33();
        program.getQuestion();
        ArrayList <String> list = new ArrayList <>();
        list = program.addToList(list);
        int randNumber = program.rng();
        program.getAnswer(list, randNumber);

    }
}
