package AbstractFactoryDesignPattern.Services;

public class ShipRelatedService implements Service {

    @Override
    public void typeOfService() {
        System.out.println("This is a Service for Ships");
    }
}