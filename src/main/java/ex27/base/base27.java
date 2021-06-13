package ex27.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 *
 */
public class base27 {
    public static final Scanner input = new Scanner(System.in);

    public String getFName(){
        System.out.print("Enter the first name: ");
        return input.nextLine();
    }
    public String getLName(){
        System.out.print("Enter the last name: ");
        return input.nextLine();
    }
    public String getZIP(){
        System.out.print("Enter the ZIP code: ");
        return input.nextLine();
    }
    public String getID(){
        System.out.print("Enter the employee ID: ");
        return input.nextLine();
    }
    public String validateInput(String fname, String lname, String zip, String id){
        firstNameValidator fNameProgram = new firstNameValidator();
        lastNameValidator lNameProgram = new lastNameValidator();
        zipValidator zipProgram = new zipValidator();
        idValidator idProgram = new idValidator();

        String fnameValidation = fNameProgram.checkFirstName(fname, lname);
        String lnameValidation = lNameProgram.checkLastName(fname, lname);
        String zipValidation = zipProgram.checkZip(zip);
        String idValidation = idProgram.checkID(id);

        String totalValidation = fnameValidation + lnameValidation + zipValidation + idValidation;
        return totalValidation;


    }
    public static void main(String[] args){
        base27 program = new base27();

        String fname = program.getFName();
        String lname = program.getLName();
        String zip = program.getZIP();
        String id = program.getID();

        String result = program.validateInput(fname, lname, zip, id);
        System.out.print(result);
    }
}
