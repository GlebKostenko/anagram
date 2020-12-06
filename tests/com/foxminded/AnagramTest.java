package com.foxminded;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramTest {

    @Test
    void doAnagramFromText() {
        Anagram anagramTest = new Anagram();
        String  doAnagramFromText_whenOnlyLettersInText_ThenShouldBeSameTextInResult = "!";
        String  doAnagramFromText_whenOneLetterWordInText_ThenShouldBeReversedTextInResult  = "abcd";
        String  doAnagramFromText_whenTwoWordsWithNoLetterSymbolsInText_ThenShouldBeReversedOnlyLetterSymbolsTextInResult = "a1bcd efg!h";
        assertEquals("!",anagramTest
                .doAnagramFromText
                (doAnagramFromText_whenOnlyLettersInText_ThenShouldBeSameTextInResult)
                .toString());
        assertEquals("dcba",anagramTest
                .doAnagramFromText
                (doAnagramFromText_whenOneLetterWordInText_ThenShouldBeReversedTextInResult)
                .toString());
        assertEquals( "d1cba hgf!e",anagramTest
                .doAnagramFromText
                (doAnagramFromText_whenTwoWordsWithNoLetterSymbolsInText_ThenShouldBeReversedOnlyLetterSymbolsTextInResult)
                .toString());
    }

}