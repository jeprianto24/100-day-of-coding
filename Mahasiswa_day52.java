public class Mahasiswa_day52 {
    String nama;
    String Nim;
    String alamat;
    String Jurusan;
    String angkatan;

    public Mahasiswa_day52(String nama, String nim, String alamat, String jurusan, String angkatan) {
        this.nama = nama;
        Nim = nim;
        this.alamat = alamat;
        Jurusan = jurusan;
        this.angkatan = angkatan;

        System.out.println(nama);
        System.out.println(Nim);
        System.out.println(alamat);
        System.out.println(jurusan);
        System.out.println(angkatan);
    }

    public static void main(String[] args) {
        Mahasiswa_day52 mhs1 = new Mahasiswa_day52("Nama : jeprianto","Nim : D0222316","Alamat : Linomaloga","Jurusan : Teknik informatika","Angkatan : 2022\n");
        Mahasiswa_day52 mhs2 = new Mahasiswa_day52("Nama : set","Nim : C0222316","Alamat : Linomaloga","Jurusan : Akuntansi","Angkatan : 2022\n");
        Mahasiswa_day52 mhs3 = new Mahasiswa_day52("Nama : Tony","Nim : B0222316","Alamat : Talumung","Jurusan : Teknik sipil","Angkatan : 2022");
    }
}
