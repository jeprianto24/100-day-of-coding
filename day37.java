import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kalimat = sc.nextLine();
        String[] kata = kalimat.split("\\s");
        int panjangTerpanjang = 0;
        int indeksTerpanjang = -1;
        for (int i = 0; i < kata.length; i++) {
            System.out.println(kata[i]+": "+kata[i].length());
            if (kata[i].length() > panjangTerpanjang) {  
                panjangTerpanjang = kata[i].length();
                indeksTerpanjang = i;
            }
        }
        if (indeksTerpanjang >= 0) {
            System.out.println(panjangTerpanjang + " " + kata[indeksTerpanjang]);
        }
    }
}
