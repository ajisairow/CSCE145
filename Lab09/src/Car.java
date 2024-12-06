//Ronan Param
// Vehicle class
class Vehicle {
    private String manufacturerName;
    private int cylinders;
    private String ownersName;

    public Vehicle(String manufacturerName, int cylinders, String ownersName) {
        this.manufacturerName = manufacturerName;
        this.cylinders = cylinders;
        this.ownersName = ownersName;
    }

    //Getters and setters for the manufacturer name and number of cylinders

    @Override
    public String toString() {
        return " Manufacturer's name: " + manufacturerName +
               " \n Number of Cylinders: " + cylinders +
               " \n Owner's name: " + ownersName;
    }
}

// Car class extends Vehicle
class Car extends Vehicle {
    private double gasMileage;
    private int numberOfPassengers;

    public Car(String manufacturerName, int cylinders, String ownersName, double gasMileage, int numberOfPassengers) {
        super(manufacturerName, cylinders, ownersName);
        this.gasMileage = gasMileage;
        this.numberOfPassengers = numberOfPassengers;
    }


    @Override
    public String toString() {
        return super.toString() +
               " \n Gas Mileage: " + gasMileage +
               " \n Passengers: " + numberOfPassengers;
    }
}
