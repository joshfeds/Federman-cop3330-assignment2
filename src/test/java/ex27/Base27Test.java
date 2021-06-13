package ex27;

import ex27.base.base27;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Base27Test {
    @Test
    void no_input() {
        base27 test = new base27();

       String expected = "The first and last names must be filled in.\n" +
               "The first and last names must be at least two characters.\n" +
               "The zipcode must be a 5 digit number.\n" +
               "The employee ID must be in the format of AA-1234.";
        ;
        String actual = test.validateInput("", "", "", "");
        assertEquals(expected, actual);
    }
    @Test
    void input_all_correct() {
        base27 test = new base27();

        String expected = "There were no errors found in the first name\n" +
                "There were no errors found in the last name\n" +
                "There are no errors in the zipcode.\n" +
                "There are no errors in the employee ID";
        ;
        String actual = test.validateInput("Daniel", "Torres", "32765", "DT-0613");
        assertEquals(expected, actual);
    }
    @Test
    void fname_less2_lname0_zip5_id7() {
        base27 test = new base27();

        String expected = "The first name must be at least two characters.\n" +
                "The last name must be filled in.\n" +
                "There are no errors in the zipcode.\n" +
                "There are no errors in the employee ID";

        ;
        String actual = test.validateInput("V", "", "32765", "VZ-1245");
        assertEquals(expected, actual);
    }
    @Test
    void fname0_lname_less2_zip_not5_id_not7() {
        base27 test = new base27();

        String expected = "The first name must be filled in.\n" +
                "last names must have at least two characters.\n" +
                "The zipcode must be a 5 digit number.\n" +
                "The employee ID must be in the format of AA-1234.";

        ;
        String actual = test.validateInput("", "B", "098", "BB-34718");
        assertEquals(expected, actual);
    }
    @Test
    void fname2_lname2_zip5_id7_wrong_letter() {
        base27 test = new base27();

        String expected = "There were no errors found in the first name\n" +
                "There were no errors found in the last name\n" +
                "There are no errors in the zipcode.\n" +
                "The employee ID must be in the format of AA-1234.";

        ;
        String actual = test.validateInput("Tony", "Soprano", "06054", "A-12345");
        assertEquals(expected, actual);
    }
    @Test
    void fname2_lname2_zip5_id7_wrong_dash() {
        base27 test = new base27();

        String expected = "There were no errors found in the first name\n" +
                "There were no errors found in the last name\n" +
                "There are no errors in the zipcode.\n" +
                "The employee ID must be in the format of AA-1234.";

        ;
        String actual = test.validateInput("Tony", "Soprano", "06054", "TS.1841");
        assertEquals(expected, actual);
    }
    @Test
    void fname2_lname2_zip5_id7_wrong_number() {
        base27 test = new base27();

        String expected = "There were no errors found in the first name\n" +
                "There were no errors found in the last name\n" +
                "There are no errors in the zipcode.\n" +
                "The employee ID must be in the format of AA-1234.";

        ;
        String actual = test.validateInput("Tony", "Soprano", "06054", "TS-9S12");
        assertEquals(expected, actual);
    }

}