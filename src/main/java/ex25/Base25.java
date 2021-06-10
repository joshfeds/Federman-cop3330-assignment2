package ex25;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.
Constraints
Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.
 */
public class Base25 {
    public static final Scanner input = new Scanner(System.in);

    public String createPassword() {
        System.out.print("What is your password?");
        return input.nextLine();
    }
    public int passwordValidator(String password){
        password = password.toLowerCase(Locale.ROOT);
        int passwordLength = password.length();


        Pattern passwordPattern = Pattern.compile("[^a-z0-9]+", Pattern.CASE_INSENSITIVE);
        Matcher passwordMatcher = passwordPattern.matcher(password);
        boolean specialCharacter = passwordMatcher.find();

        if(passwordLength < 8){
            if(!password.matches("[a-z]+"))
                return 1;
            else
                return 2;
        }
        else{
            if(!specialCharacter){
                if(!password.matches("[a-z]+")){
                    if(password.matches("[0-9]+"))
                        return 1;
                    else
                        return 3;
                }
                else
                    return 2;

            }
            else{
                if(!password.matches("[a-z!-/:-@Z-`z-~]+")){
                        if(password.matches("[0-9!-/:-@Z-`z-~]+"))
                            return 1;
                        else
                            return 4;
                }
                else
                    return 2;
            }

        }

    }
    public void passwordResult(int passwordStrength, String password){
        String statement;
        switch(passwordStrength){
            case 1:
                statement = "The password '" + password + "' is a very weak password.";
                break;
            case 2:
                statement = "The password '" + password + "' is a weak password.";
                break;
            case 3:
                statement = "The password '" + password + "' is a strong password.";
                break;
            case 4:
                statement = "The password '" + password + "' is a very strong password.";
                break;
            default:
                statement = "This should not be possible";
        }
        System.out.print(statement);
    }
    public static void main(String[] args){
        Base25 program = new Base25();
        String password = program.createPassword();
        int passwordStrength = program.passwordValidator(password);
        program.passwordResult(passwordStrength, password);
    }
}
