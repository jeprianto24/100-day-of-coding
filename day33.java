import java.util.Vector;

public class day33 {
    public static void main(String[] args) {
        Vector<String> vector1 = new Vector<>();

        vector1.add("satu");
        vector1.add("dua");
        vector1.add("tiga");

        System.out.println("Elemen-elemen Vector string:");
        for (String vct1 : vector1) {
            System.out.println(vct1);
        }


        Vector<Integer> vector2 = new Vector<>();

        vector2.add(11);
        vector2.add(22);
        vector2.add(33);

        System.out.println("Elemen-elemen Vector int:");
        for (int vct2 : vector2) {
            System.out.println(vct2);
        }

    }
}
