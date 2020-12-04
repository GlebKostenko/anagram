package com.foxminded;

import java.util.Stack;
import java.util.StringJoiner;

public class Anagram {
    public String doAnagramFromWord(String word){

        char[] symbolsOfWord = word.toCharArray();
        Stack<Character> reverseLetterWord = new Stack<Character>();

        for(int i = 0;i < word.length();++i){
            if(Character.isLetter(word.charAt(i))){
                reverseLetterWord.add(word.charAt(i));
            }
        }

        for(int i = 0;i < symbolsOfWord.length;++i){
            if(Character.isLetter(symbolsOfWord[i])){
                symbolsOfWord[i] = (Character)reverseLetterWord.pop();
            }
        }

        String anagram = new String(symbolsOfWord);
        return anagram;
    }

    public StringJoiner doAnagramFromText(String text){
        StringJoiner reversedText = new StringJoiner(" ");
        String[] words = text.split("\\s");
        for (int i = 0;i < words.length;++i) {
            reversedText.add(doAnagramFromWord(words[i]));
        }
        return reversedText;
    }
}
