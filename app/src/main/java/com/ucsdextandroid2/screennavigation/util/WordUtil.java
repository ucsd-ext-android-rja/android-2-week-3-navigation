package com.ucsdextandroid2.screennavigation.util;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by rjaylward on 2019-07-19
 */
public class WordUtil {

    private static Random random = new Random();

    private static final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public static char getRandomChar() {
        return alphabet.charAt(random.nextInt(alphabet.length()));
    }

    public static String getRandomWord(int minLength, int maxLength) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < getRandomNumberInRange(minLength, maxLength); i++) {
            sb.append(getRandomChar());
        }

        return sb.toString();
    }

    public static String getRandomSentence(int minWordCount, int maxWordCount) {
        return getRandomSentence(getRandomNumberInRange(minWordCount, maxWordCount));
    }

    public static String getRandomSentence(int wordCount) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            if(i != 0)
                sb.append(" ");
            sb.append(getRandomWord(3, 8));
        }

        return sb.toString();
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        return random.nextInt((max - min) + 1) + min;
    }

}
