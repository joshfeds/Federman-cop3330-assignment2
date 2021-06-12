package ex34.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Base34Test {

    @Test
    void listSize_nothing_removed() {
        Base34 program = new Base34();
        ArrayList<String> list = new ArrayList <>();
        list.add("Patrick Fatrich");
        list.add("Colombian Missile");
        list.add("Juanity Tallica");
        list.add("Acea DeSalsa");
        list.add("Air-Min Reid");
        int expected = 5;
        int actual = program.ListSize(list);
        assertEquals(expected, actual);
    }
    @Test
    void listSize_one_removed() {
        Base34 program = new Base34();
        ArrayList<String> list = new ArrayList <>();
        list.add("Patrick Fatrich");
        list.add("Colombian Missile");
        list.add("Juanity Tallica");
        list.add("Air-Min Reid");
        int expected = 4;
        int actual = program.ListSize(list);
        assertEquals(expected, actual);
    }
}