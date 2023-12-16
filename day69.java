import java.util.Scanner;

public class day69 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi: ");

        double sisi = scanner.nextDouble();
        double luas = hitungLuasPersegi(sisi);
        System.out.println("Luas persegi: " + Math.round(luas));
        double keliling = hitungKelilingPersegi(sisi);
        System.out.println("Keliling persegi: " + Math.round(keliling));
    }
    public static double hitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }
    public static double hitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }
}
