import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestHelicopter {

    Helicopter helicopter;

    @BeforeEach
    public void setUp(){
        helicopter = new Helicopter();
    }

    @Test
    public void canGetPrice(){
        assertThat(helicopter.getPrice()).isEqualTo(7000);
    }


}
