import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angkaRahasia = 42;

        while (true) {
            try {
                System.out.print("Masukkan nilai: ");
                int nilai = sc.nextInt();

                if (nilai < angkaRahasia) {
                    System.out.println("Nilai terlalu kecil.");
                } else if (nilai > angkaRahasia) {
                    System.out.println("Nilai terlalu besar.");
                } else {
                    System.out.println("Nilai sama dengan Angka rahasia.");
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Mohon masukkan nilai yang valid (angka bulat).");
            }
        }
    }
}
