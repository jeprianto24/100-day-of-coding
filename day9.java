
package javaapplication4;
import java.util.Scanner;
public class day9 {
    public static void main(String[] args) {
        System.out.println("menghitung nilai min dan max\n");
        Scanner input = new Scanner(System.in);
        
         System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();

        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();

        double min, max;

        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        System.out.println("Nilai Minimum (min): " + min);
        System.out.println("Nilai Maksimum (max): " + max);
        
        
    }
    
}
