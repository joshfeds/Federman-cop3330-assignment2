package ex37.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base37Test {

    @Test
    void isLetterTime_true() {
        Base37 program = new Base37();
        boolean expected = true;
        boolean actual = program.isLetterTime(1,2,0);
        assertEquals(expected, actual);
    }
    @Test
    void isLetterTime_false_equal() {
        Base37 program = new Base37();
        boolean expected = false;
        boolean actual = program.isLetterTime(2,1,1);
        assertEquals(expected, actual);
    }
    @Test
    void isLetterTime_false_letter_greater() {
        Base37 program = new Base37();
        boolean expected = false;
        boolean actual = program.isLetterTime(4,2,1);
        assertEquals(expected, actual);
    }
}