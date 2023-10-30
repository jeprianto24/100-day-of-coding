import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("18");
        System.out.println("==================================");
        for (int i = 1;i<=n;i++){
            for (int j = n;j>=i;j--){
                if (j==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }for (int k = 2;k<=i;k++){
                System.out.print("   ");
            }
            for (int l = 2;l<=i;l++){
                if (l==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("===================");
        System.out.println("19");
        System.out.println("===================");
        for (int i = 1;i<=n-1;i++){
            for (int j = 1;j<=n-1;j++){
                if (j==i){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }

            }
            for (int k=n;k>=i;k--){
                if (k==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 1;i<=n;i++){
            for (int j = n;j>=i;j--){
                if (j==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }for (int k = 2;k<=i;k++){
                System.out.print("   ");
            }
            for (int l = 2;l<=i;l++){
                if (l==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("===================");
        System.out.println("20");
        System.out.println("===================");
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i+1;j--){
                System.out.print("   ");
            }
            for (int k = 1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for (int i=1;i<=n;i++){
            for (int j = n-1 ;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        System.out.println("===================");

    }
}
