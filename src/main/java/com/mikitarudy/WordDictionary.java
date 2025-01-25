package main.java.com.mikitarudy;

import main.java.com.mikitarudy.utils.Constants;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordDictionary {
    private List<String> words;

    public WordDictionary() {
        words = new ArrayList<>();
        uploadWordsFromFile();
    }

    private void uploadWordsFromFile() {
        try {
            Scanner scanner = new Scanner(new File(Constants.WORDS_FILE_PATH));
            while (scanner.hasNext()){
                words.add(scanner.nextLine().trim());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.printf(Constants.FILE_NOT_FOUND, Constants.WORDS_FILE_PATH);
        }
    }

    public String getRandomWord() {
        Random rand = new Random();
        return words.get(rand.nextInt(words.size()));
    }
}
