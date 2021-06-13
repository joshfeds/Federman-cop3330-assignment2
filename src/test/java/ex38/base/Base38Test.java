package ex38.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base38Test {

    @Test
    void onlyEvenValues_not_in_order() {
        Base38 program = new Base38();
        String base = "4 1 3 2";
        String [] arrayBase = base.split(" ");

        String [] expected = {"4", "" , "", "2"};
        String [] actual = program.onlyEvenValues(arrayBase);
        assertArrayEquals(expected, actual);
    }
    @Test
    void onlyEvenValues_in_order() {
        Base38 program = new Base38();
        String base = "1 2 3 4 5 6 7 8";
        String [] arrayBase = base.split(" ");

        String [] expected = {"", "2" , "", "4", "", "6", "", "8"};
        String [] actual = program.onlyEvenValues(arrayBase);
        assertArrayEquals(expected, actual);
    }
}