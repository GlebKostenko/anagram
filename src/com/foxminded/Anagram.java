package com.foxminded;

import java.util.Stack;
import java.util.StringJoiner;

public class Anagram {
    public String doAnagramFromWord(String word){

        char[] symbols_of_word = word.toCharArray();
        Stack<Character> reverse_letter_word = new Stack<Character>();

        for(int i = 0;i < word.length();++i){
            if(Character.isLetter(word.charAt(i))){
                reverse_letter_word.add(word.charAt(i));
            }
        }

        for(int i = 0;i < symbols_of_word.length;++i){
            if(Character.isLetter(symbols_of_word[i])){
                symbols_of_word[i] = (Character)reverse_letter_word.pop();
            }
        }

        String anagram = new String(symbols_of_word);
        return anagram;
    }

    public StringJoiner doAnagramFromText(String text){
        StringJoiner reversed_text = new StringJoiner(" ");
        String[] words = text.split("\\s");
        for (int i = 0;i < words.length;++i) {
            words[i] = doAnagramFromWord(words[i]);
            reversed_text.add(words[i]);
        }
        return reversed_text;
    }
}
