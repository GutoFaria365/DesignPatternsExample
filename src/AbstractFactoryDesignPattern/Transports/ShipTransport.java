package AbstractFactoryDesignPattern.Transports;

public class ShipTransport implements Transport {

    @Override
    public void typeOfTransport() {
        System.out.println("This is a Ship for Transport");
    }
}