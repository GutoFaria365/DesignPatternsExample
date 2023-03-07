package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.DrinkBottle;

public class WineBottle implements DrinkBottle {
    @Override
    public void typeOfDrink() {
        System.out.println("This is a Wine Bottle");

    }
}
