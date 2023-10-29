public class jep {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("============================");
        for (int i = 0; i <= 6; i++) {
            System.out.print("* ");
        }
        System.out.println();

        System.out.println("============================");
        System.out.println("2");
        System.out.println("============================");
        for (int i = 0; i <= 8; i++) {
            System.out.println("*");
        }
        System.out.println("============================");
        System.out.println("3");
        System.out.println("============================");
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("============================");
        System.out.println("4");
        System.out.println("============================");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("============================");
        System.out.println("5");
        System.out.println("============================");

        for (int k = 5; k >= 1; k--) {
            for (int l = 1; l <= k; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("==============================");
        System.out.println("6");
        System.out.println("==============================");
        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= 5 - k; l++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= k; l++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println("==============================");
        System.out.println("7");
        System.out.println("==============================");

        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < k; l++) {
                System.out.print("  ");
            }
            for (int l = 0; l < (5-k); l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("==============================");
        System.out.println("8");
        System.out.println("==============================");
        for (int k = 0; k < 6; k++) {
            for (int l = 0; l < (6-k-1); l++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= k; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("==============================");
        System.out.println("9");
        System.out.println("==============================");
        for (int k = 0; k < 6; k++) {
            for (int l = 0; l < k; l++) {
                System.out.print(" ");
            }
            for (int l = 0; l < 6-k; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("==============================");
        System.out.println("10");
        System.out.println("==============================");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int g = 5; g >= 1; g--) {
            for (int h = 1; h <= g - 1; h++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================================");
    }
}
