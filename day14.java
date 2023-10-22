import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Ayam Geprek", "Sate ayam", "Soto"};
        double[] harga = {15000.0, 12000.0, 18000.0, 25000.0, 15000.0};

        Scanner input = new Scanner(System.in);

        System.out.println("Daftar Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("Pilih nomor menu (1-" + menu.length + "): ");
        int pilihan = input.nextInt();

        if (pilihan < 1 || pilihan > menu.length) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        System.out.print("Jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();

        double totalHarga = harga[pilihan - 1] * jumlahPesanan;
        System.out.println("Jumlah pesanan anda : "+jumlahPesanan + "\nTotal Harga: Rp " + totalHarga);
    }
}
