package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base24Test {

    @Test
    void isAnagram_returns_correct_answer() {
        Base24 detector = new Base24();

        boolean expected = true;
        boolean actual = detector.isAnagram("note", "note");

        assertEquals(expected, actual);

    }
    @Test
    void isAnagram_returns_correct_answer_casing() {
        Base24 detector = new Base24();

        boolean expected = true;
        boolean actual = detector.isAnagram("Night", "thing");

        assertEquals(expected, actual);

    }
    @Test
    void isAnagram_returns_correct_answer_multiple_words() {
        Base24 detector = new Base24();

        boolean expected = true;
        boolean actual = detector.isAnagram("the eyes", "they see");

        assertEquals(expected, actual);

    }
    @Test
    void isAnagram_returns_wrong_answer() {
        Base24 detector = new Base24();

        boolean expected = false;
        boolean actual = detector.isAnagram("note", "bone");

        assertEquals(expected, actual);

    }
    @Test
    void isAnagram_returns_wrong_answer_different_string_length() {
        Base24 detector = new Base24();

        boolean expected = false;
        boolean actual = detector.isAnagram("This is", "not an anagram");

        assertEquals(expected, actual);

    }
    @Test
    void isAnagram_returns_wrong_answer_same_string_length() {
        Base24 detector = new Base24();

        boolean expected = false;
        boolean actual = detector.isAnagram("Multipaul", "Invincible");

        assertEquals(expected, actual);

    }
}