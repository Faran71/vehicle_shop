public abstract class Car extends Vehicle{

    private int maximumOccupancy;
    public Car(){
        this.maximumOccupancy = 5;
    }

    public String typeOfTravel(){
        return "This is ground-travel";
    }
    public int getMaximumOccupancy(){
        return this.maximumOccupancy;
    }
}
