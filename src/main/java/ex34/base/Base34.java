package ex34.base;
import java.util.ArrayList;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Base34 {
    public static final Scanner input = new Scanner(System.in);
    public ArrayList<String> addToList( ArrayList<String> list){
        list.add("Joshua Federman");
        list.add("Daniel Torres");
        list.add("Jenna Bulldosa");
        list.add("Femmy Fatale");
        list.add("Tony Soprano");
        return list;
    }
    public void printEmployeeList(ArrayList<String> list, int size){
        System.out.printf("There are %d employees:\n", size);
        for(int i = 0; i < size; i++){
            System.out.println(list.get(i));
        }
    }
    public ArrayList<String> removeFromList( ArrayList<String> list){
        System.out.print("Enter an employee name to remove: ");
        String removeEmployee = input.nextLine();
        list.remove(removeEmployee);
        return list;
    }
    public int ListSize( ArrayList<String> list){
        return list.size();
    }
    public static void main(String [] args){
        Base34 program = new Base34();
        ArrayList <String> list = new ArrayList <>();
        list = program.addToList(list);
        int size = program.ListSize(list);
        program.printEmployeeList(list, size);
        list = program.removeFromList(list);
        size = program.ListSize(list);
        program.printEmployeeList(list, size);
    }
}
