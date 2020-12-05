package com.foxminded;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramTest {

    @Test
    void doAnagramFromWord() {
        Anagram anagram = new Anagram();
        String word1 = "abcd";
        String word2 = "!";
        String word3 = "&1";
        String word4 = "a1bcd";
        String word5 = "abcd!";
        String word6 = "!abcd";
        assertEquals("dcba", anagram.doAnagramFromWord(word1));
        assertEquals("!", anagram.doAnagramFromWord(word2));
        assertEquals("&1", anagram.doAnagramFromWord(word3));
        assertEquals("d1cba", anagram.doAnagramFromWord(word4));
        assertEquals("dcba!", anagram.doAnagramFromWord(word5));
        assertEquals("!dcba", anagram.doAnagramFromWord(word6));
    }

    @Test
    void doAnagramFromText() {
        Anagram anagram = new Anagram();
        String text1 = "!";
        String text2 = "abcd";
        String text3 = "a1bcd efg!h";
        assertEquals("!",anagram.doAnagramFromText(text1).toString());
        assertEquals("dcba",anagram.doAnagramFromText(text2).toString());
        assertEquals( "d1cba hgf!e",anagram.doAnagramFromText(text3).toString());
    }
}