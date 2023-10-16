package javaapplication4;
import java.util.Scanner;
public class day8 {
    static public void main(String [] args) {
        System.out.println("Program untuk menampilkan generasi kelahiran");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tahun kelahiran : ");
        int Tahun = input.nextInt();
        
        if (Tahun >=1928 && Tahun <= 1940){
            System.out.println("Anda lahir di Generasi Silent ");
        }else if (Tahun>=1941 && Tahun<=1960){
            System.out.println("Anda lahir di Generasi Boomers");
        }else if (Tahun>=1961 && Tahun<=1980){
            System.out.println("Anda lahir di Generasi X");
        }else if (Tahun>=1981 && Tahun<=1990){
            System.out.println("Anda lahir di Generasi Y");
        }else if (Tahun>=1991 && Tahun<=2010){
            System.out.println("Anda lahir di Generasi Z");
        }else{
            System.out.println("Anda lahir di Genenrasi Alpha");
        }
    }
}
