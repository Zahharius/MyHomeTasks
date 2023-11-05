package tasks;

import java.util.Scanner;

public class AlphabetCheck {

    private Scanner scanner;

    public AlphabetCheck(Scanner scanner) {
        this.scanner = scanner;
    }

      public static void checkAlphabet() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String text = userInput.toLowerCase();

        char[] alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray();

        boolean allLetters = true;

        for (char letter : alphabet) {
            if (text.indexOf(letter) == -1) {
                allLetters = false;
                break;
            }
        }

        if (allLetters) {
            System.out.println("здесь присутствуют ВСЕ буквы русского алфавита.");
        } else {
            System.out.println("здесь НЕТУ всех букв русского алфавита.");
        }
    }
}

