import java.util.Scanner;
public class day98 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan radius lingkaran: ");
        int radius = input.nextInt();

        lingkaran(radius);
    }
    static void lingkaran(int radius) {
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                double distance = Math.sqrt(i * i + j * j);
                if (Math.abs(distance - radius) < 0.5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
