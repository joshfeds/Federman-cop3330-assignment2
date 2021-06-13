package ex28;

import ex28.base.Base28;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Base28Test {
    @Test
    void default_example_case() {
        Base28 math = new Base28();

        float expected = 15.0F;
        String [] number = new String[5];
        number[0] = "1";
        number[1] = "2";
        number[2] = "3";
        number[3] = "4";
        number[4] = "5";
        float actual = math.addNumbers(number);
        assertEquals(expected, actual);
    }
    @Test
    void not_all_numbers() {
        Base28 math = new Base28();

        float expected = 10.0F;
        String [] number = new String[5];
        number[0] = "Sopranos is the ";
        number[1] = "2";
        number[2] = "3";
        number[3] = "best show";
        number[4] = "5";
        float actual = math.addNumbers(number);
        assertEquals(expected, actual);
    }
}