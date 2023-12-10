import java.util.Scanner;
public class day63{
    public static String enkripsi(String plaintext, int geser) {
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            char karakterSaatIni = plaintext.charAt(i);
            if (Character.isLetter(karakterSaatIni)) {
                char basis = Character.isLowerCase(karakterSaatIni) ? 'a' : 'A';
                int offset = karakterSaatIni - basis;
                char karakterTerenkripsi = (char) ((offset + geser) % 26 + basis);
                ciphertext.append(karakterTerenkripsi);
            } else {
                ciphertext.append(karakterSaatIni);
            }
        }
        return ciphertext.toString();
    }
    public static String dekripsi(String ciphertext, int geser) {
        return enkripsi(ciphertext, -geser);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String teksAsli = sc.nextLine();

        System.out.print("Masukkan nilai geser: ");
        int geser = sc.nextInt();

        String teksTerenkripsi = enkripsi(teksAsli, geser);
        String teksDidekripsi = dekripsi(teksTerenkripsi, geser);
        System.out.println("\nTeks terenkripsi: " + teksTerenkripsi);
        System.out.println("Teks didekripsi: " + teksDidekripsi);
    }
}
