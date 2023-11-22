import java.util.Scanner;

public class day45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka dalam deret Fibonacci: ");
        int jumlahAngka = scanner.nextInt();

        System.out.println("Deret Fibonacci dengan " + jumlahAngka + " angka adalah:");
        cetakFibonacci(jumlahAngka);
    }

    private static void cetakFibonacci(int jumlahAngka) {
        int angkaSebelumnya = 0;
        int angkaSekarang = 1;

        for (int i = 1; i <= jumlahAngka; ++i) {
            System.out.print(angkaSebelumnya + " ");

            int jumlahSelanjutnya = angkaSebelumnya + angkaSekarang;
            angkaSebelumnya = angkaSekarang;
            angkaSekarang = jumlahSelanjutnya;
        }
    }
}
