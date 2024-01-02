import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kecepatan mobil (m/s): ");
        double kecepatan = scanner.nextDouble();

        double massaMobil = 1000; 
        double koefisienGesek = 0.7;
        double gayaGesek = hitungGayaGesek(massaMobil, kecepatan, koefisienGesek);
        System.out.println("Gaya gesek yang dibutuhkan untuk berhenti: " + gayaGesek + " N");
    }
    private static double hitungGayaGesek(double massa, double kecepatan, double koefisienGesek) {
        double percepatanGesek = koefisienGesek * 9.8;
        double gayaGesek = massa * percepatanGesek;
        return gayaGesek;
    }
}
