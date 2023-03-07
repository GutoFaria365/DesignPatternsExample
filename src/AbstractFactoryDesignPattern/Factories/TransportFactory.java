package AbstractFactoryDesignPattern.Factories;

import AbstractFactoryDesignPattern.Services.Service;
import AbstractFactoryDesignPattern.Transports.Transport;

public abstract class TransportFactory {

    public abstract Transport makeTransport();
    public abstract Service makeService();

}



