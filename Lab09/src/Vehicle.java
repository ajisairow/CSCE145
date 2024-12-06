class Vehicle {
    private String manufacturerName;
    private int cylinders;
    private String ownersName;

    public Vehicle(String manufacturerName, int cylinders, String ownersName) {
        this.manufacturerName = manufacturerName;
        this.cylinders = cylinders;
        this.ownersName = ownersName;
    }

  
    @Override
    public String toString() {
        return "Vehicle Manufacturer's name: " + manufacturerName +
         "\n Cylinders: " + cylinders +
         "\n Owner: " + ownersName;
    }
}
