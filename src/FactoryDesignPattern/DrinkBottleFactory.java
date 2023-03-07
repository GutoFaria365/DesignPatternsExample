package FactoryDesignPattern;

public abstract class DrinkBottleFactory {

    public  DrinkBottle createDrinkBottle() {
            DrinkBottle drinkBottle = fillWithJuice();
            drinkBottle.typeOfDrink();
            return drinkBottle;
    }

    public abstract void typeOfDrink();

    public abstract DrinkBottle fillWithJuice();
    }

