import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FunctionTest {
    @Test
    public void testHighestNumber() {
        int biggest = Functions.highest(120,30,20);
        assertEquals(120,biggest);


    }
}