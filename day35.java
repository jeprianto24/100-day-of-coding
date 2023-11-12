import java.util.LinkedList;

public class day35 {
    public static void main(String[] args) {
        System.out.println("Program linked list");
        LinkedList<String> a = new LinkedList<>();

        a.add("A");
        a.add("B");
        a.add("C");
        a.addFirst("D");
        a.addLast("E");
        a.add(1,"F");
        System.out.println("Element a \n"+a);

        a.remove("B");
        a.remove(3);
        a.removeFirst();
        a.removeLast();
        System.out.println("Menghapus beberapa element berdasarkan isi,indeks,element pertama,dan element terakhir \n"+a);
        a.set(0,"ab");
        System.out.println("mengganti element indeks ke-0 \n"+a);
    }
}
