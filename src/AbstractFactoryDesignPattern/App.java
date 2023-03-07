package AbstractFactoryDesignPattern;



public class App {

        /*With the factory design pattern we allow a client to choose what kind
          of Bottle we should create for him, unless we don’t create that kind
          of Drink on us(DrinkBottle subclass implemented)
        */

        public static void main(String[] args) {

                DrinkBottle myWater = DrinkBottleFactory.createDrinkBottle("water");
                DrinkBottle myWhisky = DrinkBottleFactory.createDrinkBottle("whisky");
                DrinkBottle myJuice = DrinkBottleFactory.createDrinkBottle("juice");
                DrinkBottle myWine = DrinkBottleFactory.createDrinkBottle("wine");

                DrinkBottle mywine2 = new WineBottle();

                myWater.typeOfDrink();
                System.out.println("-".repeat(42));
                myWhisky.typeOfDrink();
                myJuice.typeOfDrink();
                myWine.typeOfDrink();
        }





}
