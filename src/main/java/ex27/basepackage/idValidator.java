package ex27.basepackage;

public class idValidator {
    public String checkID(String id){
        int letterCount;
        int numberCount;
        if(id.length() != 7)
            return "The employee ID must be in the format of AA-1234.";
        for(int i = 0; i < id.length(); i++){
            if(i == 0 || i == 1) {
                if (!Character.isLetter(id.charAt(i)))
                    return "The employee ID must be in the format of AA-1234.";
            }
            else if(i == 2){
                if(!id.contains("-"))
                    return "The employee ID must be in the format of AA-1234.";
            }
            else
                if(!Character.isDigit(id.charAt(i)))
                    return "The employee ID must be in the format of AA-1234.";
        }
        return "There are no errors in the employee ID";
    }
}
