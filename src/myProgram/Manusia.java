package myProgram;

public abstract class Manusia {
    protected String nama;
    protected String alamat;

    protected String getNama() {
        return nama;
    }

    protected String getAlamat() {
        return alamat;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
