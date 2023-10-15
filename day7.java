package javaapplication4;
import java.util.Scanner;
public class day7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        do {
            System.out.print("Masukkan usia :");
            int umur=input.nextInt();;
        
            if (umur >=18){
                System.out.println("anda sudah dewasa");
            }else{
                System.out.println("anda belum dewasa");
            }
        }while(umur >= 18);    
    }
}
