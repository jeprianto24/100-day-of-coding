import java.util.Scanner;

public class day72 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi a: ");
        double a = sc.nextDouble();
        System.out.print("Masukkan panjang sisi b: ");
        double b = sc.nextDouble();
        System.out.print("Masukkan panjang sisi c: ");
        double c = sc.nextDouble();
        System.out.print("Masukkan panjang sisi d: ");
        double d = sc.nextDouble();
        System.out.print("Masukkan tinggi jajarGenjang: ");
        double h = sc.nextDouble();

        double luas = hitungLuas(a, b, h);
        double keliling = hitungKeliling(a, b, c, d);
        System.out.println("Luas jajarGenjang: " + luas);
        System.out.println("Keliling jajarGenjang: " + keliling);
    }
    public static double hitungLuas(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }
    public static double hitungKeliling(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}
