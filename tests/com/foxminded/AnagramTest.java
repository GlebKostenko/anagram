package com.foxminded;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramTest {

    Anagram anagramTest = new Anagram();

    @Test
    void doAnagramFromText_whenOnlyLettersInText_ThenShouldBeSameTextInResult() {
        String text = "!";
        assertEquals("!",anagramTest
                .doAnagramFromText
                (text)
                .toString());
    }

    @Test
    void doAnagramFromText_whenOneLetterWordInText_ThenShouldBeReversedTextInResult() {
        String text = "abcd";
        assertEquals("dcba",anagramTest
                .doAnagramFromText
                (text)
                .toString());
    }

    @Test
    void doAnagramFromText_whenTwoWordsWithNoLetterSymbolsInText_ThenShouldBeReversedOnlyLetterSymbolsTextInResult() {
        String  text = "a1bcd efg!h";
        assertEquals( "d1cba hgf!e",anagramTest
                .doAnagramFromText
                (text)
                .toString());
    }

}