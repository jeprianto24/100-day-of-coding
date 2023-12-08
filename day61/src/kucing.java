public class kucing extends binatang {
    String warna;

    public kucing(String nama, int umur, String warna) {
        super(nama, umur);
        this.warna = warna;
    }

    public void suara() {
        System.out.println(nama + " Bunyinya: Meow");
    }
}

