package FactoryDesignPattern;

public class PlaneTransportFactory extends TransportFactory {



    @Override
    public Transport makeTransport() {
        return new PlaneTransport();
    }


    public static class PlaneTransport implements Transport {

        @Override
            public void typeOfTransport() {
                System.out.println("This is a Plane");
            }
    }
}
