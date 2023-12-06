public class Armor {
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    void display(){
        System.out.println("Armoe : "+this.name+" , defence :"+this.defencePower);
    }
}
