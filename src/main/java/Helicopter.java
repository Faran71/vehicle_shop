public class Helicopter extends Vehicle{

    private int flightRange;
    private int price;

    public Helicopter(){
        this.price = 7000;
        this.flightRange = 400;
    }

    public String typeOfTravel(){
        return "This is air-travel";
    }

    public int getPrice() {
        return this.price;
    }
    public void setPrice(int newPrice){
        this.price = newPrice;
    }

    public int getFlightRange() {
        return this.flightRange;
    }

}
