package ex36.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Base36Test {

    @Test
    void isDone_true() {
        Base36 program = new Base36();
        boolean expected = true;
        boolean actual = program.isDone("done");
        assertEquals(expected, actual);
    }
    @Test
    void isDone_false() {
        Base36 program = new Base36();
        boolean expected = false;
        boolean actual = program.isDone("500");
        assertEquals(expected, actual);
    }
    @Test
    void isNumber_true() {
        Base36 program = new Base36();
        boolean expected = true;
        boolean actual = program.isNumber("321.85");
        assertEquals(expected, actual);
    }
    @Test
    void isNumber_false_period() {
        Base36 program = new Base36();
        boolean expected = false;
        boolean actual = program.isNumber(".");
        assertEquals(expected, actual);
    }
    @Test
    void isNumber_false_word() {
        Base36 program = new Base36();
        boolean expected = false;
        boolean actual = program.isNumber("Woke up this morning");
        assertEquals(expected, actual);
    }

    @Test
    void getAverage() {
        Base36 program = new Base36();
        ArrayList<Float> list = new ArrayList <>();
        list.add(100F);
        list.add(200F);
        list.add(1000F);
        list.add(300F);
        float expected = 400.0F;
        float actual = program.getAverage(list);
        assertEquals(expected, actual);
    }

    @Test
    void getMin() {
        Base36 program = new Base36();
        ArrayList<Float> list = new ArrayList <>();
        list.add(100F);
        list.add(200F);
        list.add(1000F);
        list.add(300F);
        float expected = 100F;
        float actual = program.getMin(list);
        assertEquals(expected, actual);
    }

    @Test
    void getMax() {
        Base36 program = new Base36();
        ArrayList<Float> list = new ArrayList <>();
        list.add(100F);
        list.add(200F);
        list.add(1000F);
        list.add(300F);
        float expected = 1000F;
        float actual = program.getMax(list);
        assertEquals(expected, actual);
    }

    @Test
    void getSTD() {
        Base36 program = new Base36();
        ArrayList<Float> list = new ArrayList <>();
        list.add(100F);
        list.add(200F);
        list.add(1000F);
        list.add(300F);
        float expected = 353.5534F;
        float actual = program.getSTD(list, 400F);
        assertEquals(expected, actual);
    }
}