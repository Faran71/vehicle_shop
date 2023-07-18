public abstract class Car extends Vehicle{

    private int numberOfWheels;

    public Car(){
        this.numberOfWheels = 4;
    }

    public String typeOfTravel(){
        return "This is ground-travel";
    }



}
