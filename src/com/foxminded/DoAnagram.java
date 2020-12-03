package com.foxminded;

import java.util.Stack;

public class DoAnagram {
    DoAnagram(){}

    public static String DoAnagramFromWord(String word){
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

    public static String[] DoAnagramFromText(String[] words){
        for (int i = 0;i < words.length;++i) {
            words[i] = DoAnagramFromWord(words[i]);
        }
        return words;
    }
}
