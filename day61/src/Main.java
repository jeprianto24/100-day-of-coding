public class Main {
    public static void main(String[] args) {
        binatang hewan1 = new binatang("catty", 3);
        hewan1.makan();
        hewan1.tidur();

        kucing hewan2 = new kucing("Molly", 2, "putih");
        hewan2.makan();
        hewan2.tidur();
        hewan2.suara();
    }
}