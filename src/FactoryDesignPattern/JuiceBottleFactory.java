package FactoryDesignPattern;
public class JuiceBottleFactory extends DrinkBottleFactory {
    @Override
    public void typeOfDrink() {
        System.out.println("This is a Juice Bottle");
    }

    @Override
    public DrinkBottle fillWithJuice() {
        return new JuiceBottle();
    }

    public class JuiceBottle implements DrinkBottle {

        @Override
        public void typeOfDrink() {
                System.out.println("This is a Juice Bottle");
        }
    }
}
