import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Konversi Satuan Panjang");
        System.out.println("1. Meter");
        System.out.println("2. Kilometer");
        System.out.println("3. Sentimeter");
        System.out.println("4. Mil");

        System.out.print("Masukkan jenis satuan panjang yang akan dikonversi (1-4): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan nilai panjang: ");
        double panjangAwal = scanner.nextDouble();

        double hasilKonversi = 0;

        switch (pilihan) {
            case 1:
                hasilKonversi = panjangAwal;
                System.out.println("Panjang dalam Meter: " + panjangAwal);
                System.out.println("Panjang dalam Kilometer: " + panjangAwal * 0.001);
                System.out.println("Panjang dalam Sentimeter: " + panjangAwal * 100);
                System.out.println("Panjang dalam Mil: " + panjangAwal * 0.000621371);
                break;
            case 2:
                hasilKonversi = panjangAwal;
                System.out.println("Panjang dalam Kilometer: " + panjangAwal);
                System.out.println("Panjang dalam Meter: " + panjangAwal * 1000);
                System.out.println("Panjang dalam Sentimeter: " + panjangAwal * 100000);
                System.out.println("Panjang dalam Mil: " + panjangAwal * 0.621371);
                break;
            case 3:
                hasilKonversi = panjangAwal;
                System.out.println("Panjang dalam Sentimeter: " + panjangAwal);
                System.out.println("Panjang dalam Meter: " + panjangAwal * 0.01);
                System.out.println("Panjang dalam Kilometer: " + panjangAwal * 1e-5);
                System.out.println("Panjang dalam Mil: " + panjangAwal * 6.2137e-6);
                break;
            case 4:
                hasilKonversi = panjangAwal;
                System.out.println("Panjang dalam Mil: " + panjangAwal);
                System.out.println("Panjang dalam Meter: " + panjangAwal * 1609.34);
                System.out.println("Panjang dalam Kilometer: " + panjangAwal * 1.60934);
                System.out.println("Panjang dalam Sentimeter: " + panjangAwal * 160934);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        System.out.println("Hasil konversi: " + hasilKonversi);
    }
}
