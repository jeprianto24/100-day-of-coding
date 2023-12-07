public class Player {
    String name;
    double health;

    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon=weapon;
    }
    void  equipArmor(Armor armor){
        this.armor = armor;
    }
    void display(){
        System.out.println("\nNama :"+this.name);
        System.out.println("health :"+this.health+" hp");
        this.weapon.display();
        this.armor.display();
    }

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name+" Attacking "+opponent.name+" with power "+attackPower);
        opponent.defence(attackPower);
    }
    void defence(double attackPower){
        double damage;
        if(this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        }else{
            damage = 0;
        }
        System.out.println(this.name+" gets damagae "+damage);
    }
}
