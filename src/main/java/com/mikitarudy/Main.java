package main.java.com.mikitarudy;

import main.java.com.mikitarudy.utils.Constants;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constants.RULE);
        while (true){
            System.out.println(Constants.PLAY_REQUEST);
            String userInput = scanner.next().toLowerCase();
            if (userInput.trim().equals(Constants.YES)) {
                HangmanGame game = new HangmanGame();
                game.startGame();
            } else if (userInput.trim().equals(Constants.NO)) {
                break;
            } else {
                System.out.println(Constants.YES_NO_INPUT);
            }
        }
    }
}
