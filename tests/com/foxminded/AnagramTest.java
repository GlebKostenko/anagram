package com.foxminded;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    void doAnagramFromText_whenOnlyLettersInText_ThenShouldBeSameTextInResult() {
        String text = "!";
        assertEquals("!",anagram
                .doAnagramFromText(text)
        );
    }

    @Test
    void doAnagramFromText_whenOneLetterWordInText_ThenShouldBeReversedTextInResult() {
        String text = "abcd";
        assertEquals("dcba",anagram
                .doAnagramFromText(text)
        );
    }

    @Test
    void doAnagramFromText_whenTwoWordsWithNoLetterSymbolsInText_ThenShouldBeReversedOnlyLetterSymbolsTextInResult() {
        String  text = "a1bcd efg!h";
        assertEquals( "d1cba hgf!e",anagram
                .doAnagramFromText(text)
        );
    }

}