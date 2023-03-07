package DecoratorDesignPattern.PizzaBuilder;

public abstract class PizzaToppingsDecorator implements Pizza {

    private Pizza incompletePizza;

    public PizzaToppingsDecorator(Pizza incompletePizza) {
        this.incompletePizza = incompletePizza;
    }

    public String getDescription() {
        return incompletePizza.getDescription();
    }

    public double getCost() {
        return incompletePizza.getCost();
    }
}