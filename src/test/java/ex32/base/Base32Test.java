package ex32.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base32Test {

    @Test
    void isDifficulty1_true() {
        Base32 program = new Base32();

        boolean expected = true;
        boolean actual = program.isDifficulty("1");
        assertEquals(expected, actual);
    }
    @Test
    void isDifficulty2_true() {
        Base32 program = new Base32();

        boolean expected = true;
        boolean actual = program.isDifficulty("2");
        assertEquals(expected, actual);
    }
    @Test
    void isDifficulty3_true() {
        Base32 program = new Base32();

        boolean expected = true;
        boolean actual = program.isDifficulty("3");
        assertEquals(expected, actual);
    }
    @Test
    void isDifficulty_false() {
        Base32 program = new Base32();

        boolean expected = false;
        boolean actual = program.isDifficulty("bruh");
        assertEquals(expected, actual);
    }
    @Test
    void isNumber_three_digit() {
        Base32 program = new Base32();

        boolean expected = true;
        boolean actual = program.isNumber("500");
        assertEquals(expected, actual);
    }
    @Test
    void isNumber_two_digit() {
        Base32 program = new Base32();

        boolean expected = true;
        boolean actual = program.isNumber("50");
        assertEquals(expected, actual);
    }
    @Test
    void isNumber_false() {
        Base32 program = new Base32();

        boolean expected = false;
        boolean actual = program.isNumber("Dior Dior");
        assertEquals(expected, actual);
    }

    @Test
    void isHigher_false() {
        Base32 program = new Base32();

        boolean expected = false;
        boolean actual = program.isHigher(58, 100);
        assertEquals(expected, actual);
    }
    @Test
    void isHigher_true() {
        Base32 program = new Base32();

        boolean expected = true;
        boolean actual = program.isHigher(487, 435);
        assertEquals(expected, actual);
    }
}