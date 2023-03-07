package AbstractFactoryDesignPattern;

public abstract class TransportFactory {

    public Transport createTransport() {
            Transport transport = makeTransport();
            transport.typeOfTransport();
            return transport;
    }

    public Service createService() {
        Service service =  makeService();
        service.typeOfService();
        return service;
    }




    public abstract Transport makeTransport();
    public abstract Service makeService();

}



