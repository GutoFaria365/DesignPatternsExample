package DecoratorDesignPattern.pizzabuilder;

public class MushroomTopping extends PizzaToppingsDecorator{

    private Pizza incompletePizza;

    public MushroomTopping(Pizza incompletePizza) {
        super(incompletePizza);
    }

    public String getDescription() {
        return super.getDescription() + ", with mushrooms";
    }

    public double getCost() {
        return super.getCost() + 1.5;
    }
}
