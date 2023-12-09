public class day62 {
    public static void main(String[] args) {
        try {
            int hasil = divideByZero();
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.err.println("Terjadi exception: " + e.getMessage());
        } finally {
            System.out.println("Blok finally dieksekusi.");
        }
    }

    public static int divideByZero() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;
    }
}
