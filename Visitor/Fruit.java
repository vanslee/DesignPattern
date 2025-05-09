package Visitor;

public class Fruit implements ItemElement {
    private String name;
    private double weight;
    private double pricePerKg;

    public Fruit(String name, double weight, double pricePerKg) {
        this.name = name;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
