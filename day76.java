import java.util.Scanner;

public class day76 {
    private static final double KURS_TUKAR = 0.000071;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah Rupiah (Rp): ");
        double jumlahRp = scanner.nextDouble();

        double jumlahUsd = konversiRpToUsd(jumlahRp);

        System.out.println("Jumlah dalam Dolar Amerika Serikat (USD): $" + jumlahUsd);

    }
    private static double konversiRpToUsd(double jumlahRp) {
        return jumlahRp * KURS_TUKAR;
    }
}