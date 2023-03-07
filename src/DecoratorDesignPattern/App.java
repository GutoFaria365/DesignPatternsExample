package DecoratorDesignPattern;

import DecoratorDesignPattern.pizzabuilder.BasicPizza;
import DecoratorDesignPattern.pizzabuilder.MushroomTopping;
import DecoratorDesignPattern.pizzabuilder.PepperoniTopping;
import DecoratorDesignPattern.pizzabuilder.Pizza;

public class App {
    public static void main(String[] args) {


        Pizza basicPizza = new PepperoniTopping(new MushroomTopping(new BasicPizza()));
        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getCost());

        Pizza basicPizza2 = new PepperoniTopping(new BasicPizza());
        System.out.println(basicPizza2.getDescription());
        System.out.println(basicPizza2.getCost());
    }
}