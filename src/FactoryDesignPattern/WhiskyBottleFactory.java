package FactoryDesignPattern;

public class WhiskyBottleFactory extends DrinkBottleFactory{

    @Override
    public void typeOfDrink() {

    }

    @Override
    public DrinkBottle fillWithJuice() {
        return new WhiskyBottle();
    }


    public class WhiskyBottle implements DrinkBottle {

        @Override
            public void typeOfDrink() {
                System.out.println("This is a Whisky Bottle");
            }
    }
}
