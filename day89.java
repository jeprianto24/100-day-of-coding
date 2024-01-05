import java.util.Scanner;

public class day89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kecepatan awal (m/s): ");
        double kecepatanAwal = scanner.nextDouble();
        System.out.print("Masukkan sudut lemparan (derajat): ");
        double sudutLempar = scanner.nextDouble();
        double sudutRadian = Math.toRadians(sudutLempar);
        System.out.print("Masukkan interval waktu (detik): ");
        double intervalWaktu = scanner.nextDouble();
        double gravitasi = 9.8;

        double kecepatanAwalX = kecepatanAwal * Math.cos(sudutRadian);
        double kecepatanAwalY = kecepatanAwal * Math.sin(sudutRadian);

        double posX = 0.0;
        double posY = 0.0;

        double waktu = 0.0;
        while (posY >= 0.0) {
            posX = kecepatanAwalX * waktu;
            posY = kecepatanAwalY * waktu - 0.5 * gravitasi * Math.pow(waktu, 2);

            System.out.printf("Waktu: %.2f detik, Posisi X: %.2f meter, Posisi Y: %.2f meter\n", waktu, posX, posY);
            waktu += intervalWaktu;
        }
    }
}
