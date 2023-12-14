import java.util.Scanner;

public class day67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = sc.nextDouble();
        double luas = hitungLuasLingkaran(jariJari);
        double keliling = hitungKelilingLingkaran(jariJari);
        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah: " + Math.round(luas)+" cm");
        System.out.println("Keliling lingkaran dengan jari-jari " + jariJari + " adalah: " + Math.round(keliling)+" cm");
    }
    private static double hitungLuasLingkaran(double jariJari) {
        double luas = Math.PI * Math.pow(jariJari, 2);
        return luas;
    }
    private static double hitungKelilingLingkaran(double jariJari) {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
