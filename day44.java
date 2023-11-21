import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaIndomie = 350.0;
        double hargaYouC1000 = 1000.0;
        double hargaFanta = 500.0;
        double hargakopikap = 50.0;
        double totalBelanja =0;
        do {
            System.out.println("Menu :");
            System.out.println("1. Indomie Rp." + hargaIndomie);
            System.out.println("2. YouC1000 Rp." + hargaYouC1000);
            System.out.println("3. Fanta Rp." + hargaFanta);
            System.out.println("4. Kopikap Rp." + hargakopikap);

            System.out.print("Pilih barang yang ingin di beli (1-4) :");
            int pilihan = sc.nextInt();

            System.out.print("Masukkan jumlah barang yang ingin dibeli :");
            int jumlah = sc.nextInt();

            double Harga = 0;
            switch (pilihan) {
                case 1:
                    Harga = hargaIndomie;
                    break;
                case 2:
                    Harga = hargaYouC1000;
                    break;
                case 3:
                    Harga = hargaFanta;
                    break;
                case 4:
                    Harga = hargakopikap;
                    break;
                default:
                    System.out.println("Invalid");
                    return;
            }
            double totalHargaBarang = Harga * jumlah;
            totalBelanja +=totalHargaBarang;

            System.out.print("Apakah Anda ingin menambah belanja? (ya/tidak): ");
            String tambah = sc.next();

            if (!tambah.equalsIgnoreCase("ya")) {
                break;
            }
        } while (true);
        System.out.println("Total Belanja Anda: Rp" + totalBelanja);
    }
}
