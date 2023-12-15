import java.util.Random;
import java.util.Scanner;

public class day68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1, num2, operator, answer, userAnswer;

        while (true) {
            num1 = random.nextInt(10) + 1;
            num2 = random.nextInt(10) + 1;

            operator = random.nextInt(4);

            switch (operator) {
                case 0:
                    System.out.printf("%d + %d = ?\n", num1, num2);
                    answer = num1 + num2;
                    break;
                case 1:
                    System.out.printf("%d - %d = ?\n", num1, num2);
                    answer = num1 - num2;
                    break;
                case 2:
                    System.out.printf("%d * %d = ?\n", num1, num2);
                    answer = num1 * num2;
                    break;
                case 3:
                    num2 = (num2 == 0) ? 1 : num2;
                    System.out.printf("%d / %d = ?\n", num1, num2);
                    answer = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Operator tidak valid");
            }

            System.out.print("Jawaban Anda (ketik 'exit' untuk keluar): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                userAnswer = Integer.parseInt(input);
                if (userAnswer == answer) {
                    System.out.println("Jawaban Anda benar!\n");
                } else {
                    System.out.println("Jawaban Anda salah. Jawaban yang benar adalah " + answer + "\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Mohon masukkan angka atau 'exit' untuk keluar.\n");
            }
        }

        System.out.println("Terima kasih telah bermain!");
    }
}
