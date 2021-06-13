package ex39.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base39Test {

    @Test
    void isZero() {
        Base39 program = new Base39();
        boolean expected = true;
        boolean actual = program.isZero(0);
        assertEquals(expected, actual);
    }
    @Test
    void isZero_false() {
        Base39 program = new Base39();
        boolean expected = false;
        boolean actual = program.isZero(5);
        assertEquals(expected, actual);
    }
}