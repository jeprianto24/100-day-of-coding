import java.util.Scanner;
public class day91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan populasi awal: ");
        int populasiAwal = sc.nextInt();
        System.out.print("Masukkan laju pertumbuhan (dalam persen): ");
        double lajuPertumbuhan = sc.nextDouble();
        System.out.print("Masukkan jumlah generasi: ");
        int jumlahGenerasi = sc.nextInt();
        for (int generasi = 1; generasi <= jumlahGenerasi; generasi++) {
            populasiAwal = hitungPertumbuhan(populasiAwal, lajuPertumbuhan);
            System.out.println("Generasi " + generasi + ": Populasi = " + populasiAwal);
        }
    }
    private static int hitungPertumbuhan(int populasiAwal, double lajuPertumbuhan) {
        return (int) (populasiAwal * (1 + (lajuPertumbuhan / 100)));
    }
}
