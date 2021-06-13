package ex27.base;

public class lastNameValidator {
    public String checkLastName(String fname, String lname){
        if(lname.length() == 0){
            if(fname.length() == 0){
                return "last names must be filled in.\n" +
                        "The first and last names must be at least two characters.\n";
            }
            else
                return "The last name must be filled in.\n";
        }
        else if(fname.length() < 2){
            if(lname.length() < 2)
                return "last names must have at least two characters.\n";
            else
                return "The first name must be at least two characters.\n";
        }
        else
            return "There were no errors found in the last name\n";
    }
}
