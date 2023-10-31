import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("21");
        System.out.println("=====================");
        for (int i = 1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for (int i = 1;i<=n;i++){
            for (int j =2 ;j<=i+1;j++){
                System.out.print("   ");
            }
            for (int k = n-1;k>=i;k--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        System.out.println("=====================");
        System.out.println("22");
        System.out.println("=====================");
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
        System.out.println("=====================");
        System.out.println("23");
        System.out.println("=====================");
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=n;j++){
                System.out.print(" + ");
            }
            System.out.println(" ");
        }
        System.out.println("=====================");
        System.out.println("24");
        System.out.println("=====================");
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=n;j++){
                System.out.print(" + ");
            }
            System.out.println(" ");
        }
        System.out.println("=====================");
        System.out.println("25");
        System.out.println("=====================");
        for (int i = 1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (j%2==1){
                    System.out.print(" + ");
                }else {
                    System.out.print(" = ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("=====================");
    }
}
