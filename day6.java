package javaapplication4;
import java.util.Scanner;
public class day6 {
    public static void main(String[] args) {
        System.out.println("Program untuk menampilkan angka ganjil genap");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka :");
        int angka =input.nextInt();
        System.out.println("ini untuk menampilkan angka genap");
        for (int i=1;i<angka;i++ ){
            if (i%2==0){
                System.out.println("ini angka genap "+i);
            }
        }
        System.out.println("\nini untuk menampilakan angka ganjil\n");
        for (int j=1;j<angka;j++){
            if (j%2==1){
                System.out.println("ini angka ganjil "+j);
            }
        }
        System.out.println("\nini untuk menampilkan keduanya\n");
        for (int k=1;k<angka;k++){
            if (k%2==0){
                System.out.println("ini angka genap "+k);
            }else{
                System.out.println("ini angka ganjil "+k);
            }
        }
        
    }
}
