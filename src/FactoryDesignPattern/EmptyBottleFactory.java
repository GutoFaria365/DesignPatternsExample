package FactoryDesignPattern;

public class EmptyBottleFactory extends DrinkBottleFactory{

    @Override
    public void typeOfDrink() {

    }

    @Override
    public DrinkBottle fillWithJuice() {
        return new EmptyBottle();
    }

    public class EmptyBottle implements DrinkBottle {

        @Override
        public void typeOfDrink() {
            System.out.println("This is an Empty Bottle");
        }
    }
}
