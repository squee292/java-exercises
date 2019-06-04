package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> stringCount = new HashMap<>();


        System.out.println("Enter your text here: ");
        String textCount = scanner.next();
        char[] charactersInString = textCount.toCharArray();


        for (int i = 0; i < charactersInString.length; i++) {
            if (Character.isAlphabetic(charactersInString[i])){
                if (stringCount.containsKey(charactersInString[i])) {
                    stringCount.put(charactersInString[i], (stringCount.get(charactersInString[i]) + 1));
                } else {
                    stringCount.put(charactersInString[i], 1);
                }
            }else if(Character.isSpaceChar(charactersInString[i])){
                char blank = ' ';
                if (stringCount.containsKey(blank)) {
                        stringCount.put(blank, (stringCount.get(charactersInString[i]) + 1));
                    } else {
                        stringCount.put(blank, 1);
                    }
                }
            }


        for(Map.Entry<Character, Integer> countChar : stringCount.entrySet()){

            System.out.println(countChar.getKey() + ": " + countChar.getValue());
        }
    }
}