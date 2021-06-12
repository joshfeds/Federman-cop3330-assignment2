package ex33.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base33Test {
    @Test
    void isCorrectResponse_true() {
        Base33 program = new Base33();

        boolean expected = true;
        boolean actual = program.isCorrectResponse(2, 2);
        assertEquals(expected, actual);
    }
    @Test
    void isCorrectResponse_false() {
        Base33 program = new Base33();

        boolean expected = false;
        boolean actual = program.isCorrectResponse(3, 1);
        assertEquals(expected, actual);
    }
}