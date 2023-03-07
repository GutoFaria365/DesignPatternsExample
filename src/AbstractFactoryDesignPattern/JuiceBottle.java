package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.DrinkBottle;
public class JuiceBottle implements DrinkBottle {
    @Override
    public void typeOfDrink() {

        System.out.println("This is a Juice Bottle");
    }
}
