import java.util.Scanner;
public class day95 {
    static void cetakBintang(int jumlah) {
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("*");
        }
    }
    static void cetakDiamond(int tinggi) {
        if (tinggi % 2 == 0) {
            tinggi++;
        }
        for (int i = 1; i <= tinggi; i += 2) {
            int spasi = (tinggi - i) / 2;
            for (int j = 0; j < spasi; j++) {
                System.out.print(" ");
            }
            cetakBintang(i);
            System.out.println();
        }
        for (int i = tinggi - 2; i > 0; i -= 2) {
            int spasi = (tinggi - i) / 2;
            for (int j = 0; j < spasi; j++) {
                System.out.print(" ");
            }
            cetakBintang(i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan tinggi diamond: ");
            int tinggi = scanner.nextInt();
            cetakDiamond(tinggi);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Masukkan harus berupa bilangan bulat.");
        }
    }
}
