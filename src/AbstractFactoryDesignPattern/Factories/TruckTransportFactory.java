package AbstractFactoryDesignPattern.Factories;

import AbstractFactoryDesignPattern.Services.Service;
import AbstractFactoryDesignPattern.Services.TruckRelatedService;
import AbstractFactoryDesignPattern.Transports.Transport;
import AbstractFactoryDesignPattern.Transports.TruckTransport;

public class TruckTransportFactory extends TransportFactory {

    @Override
    public Transport makeTransport() {
        return new TruckTransport();
    }

    @Override
    public Service makeService() {
        return new TruckRelatedService();
    }




}
