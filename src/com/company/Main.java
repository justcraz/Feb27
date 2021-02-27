package com.company;

public class Main {

    public static void main(String[] args) {
	char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
    's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	String word = "helloz";
	int shift = 1;
	String encrypted = "";
        for (int i = 0; i < word.length(); i++) {
            int index = 0;
            char letter = word.charAt(i);
            for (int j = 0; j < letters.length; j++) {
                if(letter == letters[j]){
                    index = j;
                    break;

                }
            }
            int newIndex = index + shift;
            if (newIndex >= 26) newIndex = newIndex - 26;
            char encryptedLetter = letters[newIndex];
            encrypted += encryptedLetter;
        }
        System.out.println(encrypted);
    }
}
