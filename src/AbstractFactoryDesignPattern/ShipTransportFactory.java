package AbstractFactoryDesignPattern;

public class ShipTransportFactory extends TransportFactory {



    @Override
    public Transport makeTransport() {
        return new ShipTransport();
    }

    @Override
    public Service makeService() {
        return new ShipRelatedService();
    }

    public static class ShipTransport implements Transport {

        @Override
        public void typeOfTransport() {
                System.out.println("This is a Ship");
        }
    }

    public static class ShipRelatedService implements Service {

        @Override
        public void typeOfService() {
            System.out.println("This is a Service for Ships");
        }
    }
}
