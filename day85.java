import java.util.Scanner;
public class day85 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ketinggian apel (meter): ");
        double ketinggian = input.nextDouble();

        double waktuJatuh = hitungWaktu(ketinggian);
        double percepatan = hitungPercepatan(ketinggian, waktuJatuh);
        System.out.println("Waktu yang diperlukan apel untuk jatuh adalah: " + waktuJatuh + " detik");
        System.out.println("Percepatan gerak apel adalah: " + percepatan + " m/s^2");
    }
    public static double hitungWaktu(double ketinggian) {
        return Math.sqrt((2 * ketinggian) / 9.8);
    }
    public static double hitungPercepatan(double ketinggian, double waktuJatuh) {
        return 2 * ketinggian / Math.pow(waktuJatuh, 2);
    }
}
