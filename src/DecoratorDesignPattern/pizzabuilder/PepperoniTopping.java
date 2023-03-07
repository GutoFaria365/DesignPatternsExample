package DecoratorDesignPattern.pizzabuilder;

public class PepperoniTopping extends PizzaToppingsDecorator {

    private Pizza incompletePizza;

    public PepperoniTopping(Pizza incompletePizza) {
        super(incompletePizza);
    }

    public String getDescription() {
        return super.getDescription() + ", with pepperoni";
    }

    public double getCost() {
        return super.getCost() + 2.5;
    }
}
