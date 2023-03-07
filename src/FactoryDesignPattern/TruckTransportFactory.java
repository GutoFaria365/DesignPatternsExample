package FactoryDesignPattern;
public class TruckTransportFactory extends TransportFactory {

    @Override
    public Transport makeTransport() {
        return new TruckTransport();
    }

    public static class TruckTransport implements Transport {

        @Override
        public void typeOfTransport() {
                System.out.println("This is a Truck");
        }
    }
}
