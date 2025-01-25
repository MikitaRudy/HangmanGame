package main.java.com.mikitarudy;

import main.java.com.mikitarudy.utils.Constants;
import main.java.com.mikitarudy.utils.GallowsPrinter;

public class Main {
    public static void main(String[] args) {
        WordDictionary dict = new WordDictionary();
        System.out.println(dict.getRandomWord());
        System.out.println(dict.getRandomWord());
        System.out.println();
        System.out.println(dict.getWords());

        for (int i = 0; i <= Constants.MAX_ATTEMPTS; i++) {
            GallowsPrinter.printGallows(i);
        }
    }
}
