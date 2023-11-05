
package tasks;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTest {

    private final Random random = new Random();
    private final Scanner scanner;

    public MultiplicationTest(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runTest() {
        int correctAnswers = 0;

        for (int i = 0; i < 5; i++) {
            int num1 = random.nextInt(9) + 1;
            int num2 = random.nextInt(9) + 1;

            int correctResult = num1 * num2;

            System.out.printf("задачка %d: %d * %d? введи ответ: ", i + 1, num1, num2);
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctResult) {
                System.out.println("\u001B[32mХАРОШ\u001B[0m");
                correctAnswers++;
            } else {
                System.out.println("\u001B[31mМЕГАПЛОХ\u001B[0m");
            }
        }

        System.out.println("тест кончился");

        if (correctAnswers == 5) {
            System.out.println("силён");
        } else if (correctAnswers == 3 || correctAnswers == 4) {
            System.out.println("надо тренироваться");
        } else if (correctAnswers <= 2) {
            System.out.println("СРОЧНО УЧИ ТАБЛИЦУ БРАТАН");
        }
    }
}
