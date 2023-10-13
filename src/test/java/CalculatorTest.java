import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void sumTest(){
        Calculator calculator = new Calculator();
        int expectedValue = 4;
        int actual = calculator.sum(2,2);
        assertEquals(expectedValue,actual,"Sum test failed");
    }
}
