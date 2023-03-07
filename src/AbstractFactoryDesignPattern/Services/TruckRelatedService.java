package AbstractFactoryDesignPattern.Services;

public  class TruckRelatedService implements Service {

    @Override
    public void typeOfService() {
        System.out.println("This is a Service for Trucks");
    }
}