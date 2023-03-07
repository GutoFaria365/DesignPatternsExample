package FactoryDesignPattern;

public abstract class TransportFactory {

    public Transport createTransport() {
            Transport transport = makeTransport();
            transport.typeOfTransport();
            return transport;
    }


    public abstract Transport makeTransport();

}



