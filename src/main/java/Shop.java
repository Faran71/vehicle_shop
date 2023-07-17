import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Vehicle> stock;
    private int till;

    public Shop(String name){
        this.name = name;
        stock = new ArrayList<>();
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

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
    public void addToStock(Vehicle newVehicle){
        stock.add(newVehicle);
    }
}
