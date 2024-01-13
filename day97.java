import java.util.Scanner;

public class day97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi piramida: ");
        int tinggi = scanner.nextInt();
        printPyramid(tinggi);
    }
    static void printPyramid(int tinggi) {
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < tinggi - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
