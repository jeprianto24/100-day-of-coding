import java.util.Scanner;

public class day70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = sc.nextDouble();

        System.out.print("Masukkan lebar segitiga: ");
        double lebar = sc.nextDouble();

        double luas = hitungLuasSegitiga(tinggi, lebar);
        System.out.println("Luas segitiga: " + Math.round(luas));
    }
    public static double hitungLuasSegitiga(double tinggi, double lebar) {
        double luas = 0.5 * tinggi * lebar;
        return luas;
    }
}
