package ex30.base;

import ex29.base.Base29;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base30Test {

    @Test
    void doMath_equals_42() {
        Base30 program = new Base30();

        int expected = 42;
        int actual = program.doMath(6,7);
        assertEquals(expected, actual);
    }
    @Test
    void doMath_equals_10() {
        Base30 program = new Base30();

        int expected = 10;
        int actual = program.doMath(2,5);
        assertEquals(expected, actual);
    }
    @Test
    void doMath_equals_110() {
        Base30 program = new Base30();

        int expected = 110;
        int actual = program.doMath(11,10);
        assertEquals(expected, actual);
    }
}