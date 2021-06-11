package ex27.basepackage;

public class firstNameValidator {
    public String checkFirstName(String fname, String lname){
        if(fname.length() == 0){
            if(lname.length() == 0){
                return "The first and ";
            }
            else
                return "The first name must be filled in.\n";
        }
        else if(fname.length() < 2){
            if(lname.length() < 2)
                return "The first name must be at least two characters.\n";
            else
                return "The first and ";
        }
        else
            return "There were no errors found in the first name\n";
    }
}
