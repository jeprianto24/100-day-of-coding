package javaapplication4;
import java.util.Scanner;
public class day18 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Masukkan bulan : ");
        int bulan =input.nextInt();
        String stringBulan;
        switch(bulan){
            case 1:
                stringBulan = "Januari";
                break;
            case 2:
                stringBulan = "Februari";
                break;
            case 3:
                stringBulan = "Maret";
                break;
            case 4:
                stringBulan = "April";
                break;
            case 5:
                stringBulan = "Mei";
                break;
            case 6:
                stringBulan = "Juni";
                break;
            case 7:
                stringBulan = "Juli";
                break;
            case 8:
                stringBulan = "Agustus";
                break;
            case 9:
                stringBulan = "September";
                break;
            case 10:
                stringBulan = "Oktober";
                break;
            case 11:
                stringBulan = "Nvember";
                break;
            case 12:
                stringBulan = "Desember";
                break;
            default:
                stringBulan = "Invalid";
                break;
        }
        System.out.println(stringBulan+" Adalah bulan ke-"+bulan);    
    }
}
