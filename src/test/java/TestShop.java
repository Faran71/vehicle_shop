import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestShop {

    Shop shop;

    @BeforeEach
    public void setUp(){
        this.shop = new Shop("Motors");
    }

    @Test
    public void checkStockSize(){
        assertThat(shop.getStock().size()).isEqualTo(0);
    }

    @Test
    public void checkPricesOfAddedStock(){
        Vehicle helicopterOne = new Helicopter();
        Vehicle carOne = new Convertible();
        Vehicle carTwo = new Hatchback();
        shop.addToStock(helicopterOne);
        shop.addToStock(carOne);
        shop.addToStock(carTwo);
        assertThat(shop.getPrice(helicopterOne)).isEqualTo(7000);
        assertThat(shop.getPrice(carOne)).isEqualTo(600);
    }

    @Test
    public void makeSale(){
//        add to stock
        Vehicle helicopterOne = new Helicopter();
        Vehicle carOne = new Convertible();
        Vehicle carTwo = new Hatchback();
        shop.addToStock(helicopterOne);
        shop.addToStock(carOne);
        shop.addToStock(carTwo);
//        Test whether you can buy a helicopter
        shop.removeFromStock(helicopterOne);
        int vehiclePrice = shop.getPrice(helicopterOne);
        shop.addToTill(vehiclePrice);
        assertThat(shop.getStock().size()).isEqualTo(2);
        assertThat(shop.getTill()).isEqualTo(7000);
    }

    @Test
    public void canGetTypeOfTravel(){
        Vehicle carOne = new Convertible();
        assertThat(carOne.typeOfTravel()).isEqualTo("This is ground-travel");
    }

    @Test
    public void canGetMaximumOccupancy(){
        Vehicle carOne = new Convertible();
        assertThat(carOne.getMaximumOccupancy()).isEqualTo(5);
    }
}
