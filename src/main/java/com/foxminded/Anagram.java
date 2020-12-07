package com.foxminded;

import java.util.Stack;
import java.util.stream.Collectors;
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

    public String doAnagramFromText(String text){
        return Stream.of(text.split("\\s"))
                .map(x -> doAnagramFromWord(x))
                .collect(Collectors.joining(" "));
    }
}
