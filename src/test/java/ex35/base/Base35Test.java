package ex35.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base35Test {

    @Test
    void isEmpty() {
        Base35 program = new Base35();
        boolean expected = true;
        boolean actual = program.isEmpty("");
        assertEquals(expected, actual);
    }
    @Test
    void isEmpty_not() {
        Base35 program = new Base35();
        boolean expected = false;
        boolean actual = program.isEmpty("Seven");
        assertEquals(expected, actual);
    }
    @Test
    void isWinner() {
        Base35 program = new Base35();
        boolean expected = true;
        boolean actual = program.isWinner(4,4);
        assertEquals(expected, actual);
    }
    @Test
    void isWinner_false() {
        Base35 program = new Base35();
        boolean expected = false;
        boolean actual = program.isWinner(11,8);
        assertEquals(expected, actual);
    }
}