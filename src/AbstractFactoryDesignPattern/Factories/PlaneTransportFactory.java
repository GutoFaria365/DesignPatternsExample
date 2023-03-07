package AbstractFactoryDesignPattern.Factories;

import AbstractFactoryDesignPattern.Services.PlaneRelatedService;
import AbstractFactoryDesignPattern.Services.Service;
import AbstractFactoryDesignPattern.Transports.PlaneTransport;
import AbstractFactoryDesignPattern.Transports.Transport;

public class PlaneTransportFactory extends TransportFactory {

    @Override
    public Transport makeTransport() {
        return new PlaneTransport();
    }

    @Override
    public Service makeService() {
        return new PlaneRelatedService();
    }

}
