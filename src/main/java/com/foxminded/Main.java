package com.foxminded;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan_text = new Scanner(System.in);
        String text = scan_text.nextLine();
        Anagram anagram = new Anagram();
        System.out.print(anagram.doAnagramFromText(text).toString());
    }
}