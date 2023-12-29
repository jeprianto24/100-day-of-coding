import java.util.Scanner;

public class day82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Konversi Satuan Berat");
        System.out.print("Masukkan berat dalam kilogram: ");
        double beratKg = scanner.nextDouble();

        double beratGram = beratKg * 1000;
        double beratPound = beratKg * 2.20462;
        double beratOunce = beratKg * 35.274;

        System.out.println("Hasil Konversi:");
        System.out.println("Berat dalam Gram: " + beratGram + " gram");
        System.out.println("Berat dalam Pound: " + beratPound + " pound");
        System.out.println("Berat dalam Ounce: " + beratOunce + " ounce");

    }
}