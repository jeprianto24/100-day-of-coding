
package javaapplication4;
import java.util.Scanner;
public class day10 {
    public static void main(String[] args) {
        System.out.println("Membuat program untuk menamplkan segitiga mengggunakan *");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n :");
        int n = input.nextInt();
        
        for (int i=1 ; i<=n;i++){
            for(int j=1; j<=i ;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        
        }
        System.out.println("======================================");
        for (int i=n ; i>=1;i--){
            for(int j=1; j<=i ;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        
        }
        
    }
}
