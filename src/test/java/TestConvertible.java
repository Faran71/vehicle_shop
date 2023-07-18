import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestConvertible {

    Convertible convertible;

    @BeforeEach
    public void setUp(){
        convertible = new Convertible();
    }

    @Test
    public void canGetPrice(){
        assertThat(convertible.getPrice()).isEqualTo(600);
    }

    @Test
    public void canSetPrice(){
        convertible.setPrice(750);
        assertThat(convertible.getPrice()).isEqualTo(750);
    }
}
