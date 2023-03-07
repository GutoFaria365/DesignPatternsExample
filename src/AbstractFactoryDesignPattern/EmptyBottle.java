package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.DrinkBottle;

public class EmptyBottle implements DrinkBottle {
    @Override
    public void typeOfDrink() {

        System.out.println("This is an Empty Bottle");
    }
}
