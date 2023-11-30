public class Buku_day53 {
    String judul;
    String penulis;

    Buku_day53(String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
    }
    void display(){
        System.out.println("\nJudul\t :"+judul);
        System.out.println("Penulis\t :"+penulis);
    }

    public static void main(String[] args) {
        Buku_day53 databk1 = new Buku_day53("Sejarah filsafat barat","Betrand Russle");
        Buku_day53 databk2 = new Buku_day53("Modul PBO","Tim penyusun");
        databk1.display();
        String addresBuku1 = Integer.toHexString(System.identityHashCode(databk1));
        System.out.println(addresBuku1);
        databk2.display();
        String addresBuku2 = Integer.toHexString(System.identityHashCode(databk2));
        System.out.println(addresBuku2);
    }

}
