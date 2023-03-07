package FactoryDesignPattern;

public class WineBottleFactory extends DrinkBottleFactory{


    @Override
    public void typeOfDrink() {

    }

    @Override
    public DrinkBottle fillWithJuice() {
        return new WineBottle();
    }

    public class WineBottle implements DrinkBottle {

        @Override
        public void typeOfDrink() {
                System.out.println("This is a Wine Bottle");
        }
    }
}
