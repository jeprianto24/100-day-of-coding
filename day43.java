public class day43 {
    enum WarnaLampu {
        MERAH,
        KUNING,
        HIJAU
    }

    static WarnaLampu lampuJalan;

    public static void main(String[] args) {
        // Inisialisasi warna lampu jalan
        lampuJalan = WarnaLampu.MERAH;

        // Simulasi perubahan warna lampu jalan
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            tampilkanStatusLampu();
            if(lampuJalan == WarnaLampu.MERAH || lampuJalan == WarnaLampu.HIJAU) {
                tunggu(10000);
            }else{
                tunggu(1000);
            }
            ubahWarnaLampu();
        }
    }

    private static void tampilkanStatusLampu() {
        System.out.println("Status Lampu Jalan: " + lampuJalan);
    }

    private static void ubahWarnaLampu() {
        switch (lampuJalan) {
            case MERAH:
                lampuJalan = WarnaLampu.KUNING;
                break;
            case KUNING:
                lampuJalan = WarnaLampu.HIJAU;
                break;
            case HIJAU:
                lampuJalan = WarnaLampu.MERAH;
                break;
        }
    }

    private static void tunggu(int millisecond) {
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
