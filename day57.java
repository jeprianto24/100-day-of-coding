public class day57 {
    public static void main(String[] args) {
        int angkaInt = 123;
        System.out.println(angkaInt);
        String angkaString = Integer.toString(angkaInt);
        System.out.println("Hasil konversi int ke String: " + angkaString);

        String angkaString2 = "456";
        System.out.println(angkaString2);
        int angkaInt2 = Integer.parseInt(angkaString2);
        System.out.println("Hasil konversi String ke int: " + angkaInt2);

        int angkaInt3 = 789;
        System.out.println(angkaInt3);
        float angkaFloat = (float) angkaInt3;
        System.out.println("Hasil konversi int ke float: " + angkaFloat);

        String angkaString4 = "987.65";
        System.out.println(angkaString4);
        float angkaFloat2 = Float.parseFloat(angkaString4);
        System.out.println("Hasil konversi String ke float: " + angkaFloat2);

        float angkaFloat3 = 123.456f;
        System.out.println(angkaFloat3);
        int angkaInt4 = (int) angkaFloat3;
        System.out.println("Hasil konversi float ke int: " + angkaInt4);

        float angkaFloat4 = 789.012f;
        System.out.println(angkaFloat4);
        String angkaString5 = Float.toString(angkaFloat4);
        System.out.println("Hasil konversi float ke String: " + angkaString5);
    }
}
