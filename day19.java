package javaapplication4;
import java.util.Vector;
public class day19 {

    public day19(String d0222136, String jeprianto, int par) {
    }
    public static void main(String[] args) {
        Vector<String> data1=new Vector();
        
        data1.add("hay");
        data1.add("nama");
        data1.add("saya");
        data1.add("jep");
        data1.add("ngambil jurusan");
        data1.add("Informatika");
        System.out.println("Vector data1 sebelum hapus element = "+data1);
        
        int hapusData=4;
        data1.remove(hapusData);
        System.out.println("Vector data1 setelah hapus element = "+data1);
    }
}
