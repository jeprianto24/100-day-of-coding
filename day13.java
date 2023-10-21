import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai atas: ");
        int nilaiAtas = input.nextInt();

        int total = 0;

        for (int i = 1; i <= nilaiAtas; i++) {
            total += i;
        }

        System.out.println("Total penjumlahan dari 1 sampai " + nilaiAtas + " adalah: " + total);

        input.close();
    }
}
