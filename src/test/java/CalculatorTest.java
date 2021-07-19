import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
//
    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(11, calculator.add(5,6));
    }

    @Test
    public void subtract(){
        assertEquals(8, calculator.subtract(17,9));
    }

    @Test
    public void multiply(){
        assertEquals(25, calculator.multiply(5,5));
    }

    @Test
    public void divide(){
        assertEquals(12, calculator.divide(24,2), 0.01);
    }
}
