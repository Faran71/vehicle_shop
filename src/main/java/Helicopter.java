public class Helicopter extends Vehicle{

    private int flightRange;
    private int price;
    private int maximumOccupancy;

    public Helicopter(){
        this.price = 7000;
        this.flightRange = 400;
        this.maximumOccupancy = 2;
    }

    public String typeOfTravel(){
        return "This is air-travel";
    }
    public String typeOfTravel(String nameOfJourney){return nameOfJourney+" is air-travel";}

    public int getPrice() {
        return this.price;
    }
    public void setPrice(int newPrice){
        this.price = newPrice;
    }

    public int getFlightRange() {
        return this.flightRange;
    }

    public int getMaximumOccupancy() {
        return this.maximumOccupancy;
    }
}
