package javaapplication4;
import java.util.Scanner;
class day5{
    public static void main(String[] args) {
        System.out.print("Program ganjil genap");
       Scanner input= new Scanner(System.in);
       
        System.out.print("Masukkan nilai ");
        int nilai = input.nextInt();
        
        if (nilai<=100 && nilai>=90){
            System.out.println("Selamat nilai anda A");
        }else if (nilai <=89 && nilai>=80){
            System.out.println("Selamat nilai anda B");
        }else if (nilai<=79 && nilai>=70){
            System.out.println("Tingkatkan belajarnya");
        }else{
            System.out.println("Silahkan coba lagi tahun depan");
        } 
   }
}
