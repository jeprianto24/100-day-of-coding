public class day58 {
    private String nama;
    private int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public static void main(String[] args) {
        day58 orang = new day58();

        orang.setNama("Jepp");
        orang.setUmur(20);

        System.out.println("Nama: " + orang.getNama());
        System.out.println("Umur: " + orang.getUmur());
    }
}
