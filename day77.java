import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
        double nilaiTukar = 15000;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah USD yang akan dikonversi: ");
        double jumlahUSD = sc.nextDouble();

        double nilaiIDR = jumlahUSD * nilaiTukar;

        System.out.println("Hasil konversi: " + jumlahUSD + " USD = " + nilaiIDR + " IDR");
    }
}
