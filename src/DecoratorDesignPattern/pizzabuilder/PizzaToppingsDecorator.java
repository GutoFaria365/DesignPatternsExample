package DecoratorDesignPattern.pizzabuilder;

abstract class PizzaToppingsDecorator implements Pizza {

    private Pizza innerPizza;

    public PizzaToppingsDecorator(Pizza innerPizza) {
        this.innerPizza = innerPizza;
    }

    public String getDescription() {
        return innerPizza.getDescription();
    }

    public double getCost() {
        return innerPizza.getCost();
    }
}