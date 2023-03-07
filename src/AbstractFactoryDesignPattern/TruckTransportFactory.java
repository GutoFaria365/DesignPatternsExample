package AbstractFactoryDesignPattern;
public class TruckTransportFactory extends TransportFactory {

    @Override
    public Transport makeTransport() {
        return new TruckTransport();
    }

    @Override
    public Service makeService() {
        return new TruckRelatedService();
    }

    public static class TruckTransport implements Transport {

        @Override
        public void typeOfTransport() {
                System.out.println("This is a Truck");
        }
    }

    public static class TruckRelatedService implements Service {

        @Override
        public void typeOfService() {
            System.out.println("This is a Service for Trucks");
        }
    }
}
