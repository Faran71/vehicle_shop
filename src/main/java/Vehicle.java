public abstract class Vehicle {

    private int price;
    private int maximumOccupancy;

    public Vehicle(){}

    public abstract String typeOfTravel();
    public abstract int getPrice();
    public abstract int getMaximumOccupancy();
}
