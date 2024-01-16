import java.util.Scanner;
import java.time.LocalTime;

public class day100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        LocalTime waktuSekarang = LocalTime.now();
        String salam = getSalam(waktuSekarang);

        System.out.println("══════════════════════════════════════════");
        System.out.println("       Selamat " + salam + ", " + nama     );
        System.out.println("       Program Anda Telah Selesai         ");
        System.out.println("══════════════════════════════════════════");
    }
    private static String getSalam(LocalTime waktu) {
        if (waktu.isBefore(LocalTime.NOON)) {
            return "pagi";
        } else if (waktu.isBefore(LocalTime.of(17, 0))) {
            return "siang";
        } else {
            return "malam";
        }
    }
}
