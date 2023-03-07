package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.DrinkBottle;

public class WhiskyBottle implements DrinkBottle {
    @Override
    public void typeOfDrink() {

        System.out.println("This is a Whisky Bottle");
    }
}
