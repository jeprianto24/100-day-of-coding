import java.util.Scanner;

public class day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int jumlahElemen = sc.nextInt();

        int[] nilaiArray = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiArray[i] = sc.nextInt();
        }

        System.out.println("Nilai yang disimpan dalam array:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilaiArray[i]);
        }
    }
}
