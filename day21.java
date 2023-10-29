import java.util.Scanner;

public class day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("11");
        System.out.println("=========================");
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===========================");
        System.out.println("12");
        System.out.println("===========================");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print("  ");
            }
            for (int j=0;j<(n-i);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===========================");
        System.out.println("13");
        System.out.println("===========================");
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print("  ");
            }
            for (int j=0;j<(n-i);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=2;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===========================");
        System.out.println("14");
        System.out.println("===========================");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===========================");
        System.out.println("15");
        System.out.println("===========================");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        System.out.println("===========================");
        System.out.println("16");
        System.out.println("===========================");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        System.out.println("===========================");
        System.out.println("17");
        System.out.println("===========================");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            if (i<n-1){
                System.out.print("* ");
            }
            int a=2 * (n-i-1)-1;
            for (int j=0; j<a;j++){
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
