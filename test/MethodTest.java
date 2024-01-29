import allMethods.Methods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodTest {
    @Test
    public void testMethodAdd(){
        Methods myCalculator = new Methods();
        myCalculator.setAddition(10,30);
        assertEquals(40,myCalculator.getAddition());
    }
    @Test
    public void testMethodAddForNegativeValue(){
        Methods myCalculator = new Methods();
        myCalculator.setAddition(-10,30);
        assertEquals(20,myCalculator.getAddition());
    }
    @Test
    public void testMethodSubtraction(){
        Methods myCalculator = new Methods();
        myCalculator.setSubtraction(100,30);
        assertEquals(70,myCalculator.getSubtraction());
    }
    @Test
    public void testMethodMultiplication(){
        Methods myCalculator = new Methods();
        myCalculator.setMultiplication(5,5);
        assertEquals(25,myCalculator.getMultiplication());
    }
    @Test
    public void testMethodDivision(){
        Methods myCalculator = new Methods();
        myCalculator.setDivision(100, 20);
        assertEquals(5,myCalculator.getDivision());
    }
}





