package com.foxminded;

import java.util.Arrays;
import java.util.Stack;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Anagram {
    private  String doAnagramFromWord(String word){

        char[] symbolsOfWord = word.toCharArray();
        Stack<Character> reverseLetterWord = new Stack<>();

        for(int i = 0;i < word.length();++i){
            if(Character.isLetter(word.charAt(i))){
                reverseLetterWord.add(word.charAt(i));
            }
        }

        for(int i = 0;i < symbolsOfWord.length;++i){
            if(Character.isLetter(symbolsOfWord[i])){
                symbolsOfWord[i] = reverseLetterWord.pop();
            }
        }

        String anagram = new String(symbolsOfWord);
        return anagram;
    }

    public StringJoiner doAnagramFromText(String text){
        StringJoiner reversedText = new StringJoiner(" ");
        Stream.of(text.split("\\s")).forEach(x ->reversedText.add(doAnagramFromWord(x)));
        return reversedText;
    }
}
