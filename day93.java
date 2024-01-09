import java.io.IOException;
import java.util.Scanner;
class day93 {
    private static final int JUMLAH_LED = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Tekan Enter untuk menghentikan lampu LED.");
            System.out.println();
            boolean[] statusLED = new boolean[JUMLAH_LED];
            for (int i = 0; i < JUMLAH_LED; i++) {
                statusLED[i] = false;
            }

            while (true) {
                tampilkanStatusLED(statusLED);
                tidur(500);
                for (int i = 0; i < JUMLAH_LED; i++) {
                    statusLED[i] = !statusLED[i];
                }
                if (System.in.available() > 0 && scanner.nextLine().equals("")) {
                    break;
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }
    }
    private static void tampilkanStatusLED(boolean[] statusLED) {
        for (boolean status : statusLED) {
            if (status) {
                System.out.print("O ");
            } else {
                System.out.print("- ");
            }
        }
        System.out.println();
    }
    private static void tidur(int milidetik) {
        try {
            Thread.sleep(milidetik);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
