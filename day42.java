import java.util.Scanner;

public class day42 {
    private static double saldo = 100000.0;
    private static int sandi = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;

        do {
            tampilkanMenu();
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    tarikTunai();
                    break;
                case 3:
                    setorTunai();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM ini");
                    break;
                default:
                    System.out.println("Pilihan tidak valid \nSilakan coba lagi.");
            }

        } while (pilihan != 4);

        scanner.close();
    }

    private static void tampilkanMenu() {
        System.out.println("\nMenu ATM Sederhana:");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Tunai");
        System.out.println("3. Setor Tunai");
        System.out.println("4. Keluar");
    }

    private static void cekSaldo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan pasword : ");
        int pasword = scanner.nextInt();
        if (pasword == sandi){
            System.out.println("Saldo Anda saat ini: Rp " + saldo);
        }else{
            System.out.println("Sandi salah \nSilahkan coba lagi");
        }
    }

    private static void tarikTunai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan pasword : ");
        int pasword = scanner.nextInt();
        if (pasword == sandi){
            System.out.print("Masukkan jumlah penarikan: Rp ");
            double jumlahTarik = scanner.nextDouble();

            if (jumlahTarik > saldo) {
                System.out.println("Saldo tidak mencukupi.");
            } else {
                saldo -= jumlahTarik;
                System.out.println("Penarikan berhasil \nSaldo Anda saat ini: Rp " + saldo);
            }
        }else{
            System.out.println("Sandi salah \nSilahkan coba lagi");
        }
    }

    private static void setorTunai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan pasword : ");
        int pasword = scanner.nextInt();
        if (pasword == sandi){
            System.out.print("Masukkan jumlah setoran: Rp ");
            double jumlahSetor = scanner.nextDouble();

            saldo += jumlahSetor;
            System.out.println("Setoran berhasil \nSaldo Anda saat ini: Rp " + saldo);
        }else{
            System.out.println("Sandi salah silahkan coba lagi");
        }
    }
}
