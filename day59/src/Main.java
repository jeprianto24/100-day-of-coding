public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("ucup",100);
        Player player2 = new Player("udin",100);
        Weapon badik = new Weapon("Badik",15);
        Weapon celurit = new Weapon("Celurit",15);
        Armor bajuBesi = new Armor("baju besi",10);


        player1.equipWeapon(badik);
        player1.equipArmor(bajuBesi);
        player1.display();

        player2.equipWeapon(celurit);
        player2.equipArmor(bajuBesi);
        player2.display();
    }
}
