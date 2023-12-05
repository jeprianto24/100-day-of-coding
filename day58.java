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
        day58 person = new day58();

        person.setNama("Jepp");
        person.setUmur(20);

        System.out.println("Nama: " + person.getNama());
        System.out.println("Umur: " + person.getUmur());
    }
}
