package DecoratorDesignPattern.pizzabuilder;

public class PepperoniTopping extends PizzaToppingsDecorator {

    private Pizza innerPizza;

    public PepperoniTopping(Pizza innerPizza) {
        super(innerPizza);
    }

    public String getDescription() {
        return super.getDescription() + ", with pepperoni";
    }

    public double getCost() {
        return super.getCost() + 2.5;
    }
}
