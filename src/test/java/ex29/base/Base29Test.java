package ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base29Test {

    @Test
    void isProperNumber_true() {
        Base29 program = new Base29();

        boolean expected = true;
        boolean actual = program.isProperNumber("10");
        assertEquals(expected, actual);
    }
    @Test
    void isProperNumber_false_0() {
        Base29 program = new Base29();

        boolean expected = false;
        boolean actual = program.isProperNumber("0");
        assertEquals(expected, actual);
    }
    @Test
    void isProperNumber_false_character() {
        Base29 program = new Base29();

        boolean expected = false;
        boolean actual = program.isProperNumber("I want to do MATH!!!!!");
        assertEquals(expected, actual);
    }

    @Test
    void doMath_divides_even() {
        Base29 program = new Base29();

        float expected = 18.0F;
        float actual = program.doMath("4");
        assertEquals(expected, actual);
    }
    @Test
    void doMath_divides_odd() {
        Base29 program = new Base29();

        float expected = 14.4F;
        float actual = program.doMath("5");
        assertEquals(expected, actual);
    }
}