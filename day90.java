import java.util.HashMap;
import java.util.Map;
class Substance {
    private String name;
    private double moles;
    public Substance(String name, double moles) {
        this.name = name;
        this.moles = moles;
    }
    public String getName() {
        return name;
    }
    public double getMoles() {
        return moles;
    }
    public void setMoles(double moles) {
        this.moles = moles;
    }
}
class ChemicalReaction {
    private Map<String, Double> reactants;
    private Map<String, Double> products;
    public ChemicalReaction(Map<String, Double> reactants, Map<String, Double> products) {
        this.reactants = reactants;
        this.products = products;
    }
    public void simulateReaction() {
        System.out.println("Simulating chemical reaction...");
        for (Map.Entry<String, Double> reactant : reactants.entrySet()) {
            String reactantName = reactant.getKey();
            double reactantMoles = reactant.getValue();
            System.out.println("Reactant: " + reactantName + " - " + reactantMoles + " moles");
        }
        for (Map.Entry<String, Double> product : products.entrySet()) {
            String productName = product.getKey();
            double productMoles = product.getValue();
            System.out.println("Product: " + productName + " - " + productMoles + " moles");
        }
    }
}
public class day90 {
    public static void main(String[] args) {
        Substance hydrogen = new Substance("Hydrogen", 2.0);
        Substance oxygen = new Substance("Oxygen", 1.0);
        Map<String, Double> reactants = new HashMap<>();
        reactants.put(hydrogen.getName(), hydrogen.getMoles());
        reactants.put(oxygen.getName(), oxygen.getMoles());
        Map<String, Double> products = new HashMap<>();
        products.put("Water", 2.0);
        ChemicalReaction waterFormation = new ChemicalReaction(reactants, products);
        waterFormation.simulateReaction();
    }
}