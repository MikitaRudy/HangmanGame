package main.java.com.mikitarudy;

import main.java.com.mikitarudy.utils.Constants;
import main.java.com.mikitarudy.utils.GallowsPrinter;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class HangmanGame {
    private String word;
    private StringBuilder hiddenWord;
    private int numberOfMistakes;
    private Set<Character> wrongLetters;

    private final Scanner scanner = new Scanner(System.in);

    public HangmanGame() {
        this.word = new WordDictionary().getRandomWord();
        hiddenWord = new StringBuilder("_".repeat(word.length()));
        wrongLetters = new LinkedHashSet<>();
        numberOfMistakes = 0;
    }

    public void startGame() {
        while (numberOfMistakes < Constants.MAX_ATTEMPTS) {
            print();
            char letter = getPlayerGuess();
            if (isLetterGuessed(letter)) {
                revealLetterOccurrences(letter);
                if (isWordGuessed()) {
                    System.out.printf(Constants.WIN, word);
                    return;
                }
            } else {
                if (wrongLetters.add(letter)) {
                    numberOfMistakes++;
                } else {
                    System.out.println(Constants.DUPLICATE_LETTER_INPUT_MESSAGE);
                }
            }
        }
        print();
        System.out.printf(Constants.LOSE, word);
    }

    private boolean isWordGuessed() {
        return hiddenWord.toString().equals(word);
    }

    private boolean isLetterGuessed(char letter) {
        return word.indexOf(letter) != -1;
    }

    private char getPlayerGuess() {
        while (true) {
            System.out.print(Constants.USER_LETTER_INPUT);
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.length() == 1 && isRussianLetter(input.charAt(0))) {
                return input.charAt(0);
            }
            System.out.println(Constants.INVALID_INPUT_MESSAGE);
        }
    }

    private boolean isRussianLetter(char c) {
        return c >= 'а' && c <= 'я';
    }

    private void revealLetterOccurrences(char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                hiddenWord.setCharAt(i, letter);
            }
        }
    }

    private void print(){
        GallowsPrinter.printGallows(numberOfMistakes);
        System.out.printf(Constants.GAME_STATUS, hiddenWord, numberOfMistakes, wrongLetters);
    }
}
