package FactoryDesignPattern;



public class App {

        /*With the factory design pattern we allow a client to choose what kind
          of Bottle we should create for him, unless we don’t create that kind
          of Drink on us(DrinkBottle subclass implemented)
        */

        public static void main(String[] args) {

                Transport myBike = TransportFactory.createTransport("bike");
                Transport myPlane = TransportFactory.createTransport("plane");
                Transport myShip = TransportFactory.createTransport("ship");
                Transport myTruck = TransportFactory.createTransport("truck");



                System.out.println("-".repeat(42));
                myPlane.typeOfTransport();
                myShip.typeOfTransport();
                myTruck.typeOfTransport();
                myBike.typeOfTransport();
        }





}
