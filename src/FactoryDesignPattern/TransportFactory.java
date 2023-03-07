package FactoryDesignPattern;



public abstract class TransportFactory {

    public static Transport createTransport(String transportType) {

        return switch (transportType.toLowerCase()) {
            case "ship" -> new ShipTransport();
            case "plane" -> new PlaneTransport();
            case "truck" -> new TruckTransport();
            default -> {
                System.out.println("We don't have " + transportType.concat(" Transport!\n So we sent you a TruckTransport instead as our default option!"));
                yield new TruckTransport();
            }
        };
    }

    public abstract void typeOfDrink();
}
