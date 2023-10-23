
package javaapplication4;
import java.util.Scanner;
public class day15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan 3 Angka :");
        int angka1 =input.nextInt();
        int angka2 =input.nextInt();
        int angka3 =input.nextInt();
        
        if (angka1 > angka2 && angka1 > angka3){
            System.out.println("Angka terbesar adalah angka ke-1 :"+angka1);
        }else if (angka2 > angka1 && angka2 > angka3){
            System.out.println("Angka terbesar adalah angka ke-2 :"+angka2);
        }else if (angka3 > angka1 && angka3> angka2){
            System.out.println("Angka terbesar adalah angka ke-3 :"+angka3);
        }else{
            System.out.println("angka yang anda masukkan bernilai sama");
        }
    }
}
