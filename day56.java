import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        int[] iniArray = {12, 22, 33, 4, 5, 6, 7, 1, 3, 70, 100, 654};

        cetakArray(iniArray);

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan elemen yang ingin dicari: ");
        int elemenDicari = sc.nextInt();

        int index = cariIndeks(iniArray, elemenDicari);

        if (index != -1) {
            System.out.println("Elemen " + elemenDicari + " ditemukan pada indeks " + index);
        } else {
            System.out.println("Elemen " + elemenDicari + " tidak ditemukan dalam array.");
        }
    }

    private static void cetakArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int cariIndeks(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
