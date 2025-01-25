package main.java.com.mikitarudy;

public class HangmanGame {
    private String word;
    private StringBuilder hiddenWord;
    private int numberOfMistake;

    public HangmanGame(String word) {
        this.word = word;
        hiddenWord = new StringBuilder("_".repeat(word.length()));
    }
}
