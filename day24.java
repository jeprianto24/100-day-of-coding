import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("26");
        System.out.println("==============================");
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=m;j++){
                if (i%2==1){
                    System.out.print(" + ");
                }else {
                    System.out.print(" = ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("==============================");
        System.out.println("27");
        System.out.println("==============================");
        for (int i =1;i<=n;i++){
            for (int j = 1;j<=m;j++){
                if (i%2==1){
                    if (j%2==1){
                        System.out.print(" + ");
                    }else{
                        System.out.print(" = ");
                    }
                }else {
                    if (j%2==1){
                        System.out.print(" = ");
                    }else {
                        System.out.print(" + ");
                    }
                }
            }
            System.out.println(" ");
        }
        System.out.println("==============================");
        System.out.println("28");
        System.out.println("==============================");
        for (int i =1;i<=n;i++){
            for (int j = 1;j<=m;j++){
                if (i>1 && i<n){
                    if (j>1 && j<m){
                        System.out.print(" ~ ");
                    }else{
                        System.out.print(" + ");
                    }
                }else {
                    System.out.print(" + ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("==============================");
        System.out.println("29");
        System.out.println("==============================");
        for (int i =1;i<=n;i++){
            for (int j = 1;j<=m;j++){
                if (i>1 && i<n){
                    if (j>1 && j<m){
                        System.out.print(". ");
                    }else{
                        System.out.print("* ");
                    }
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("==============================");
        System.out.println("30");
        System.out.println("==============================");
        for (int i =1;i<=n;i++){
            for (int j = 1;j<=m;j++){
                if (i>1 && i<n){
                    if (j>1 && j<m){
                        System.out.print("- ");
                    }else{
                        System.out.print("+ ");
                    }
                }else {
                    System.out.print("+ ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("==============================");
    }
}
