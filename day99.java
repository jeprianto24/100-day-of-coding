public class day99 {
    public static void main(String[] args) {
        int tinggiRumah = 5;
        int lebarRumah = 3;

        for (int i = 1; i <= tinggiRumah / 2 + 1; i++) {
            for (int j = 1; j <= tinggiRumah / 2 + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= lebarRumah / 2 + 1; i++) {
            for (int j = 1; j <= lebarRumah; j++) {
                if (i == lebarRumah / 2 + 1 || j == 1 || j == lebarRumah) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
