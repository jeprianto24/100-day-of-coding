import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan 2 bilangan");
        int bil1 = sc.nextInt();
        int bil2 = sc.nextInt();

        System.out.println("Pilih operasi (1: Pemjumlahan, 2: pengurangan, 3: perkalian, 4; pembagian)");
        int pilihan= sc.nextInt();
        int hasil = 0;

        switch (pilihan){
            case 1:
                hasil = bil1 + bil2;
                System.out.println("hasil dari "+bil1+" + "+bil2+" adalah "+hasil);
                break;
            case 2:
                hasil=bil1 - bil2;
                System.out.println("hasil dari "+bil1+" - "+bil2+" adalah "+hasil);
                break;
            case 3:
                hasil = bil1 * bil2;
                System.out.println("hasil dari "+bil1+" * "+bil2+" adalah "+hasil);
                break;
            case 4:
                if (bil2 != 0){
                    hasil = bil1 / bil2;
                    System.out.println("hasil dari "+bil1+" / "+bil2+" adalah "+hasil);
                }else{
                    System.out.println("nol tidak bisa dijadikan sebagai pembagi");
                }
                break;
            default:
                System.out.println("Operasi tidak valid");
        }
    }
}
