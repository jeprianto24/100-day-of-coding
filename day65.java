import java.util.ArrayList;
import java.util.Scanner;

public class day65 {

    public static boolean isPrima(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> cariBilanganPrima(int awal, int akhir) {
        ArrayList<Integer> listBilanganPrima = new ArrayList<>();
        for (int x = awal; x <= akhir; x++) {
            if (isPrima(x)) {
                listBilanganPrima.add(x);
            }
        }
        return listBilanganPrima;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Awal : ");
        int awal = scanner.nextInt();

        System.out.print("Masukkan Akhir : ");
        int akhir = scanner.nextInt();

        ArrayList<Integer> listBilanganPrima = cariBilanganPrima(awal, akhir);

        System.out.println("Jumlah Bilangan Prima Dari " + awal + "-" + akhir + " adalah " + listBilanganPrima.size());
    }
}
