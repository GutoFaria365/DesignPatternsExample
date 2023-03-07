package AbstractFactoryDesignPattern.Factories;

import AbstractFactoryDesignPattern.Services.Service;
import AbstractFactoryDesignPattern.Services.ShipRelatedService;
import AbstractFactoryDesignPattern.Transports.ShipTransport;
import AbstractFactoryDesignPattern.Transports.Transport;

public class ShipTransportFactory extends TransportFactory {



    @Override
    public Transport makeTransport() {
        return new ShipTransport();
    }

    @Override
    public Service makeService() {
        return new ShipRelatedService();
    }




}
