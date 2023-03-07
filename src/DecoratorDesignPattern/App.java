package DecoratorDesignPattern;

import DecoratorDesignPattern.PizzaBuilder.BasePizza;
import DecoratorDesignPattern.PizzaBuilder.PizzaToppings.MushroomTopping;
import DecoratorDesignPattern.PizzaBuilder.PizzaToppings.PepperoniTopping;
import DecoratorDesignPattern.PizzaBuilder.Pizza;

public class App {
    public static void main(String[] args) {


        Pizza basicPizza = new PepperoniTopping(new MushroomTopping(new BasePizza()));
        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getCost());

        Pizza basicPizza2 = new PepperoniTopping(new BasePizza());
        System.out.println(basicPizza2.getDescription());
        System.out.println(basicPizza2.getCost());

        Pizza basicPizza3 =new PepperoniTopping(new PepperoniTopping(new BasePizza()));
        System.out.println(basicPizza3.getDescription());
        System.out.println(basicPizza3.getCost());
    }
}