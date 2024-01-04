import java.util.Scanner;

public class day88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int panjangArray = scanner.nextInt();
        String[] namaSiswa = new String[panjangArray];
        int[] nilaiSiswaInt = new int[panjangArray];
        double[] nilaiSiswaDouble = new double[panjangArray];
        float[] nilaiSiswaFloat = new float[panjangArray];

        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
            namaSiswa[i] = scanner.next();

            System.out.print("Masukkan nilai siswa (integer) ke-" + (i + 1) + ": ");
            nilaiSiswaInt[i] = scanner.nextInt();

            System.out.print("Masukkan nilai siswa (double) ke-" + (i + 1) + ": ");
            nilaiSiswaDouble[i] = scanner.nextDouble();

            System.out.print("Masukkan nilai siswa (float) ke-" + (i + 1) + ": ");
            nilaiSiswaFloat[i] = scanner.nextFloat();
        }
        System.out.println("\nData Siswa:");

        for (int i = 0; i < panjangArray; i++) {
            System.out.println("Nama (String) : " + namaSiswa[i] + ", Nilai (Int): " + nilaiSiswaInt[i] +
                    ", Nilai (Double): " + nilaiSiswaDouble[i] + ", Nilai (Float): " + nilaiSiswaFloat[i]);
        }
    }
}
