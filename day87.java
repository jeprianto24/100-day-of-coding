import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah karakter: ");
        char karakter = input.next().charAt(0);

        if (Character.isDigit(karakter)) {
            int angka = Character.getNumericValue(karakter);
            if (angka % 2 == 0) {
                System.out.println("Angka Genap");
            } else {
                System.out.println("Angka Ganjil");
            }
        } else if (Character.isLetter(karakter)) {
            char hurufKecil = Character.toLowerCase(karakter);
            if (hurufKecil == 'a' || hurufKecil == 'e' || hurufKecil == 'i' || hurufKecil == 'o' || hurufKecil == 'u') {
                System.out.println("Huruf Vokal");
            } else {
                System.out.println("Huruf Mati");
            }
        } else if (Character.isWhitespace(karakter) || Character.isSpaceChar(karakter)) {
            System.out.println("Spasi atau karakter kosong");
        } else {
            System.out.println("Tanda Baca atau karakter khusus");
        }
    }
}
