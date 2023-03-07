package FactoryDesignPattern;

public class ShipTransportFactory extends TransportFactory {



    @Override
    public Transport makeTransport() {
        return new ShipTransport();
    }

    public static class ShipTransport implements Transport {

        @Override
        public void typeOfTransport() {
                System.out.println("This is a Ship");
        }
    }
}
