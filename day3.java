package Isc;
import java.util.Scanner;
public class day3 {
    public static void main(String[] args) {
        System.out.println("INI ADALAH PROGRAM DATA DIRI DENGAN INPUTAN DARI USER\n");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama anda :");
        String nama = input.nextLine();
        
        System.out.print("Masukkan alamat anda :");
        String alamat = input.nextLine();
        
        System.out.print("Masukkan tempat lahir anda :");
        String tl = input.nextLine();
        
        System.out.print("Masukkan tanggal lahir anda :");
        String tgl = input.nextLine();
        
        System.out.print("Masukkan nomor telepon anda :");
        long nomor = input.nextLong();
        
        System.out.println("\nNama saya adalah "+nama);
        System.out.println("Saya tinggal di "+alamat);
        System.out.println("Saya lahir di "+tl+" pada tanggal "+tgl);
        System.out.println("Nomor telepon saya "+nomor);
    }
    
}
