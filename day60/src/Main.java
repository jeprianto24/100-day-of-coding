public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("ucup",100);
        Player player2 = new Player("udin",100);
        Weapon badik = new Weapon("Badik",10);
        Weapon celurit = new Weapon("Celurit",25);
        Armor bajuBesi = new Armor("baju besi",10);
        Armor kaos = new Armor("Baju kaos",0);


        player1.equipWeapon(badik);
        player1.equipArmor(bajuBesi);
        player1.display();

        player2.equipWeapon(celurit);
        player2.equipArmor(kaos);
        player2.display();

        System.out.println("\nPertempuran");
        System.out.println("\nEpisode 1\n");
        player1.attack(player2);
        System.out.println("\nEpisode 2\n");
        player2.attack(player1);
    }
}
