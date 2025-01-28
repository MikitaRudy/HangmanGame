package main.java.com.mikitarudy.utils;

public class GallowsPrinter {
    private static final String[][] PICTURES = {
            {
                    "  _______",
                    "  |     |",
                    "  |      ",
                    "  |",
                    "  |",
                    "  |",
                    "__|__",
            },
            {
                    "  _______",
                    "  |     |",
                    "  |     O",
                    "  |",
                    "  |",
                    "  |",
                    "__|__",
            },
            {
                    "  _______",
                    "  |     |",
                    "  |     O",
                    "  |     |",
                    "  |",
                    "  |",
                    "__|__",
            },
            {
                    "  _______",
                    "  |     |",
                    "  |     O",
                    "  |    /|",
                    "  |",
                    "  |",
                    "__|__",
            },
            {
                    "  _______",
                    "  |     |",
                    "  |     O",
                    "  |    /|\\",
                    "  |",
                    "  |",
                    "__|__",
            },
            {
                    "  _______",
                    "  |     |",
                    "  |     O",
                    "  |    /|\\",
                    "  |    /",
                    "  |",
                    "__|__",
            },
            {
                    "  _______",
                    "  |     |",
                    "  |     O",
                    "  |    /|\\",
                    "  |    / \\",
                    "  |",
                    "__|__",
            }
    };

    public static void printGallows(int mistake){
        for (int i = 0; i < PICTURES[mistake].length; i++) {
            System.out.println(PICTURES[mistake][i]);
        }
    }
}
