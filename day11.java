public class day11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int hasil = i * j;
                String itunya = String.format("%1d x %1d = %d", i, j, hasil);
                System.out.print(itunya + "\t");
            }
            System.out.println(); 
        }
    }
}
