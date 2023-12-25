import java.util.Random;
import java.util.Scanner;

public class day78 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int angkaTebak = random.nextInt(100) + 1;
        boolean start = true;

        while (start) {
            System.out.print("Masukkan Angka : ");
            int n = input.nextInt();

            if (n > angkaTebak) {
                System.out.println("Tebakanmu Salah! Masukkan Angka Lebih Kecil!");
            } else if (n < angkaTebak) {
                System.out.println("Tebakanmu Salah! Masukkan Angka Lebih Besar!");
            } else {
                System.out.println("Tebakanmu Benar!");
                input.nextLine();
                System.out.print("Lanjut ? (y/n) : ");
                String lanjut = input.nextLine();
                if (lanjut.equals("n")) {
                    start = false;
                } else {
                    angkaTebak = random.nextInt(100) + 1;
                }
            }
        }
    }
}
