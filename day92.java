import java.util.Scanner;
public class day92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan volume minuman (dalam mililiter): ");
        double volumeMinuman = scanner.nextDouble();
        System.out.print("Masukkan kadar alkohol minuman (%): ");
        double kadarAlkohol = scanner.nextDouble();

        double kadarAlkoholDalamMinuman = (volumeMinuman * kadarAlkohol) / 100;
        System.out.println("Volume minuman: " + volumeMinuman + " mL");
        System.out.println("Kadar alkohol minuman: " + kadarAlkohol + "%");
        System.out.println("Kadar alkohol dalam minuman: " + kadarAlkoholDalamMinuman + " mL");
    }
}
