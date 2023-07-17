import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Vehicle> vehicles;
    private int till;

    public Shop(String name){
        this.name = name;
        vehicles = new ArrayList<>();
        this.till = 0;
    }
}
