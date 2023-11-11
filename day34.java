import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
        System.out.println("program untuk menghitung harga tanah");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan luas tanah (meter persegi): ");
        double luasTanah = scanner.nextDouble();

        System.out.print("Masukkan harga per meter persegi: ");
        double hargaPerMeter = scanner.nextDouble();

        double totalHarga = luasTanah * hargaPerMeter;
        if (totalHarga > 100000000) {
            System.out.println("Total harga tanah sebelum diskon: "+ totalHarga);
            totalHarga *= 0.8;
            System.out.println("Total harga tanah setelah diskon 20%: " + totalHarga);
        } else if (totalHarga > 50000000 && totalHarga <= 99000000) {
            System.out.println("Total harga tanah sebelum diskon: "+ totalHarga);
            totalHarga *= 0.9;
            System.out.println("Total harga tanah setelah diskon 10%: " + totalHarga);
        } else if (totalHarga > 20000000 && totalHarga <= 49000000) {
            System.out.println("Total harga tanah sebelum diskon: "+ totalHarga);
            totalHarga *= 0.95;
            System.out.println("Total harga tanah setelah diskon 5%: " + totalHarga);
        }else{
            System.out.println("Total harga tanah : " + totalHarga);
        }
    }
}
