package DecoratorDesignPattern.pizzabuilder;

public class BasicPizza implements Pizza {
//    @Autowired
//    BasicPizza pizza;
    public String getDescription() {
        return "Basic pizza";
    }

    public double getCost() {
        return 10.0;
    }
}