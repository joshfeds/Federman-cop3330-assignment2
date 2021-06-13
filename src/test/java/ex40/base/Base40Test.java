package ex40.base;

import ex39.base.Base39;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Base40Test {

    @Test
    void isZero() {
        Base40 program = new Base40();
        boolean expected = true;
        boolean actual = program.isZero(0);
        assertEquals(expected, actual);
    }
    @Test
    void isZero_false() {
        Base40 program = new Base40();
        boolean expected = false;
        boolean actual = program.isZero(8);
        assertEquals(expected, actual);
    }
    @Test
    void hasString_true(){
        Base40 program = new Base40();
        boolean expected = true;
        List<Map<String, String>> list = new ArrayList<>();

        list = program.getEmployeeIntoList(list);
        boolean actual = program.hasString("J", 0, list);
    }
    @Test
    void hasString_false(){
        Base40 program = new Base40();
        boolean expected = true;
        List<Map<String, String>> list = new ArrayList<>();

        list = program.getEmployeeIntoList(list);
        boolean actual = program.hasString("Sally", 2, list);
    }
}