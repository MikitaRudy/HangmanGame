package main.java.com.mikitarudy.utils;

public class Constants {
    public static final int MAX_ATTEMPTS = 6;
    public static final String WORDS_FILE_PATH = "src/main/resources/words.txt";
    public static final String FILE_NOT_FOUND = "Файл со словами не найден: %s\n";
    public static final String RULE = """ 
                Добро пожаловать!
                Правила игры в «Виселицу» (Hangman):
                Компьютер загадывает слово, скрывая его буквы (_ _ _ _). Игрок по очереди предлагает буквы.
                Если буква есть в слове, она открывается (_ а _ а).
                За каждую неверную букву рисуется часть «виселицы». Игрок выигрывает, если угадывает всё слово.
                Если виселица полностью нарисована до отгадывания слова, игрок проигрывает.
                """;
    public static final String YES = "д";
    public static final String NO = "н";
    public static final String PLAY_REQUEST = "Хотите сыграть в «Виселицу»? \n Да (д)  \n Нет (н)";
    public static final String YES_NO_INPUT = "Введите \"д\" или \"н\"!";
    public static final String WIN = "Поздравляем! Вы выиграли!\nЗагаданое слово: %s";
    public static final String LOSE = "Вы проиграли!\nЗагаданое слово: %s";
    public static final String USER_LETTER_INPUT = "Введите букву: ";
    public static final String INVALID_INPUT_MESSAGE = "Ошибка: введите одну русскую букву!";
    public static final String GAME_STATUS= "Слово: %s\nОшибки(%d): %s\n";
    public static final String DUPLICATE_LETTER_INPUT_MESSAGE = "Вы уже вводили этот эту букву! Попробуйте еще раз!";
}
