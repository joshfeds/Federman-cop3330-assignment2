package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base25Test {
    @Test
    void passwordValidator_string_length_below_8_only_numbers() {
        Base25 detector = new Base25();

        int expected = 1;
        int actual = detector.passwordValidator("1234567");
        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_string_length_below_8_only_letters() {
        Base25 detector = new Base25();

        int expected = 2;
        int actual = detector.passwordValidator("abcdefg");
        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_no_special_has_numbers_and_letters_8_or_more_char() {
        Base25 detector = new Base25();

        int expected = 3;
        int actual = detector.passwordValidator("h3lloW0rLd");
        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_no_special_has_numbers_only_and_8_or_more_char() {
        Base25 detector = new Base25();

        int expected = 1;
        int actual = detector.passwordValidator("12345678910");
        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_no_special_has_letters_only_and_8_or_more_char() {
        Base25 detector = new Base25();

        int expected = 2;
        int actual = detector.passwordValidator("abcdefghijk");
        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_has_special_numbers_and_letters_8_or_more_char() {
        Base25 detector = new Base25();

        int expected = 4;
        int actual = detector.passwordValidator("#StagsBas3ba11");
        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_has_special_numbers_and_8_or_more_char() {
        Base25 detector = new Base25();

        int expected = 1;
        int actual = detector.passwordValidator("1+2+3-4*5-6");
        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_has_special_letters_only_and_8_or_more_char() {
        Base25 detector = new Base25();

        int expected = 2;
        int actual = detector.passwordValidator("F#&*This");
        assertEquals(expected, actual);
    }
}