package ex27.base;

public class zipValidator {
    public String checkZip(String zip){
        if(zip.length() != 5)
            return "The zipcode must be a 5 digit number.\n";
        if(!zip.matches("[0-9]+"))
            return "The zipcode must be a 5 digit number.\n";
        else
            return "There are no errors in the zipcode.\n";
    }
}
