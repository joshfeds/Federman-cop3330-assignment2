package ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base31Test {

    @Test
    void isNumber_true() {
        Base31 program = new Base31();

        boolean expected = true;
        boolean actual = program.isNumber("22");
        assertEquals(expected, actual);
    }
    @Test
    void isNumber_false() {
        Base31 program = new Base31();

        boolean expected = false;
        boolean actual = program.isNumber("Pop0ff");
        assertEquals(expected, actual);
    }
    @Test
    void doMath_55_percent() {
            Base31 program = new Base31();

            float expected = 138.15F;
            float actual = program.doMath(22,65,0.55F);
            assertEquals(expected, actual);
        }
    @Test
    void doMath_80_percent() {
        Base31 program = new Base31();

        float expected = 171.4F;
        float actual = program.doMath(22,65,0.80F);
        assertEquals(expected, actual);
    }
}