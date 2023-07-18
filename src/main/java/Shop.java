import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Vehicle> stock;
    private int till;
    private int price;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 0;
    }

    public int getTill() {
        return this.till;
    }
    public void addToTill(int newTill) {
        this.till = newTill;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vehicle> getStock() {
        return this.stock;
    }
    public void addToStock(Vehicle newVehicle){
        this.stock.add(newVehicle);
    }

    public void removeFromStock(Vehicle removeVehicle){
        this.stock.remove(removeVehicle);
    }

    public int getPrice(Vehicle newVehicle){
        return newVehicle.getPrice();
    }


}
