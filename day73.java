import java.util.Scanner;

public class day73{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi atas trapesium: ");
        double sisiAtas = sc.nextDouble();
        System.out.print("Masukkan panjang sisi bawah trapesium: ");
        double sisiBawah = sc.nextDouble();
        System.out.print("Masukkan tinggi trapesium: ");
        double tinggi = sc.nextDouble();

        double luas = ((sisiAtas + sisiBawah) * tinggi) / 2;
        double keliling = sisiAtas + sisiBawah + (2 * Math.sqrt(Math.pow((sisiBawah - sisiAtas) / 2, 2) + Math.pow(tinggi, 2)));

        System.out.println("Luas trapesium: " + luas);
        System.out.println("Keliling trapesium: " + keliling);
    }
}
