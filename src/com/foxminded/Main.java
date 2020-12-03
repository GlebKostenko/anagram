package com.foxminded;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan_text = new Scanner(System.in);
        String text = scan_text.nextLine();
        String[] words = text.split("\\s");
        words = DoAnagram.DoAnagramFromText(words);
        for (String word : words) {
            System.out.println(word);
        }
    }

}