package AbstractFactoryDesignPattern;



public abstract class DrinkBottleFactory {

    public static DrinkBottle createDrinkBottle(String drinkType) {
        if (drinkType.equalsIgnoreCase("whisky")) {
            return new WhiskyBottle();
        }
        if (drinkType.equalsIgnoreCase("juice")) {
           return new JuiceBottle();
        }
        if (drinkType.equalsIgnoreCase("wine")) {
           return new WineBottle();
        }
        else {
            System.out.println("We can't create " +drinkType.concat(" Bottles!"));
            return new EmptyBottle();
        }
    }

    public abstract void typeOfDrink();
}
