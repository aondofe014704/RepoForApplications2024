import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public  void testCarModel() {
        Car benz = new Car();
        Car corrolla = new Car();
        benz.setModel("GLK 500");
        corrolla.setModel("Corrolla XL");
        assertEquals("GLK 500",benz.getModel());
        assertEquals("Corrolla XL",corrolla.getModel());
    }


}