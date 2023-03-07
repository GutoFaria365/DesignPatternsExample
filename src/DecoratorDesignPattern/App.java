package DecoratorDesignPattern;

import DecoratorDesignPattern.PizzaBuilder.BasePizza;
import DecoratorDesignPattern.PizzaBuilder.MediumPizza;
import DecoratorDesignPattern.PizzaBuilder.PizzaToppings.MushroomTopping;
import DecoratorDesignPattern.PizzaBuilder.PizzaToppings.PepperoniTopping;
import DecoratorDesignPattern.PizzaBuilder.Pizza;

public class App {
    static int orderNumber  = 0;
    public static void main(String[] args) {

        Pizza baseWithPM = new PepperoniTopping(new MushroomTopping(new BasePizza()));
        printPizza(baseWithPM);

        Pizza baseWithP = new PepperoniTopping(new BasePizza());
        printPizza(baseWithP);

        Pizza mediumWIthPP =new PepperoniTopping(new PepperoniTopping(new MediumPizza()));
        printPizza(mediumWIthPP);

    }

    private static void printPizza(Pizza finalPizza) {
        orderNumber++;
        System.out.println("Order nª: " + orderNumber);
        System.out.println(finalPizza.getDescription() + "!");
        System.out.println("Cost: " + finalPizza.getCost());
        System.out.println("-".repeat(50));
    }
}