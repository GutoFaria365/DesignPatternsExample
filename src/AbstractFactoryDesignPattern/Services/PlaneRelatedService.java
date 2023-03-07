package AbstractFactoryDesignPattern.Services;

public  class PlaneRelatedService implements Service {

    @Override
    public void typeOfService() {
        System.out.println("This is a Service for Planes");
    }
}