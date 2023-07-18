import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestHatchback {

    Hatchback hatchback;

    @BeforeEach
    public void setUp(){
        hatchback = new Hatchback();
    }

    @Test
    public void canGetPrice(){
        assertThat(hatchback.getPrice()).isEqualTo(500);
    }

    @Test
    public void canSetPrice(){
        hatchback.setPrice(600);
        assertThat(hatchback.getPrice()).isEqualTo(600);
    }
}
