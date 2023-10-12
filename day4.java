package Isc;
import java.util.Scanner;
public class day4 {
    public static void main(String[] args) {
        System.out.println("Operasi aritmatika");
        Scanner input=new Scanner(System.in);
        
        System.out.print("Masukkan nilai a :");
        int a =input.nextInt();
        System.out.print("Masukkan nilai b :");
        int b =input.nextInt();
        
        int tambah =a+b;
        int kurang =a-b;
        int kali =a*b;
        int bagi =a/b;
        int sisaHasilBagi = a%b;
        
        System.out.println("Penjumlahan : "+tambah);
        System.out.println("Pengurangan : "+kurang);
        System.out.println("Perkalian   : "+kali);
        System.out.println("Pembagian   : "+bagi);
        System.out.println("Modulus     : "+sisaHasilBagi);
        
        System.out.println("Operasi penugasan");
        
        int c = 10;
        System.out.println("Sebelum penugasan nilai c ="+c);
        c += 5;
        c -= 5;
        c *= 2;
        c /= 2;
        c %= 5;
        System.out.println("Setelah penugasan nilai c ="+c);
        
    }
    
}
