public class day29 {
    public static void main(String[] args) {
        System.out.println("String");
        System.out.println("----------------");
        String[][] hewan = {
                {"ayam", "kucing", "ikan"},
                {"sapi", "kuda", "kambing"},
                {"kelinci", "harimau", "serigala"}
        };
        System.out.println(hewan[0][1]);
        System.out.println(hewan[2][1]);

        System.out.println("\nint");
        System.out.println("----------------");

        int [][] angka={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(angka[1][2]);
        System.out.println(angka[2][2]);

        System.out.println("\nfloat");
        System.out.println("----------------");

        float[][] nilai={
                {1.23f,2.34f,3.45f},
                {4.56f,5.67f,6.78f},
                {7.89f,8.90f,9.01f}
        };
        System.out.println(nilai[1][0]);
        System.out.println(nilai[2][0]);
    }

}
