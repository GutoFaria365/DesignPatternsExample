package DecoratorDesignPattern.pizzabuilder;

public class MushroomTopping extends PizzaToppingsDecorator{

    private Pizza innerPizza;

    public MushroomTopping(Pizza innerPizza) {
        super(innerPizza);
    }

    public String getDescription() {
        return super.getDescription() + ", with mushrooms";
    }

    public double getCost() {
        return super.getCost() + 1.5;
    }
}
