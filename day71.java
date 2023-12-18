import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang ");
        int p = sc.nextInt();
        System.out.print("Masukkan lebar ");
        int l = sc.nextInt();

        int luas = hitungLuas(p, l);
        int keliling = hitungKeliling(p, l);

        System.out.println("Luas: " + luas +" cm");
        System.out.println("Keliling: " + keliling+" cm");
    }

    public static int hitungLuas(int p, int l) {
        return p * l;
    }

    public static int hitungKeliling(int p, int l) {
        return 2 * (p + l);
    }
}
