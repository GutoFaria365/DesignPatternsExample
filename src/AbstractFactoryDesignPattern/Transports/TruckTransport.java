package AbstractFactoryDesignPattern.Transports;

public  class TruckTransport implements Transport {

    @Override
    public void typeOfTransport() {
        System.out.println("This is a Truck for transport");
    }
}