import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan panjang diagonal 1 (d1): ");
        double d1 = sc.nextDouble();

        System.out.println("Masukkan panjang diagonal 2 (d2): ");
        double d2 = sc.nextDouble();

        System.out.println("Masukkan panjang sisi 1: ");
        double sisi1 = sc.nextDouble();

        System.out.println("Masukkan panjang sisi 2: ");
        double sisi2 = sc.nextDouble();

        double luas = hitungLuasLayangLayang(d1, d2);
        double keliling = hitungKelilingLayangLayang(sisi1, sisi2);
        System.out.println("Luas Layang-layang: " + luas);
        System.out.println("Keliling Layang-layang: " + keliling);
    }

    public static double hitungLuasLayangLayang(double d1, double d2) {
        return (d1 * d2) / 2;
    }
    public static double hitungKelilingLayangLayang(double sisi1, double sisi2) {
        return 2 * (sisi1 + sisi2);
    }
}
