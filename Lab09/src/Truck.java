//Ronan Param
class Truck extends Vehicle {
    private double loadCapacity;
    private double towingCapacity;
//These are the getters and setters that include the specific properties for load capacity and towing capacity!
    public Truck(String manufacturerName, int cylinders, String ownersName, double loadCapacity, double towingCapacity) {
        super(manufacturerName, cylinders, ownersName);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
        
       
    }

   

    @Override
    public String toString() {
        return super.toString() +
               
               "\n Towing Capacity: " + towingCapacity +
        	   "\n Truck Load Capacity: " + loadCapacity;
    }
}