 package javaapplication4;
import java.util.Scanner;
public class day12 {
    public static void main(String[] args) {
        System.out.println("Program menghitung gaji karyawan");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan gaji karyawan: ");
        double gaji = input.nextDouble();
        double potonganPajak;
        
        if (gaji <= 5000000) {
            potonganPajak = gaji * 0.05;
        } else if (gaji <= 10000000) {
            potonganPajak = gaji * 0.1;
        } else {
            potonganPajak = gaji * 0.15;
        }
        double gajiBersih = gaji - potonganPajak;
        System.out.println("Gaji bersih karyawan adalah: " + gajiBersih);

    }
}
