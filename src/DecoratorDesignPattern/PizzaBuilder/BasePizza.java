package DecoratorDesignPattern.PizzaBuilder;

public class BasePizza implements Pizza {
//    @Autowired
//    BasicPizza pizza;
    public String getDescription() {
        return "Base pizza";
    }

    public double getCost() {
        return 10.0;
    }
}