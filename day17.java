package javaapplication4;

public class day17 {
    public static void main(String[] args) {
        System.out.println("Membuat Array sederhana");
        
        String [] buah ={"apel","mangga","jeruk"};
        int [] angka ={1,2,3};
        for (String element : buah) {
            System.out.println(element + " ");
        }
        for (int element : angka) {
            System.out.println(element + " ");
        }
    }
}
