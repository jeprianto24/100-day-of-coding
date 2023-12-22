import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Gaji anda : ");
        int gaji = sc.nextInt();

        System.out.print("Masukkan Jenis Pekerjaan Anda : ");
        String kerja = sc.next().toLowerCase();

        double pajak;
        double gaji_bersih;

        if (gaji >= 3000000 && gaji < 5000000) {
            if (kerja.equals("PNS")) {
                pajak = (10.0 / 100) * gaji;
                gaji_bersih = gaji - pajak;
                System.out.println("Anda Kena Pajak 10%");
                System.out.println("Gaji bersih Anda Adalah  Rp." + gaji_bersih);
            } else {
                pajak = (5.0 / 100) * gaji;
                gaji_bersih = gaji - pajak;
                System.out.println("Anda Kena Pajak 5%");
                System.out.println("Gaji bersih Anda Adalah  Rp." + gaji_bersih);
            }
        } else if (gaji >= 5000000) {
            if (kerja.equals("PNS")) {
                pajak = (15.0 / 100) * gaji;
                gaji_bersih = gaji - pajak;
                System.out.println("Anda Kena Pajak 15%");
                System.out.println("Gaji bersih Anda Adalah  Rp." + gaji_bersih);
            } else {
                pajak = (10.0 / 100) * gaji;
                gaji_bersih = gaji - pajak;
                System.out.println("Anda Kena Pajak 10%");
                System.out.println("Gaji bersih Anda Adalah  Rp." + gaji_bersih);
            }
        } else {
            System.out.println("Gaji bersih Anda Adalah  Rp." + gaji);
        }
    }
}
