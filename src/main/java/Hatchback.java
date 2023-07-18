public class Hatchback extends Car{

    int price;
    boolean windowTint;

    public Hatchback(){
        this.price = 500;
        this.windowTint = false;
    }

    public boolean getWindowTint(){
        return this.windowTint;
    }
    public void addWindowTint(){
        this.windowTint = true;
    }

    public int getPrice() {
        return this.price;
    }
    public void setPrice(int newPrice){
        this.price = newPrice;
    }
}
