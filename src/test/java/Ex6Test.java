import org.example.Ex6;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex6Test {

    static Ex6 ex6;

    @BeforeAll
    public static void setUp(){
        ex6 = new Ex6();
    }

    @Test
    public void digitSumTest(){
        int expectedValue = 6;
        int actualValue = ex6.digitSum(1212);

        assertEquals(expectedValue,actualValue,"Digit Sum test failed");
    }
}
