package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.Factories.PlaneTransportFactory;
import AbstractFactoryDesignPattern.Factories.ShipTransportFactory;
import AbstractFactoryDesignPattern.Factories.TruckTransportFactory;
import AbstractFactoryDesignPattern.Services.PlaneRelatedService;
import AbstractFactoryDesignPattern.Services.Service;
import AbstractFactoryDesignPattern.Services.ShipRelatedService;
import AbstractFactoryDesignPattern.Transports.Transport;
import AbstractFactoryDesignPattern.Transports.TruckTransport;

public class App {

    /*With the factory design pattern we allow a client to choose what kind
      of Bottle we should create for him, unless we don’t create that kind
      of Drink on us(DrinkBottle subclass implemented)
    */
    public static void main(String[] args) {

        Service shipService = new ShipRelatedService();

        Transport truckTransport = new TruckTransport();

        Service planeService = new PlaneRelatedService();

        shipService.typeOfService();
        truckTransport.typeOfTransport();
        planeService.typeOfService();

    }
}
