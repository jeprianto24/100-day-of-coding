import java.util.Scanner;

public class day84 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Konversi Tegangan Listrik");
        System.out.print("Masukkan nilai tegangan (dalam volt): ");

        double teganganVolt = input.nextDouble();
        double teganganKilovolt = konversiKeKilovolt(teganganVolt);
        double teganganMegavolt = konversiKeMegavolt(teganganVolt);
        double teganganGigavolt = konversiKeGigavolt(teganganVolt);

        System.out.println("Hasil Konversi:");
        System.out.println(teganganVolt + " volt = " + teganganKilovolt + " kilovolt");
        System.out.println(teganganVolt + " volt = " + teganganMegavolt + " megavolt");
        System.out.println(teganganVolt + " volt = " + teganganGigavolt + " gigavolt");
    }
    private static double konversiKeKilovolt(double teganganVolt) {
        return teganganVolt / 1000;
    }
    private static double konversiKeMegavolt(double teganganVolt) {
        return teganganVolt / 1000000;
    }
    private static double konversiKeGigavolt(double teganganVolt) {
        return teganganVolt / 1000000000;
    }
}
