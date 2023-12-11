import java.util.Scanner;

public class day64 {
    static boolean isPrima(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan batas atas: ");
        int batasAtas = sc.nextInt();

        System.out.println("Bilangan prima ganjil:");
        for (int i = 3; i <= batasAtas; i += 2) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan prima genap:");
        for (int i = 2; i <= batasAtas; i += 2) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
