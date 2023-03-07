package AbstractFactoryDesignPattern;

public class PlaneTransportFactory extends TransportFactory {



    @Override
    public Transport makeTransport() {
        return new PlaneTransport();
    }

    @Override
    public Service makeService() {
        return new PlaneRelatedService();
    }


    public static class PlaneTransport implements Transport {

        @Override
            public void typeOfTransport() {
                System.out.println("This is a Plane");
            }
    }

    public static class PlaneRelatedService implements Service {

        @Override
        public void typeOfService() {
            System.out.println("This is a Service for Planes");
        }
    }
}
