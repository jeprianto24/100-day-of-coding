import java.util.ArrayList;
public class day31 {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();

        daftarNama.add("Jeprianto");
        daftarNama.add("Jepp");
        daftarNama.add("jef");

        for (String nama : daftarNama) {
            System.out.println(nama);
        }
        System.out.println("----------------");
        ArrayList<Integer> nilai= new ArrayList<Integer>();

        nilai.add(1);
        nilai.add(2);
        nilai.add(3);

        for (int nli : nilai){
            System.out.println(nli);
        }
    }
}
