package ex24;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 * Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt for both input strings and display the output as shown in the example that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.
Constraints
Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
Check that both words are the same length.
 */
public class Base24 {
    public static final Scanner input = new Scanner(System.in);

    public String string1() {
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n" +
                            "Enter the first string: ");

        return input.nextLine();
    }
    public String string2() {
        System.out.print("Enter the second string: ");
        return input.nextLine();
    }
    public boolean isAnagram(String string1, String string2){
        char [] string1Char = string1.toLowerCase(Locale.ROOT).toCharArray();
        char [] string2Char = string2.toLowerCase(Locale.ROOT).toCharArray();

        if(string1.length() != string2.length()){
            return false;
        }
        else{
            Arrays.sort(string1Char);
            Arrays.sort(string2Char);

            return Arrays.equals(string1Char, string2Char);
        }
    }
    public void printResult(boolean isAnagram, String string1, String string2){
        if(isAnagram)
            System.out.printf("\"%s and %s are anagrams.", string1, string2);
        else
            System.out.printf("\"%s and %s are not anagrams.", string1, string2);
    }
    public static void main(String[] args){
        Base24 program = new Base24();
        String word1 = program.string1();
        String word2 = program.string2();

        boolean isAnagram = program.isAnagram(word1,word2);
        program.printResult(isAnagram, word1, word2);
    }
}
