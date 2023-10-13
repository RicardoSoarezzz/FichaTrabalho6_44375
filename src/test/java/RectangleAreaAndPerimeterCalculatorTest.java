import org.example.RectangleAreaAndPerimeterCalculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleAreaAndPerimeterCalculatorTest {

    static RectangleAreaAndPerimeterCalculator rectang;


    @BeforeAll
    static void setUp() {
        rectang = new RectangleAreaAndPerimeterCalculator();
    }

    @Test
    public void areaAndPerimeterTest1(){
        int expectedAreaValue = 15;
        int expectedPerimeterValue = 16;
        int base = 3;
        int height = 5;

        int actualArea = rectang.area(base,height);
        assertEquals(expectedAreaValue,actualArea,"Area test failed");
        int actualPerimeter = rectang.perimeter(base,height);
        assertEquals(expectedPerimeterValue,actualPerimeter,"Perimeter test failed");

    }

    @Test
    public void areaAndPerimeterTest2(){
        int expectedAreaValue = 40;
        int expectedPerimeterValue = 26;
        int base = 5;
        int height = 8;

        int actualArea = rectang.area(base,height);
        assertEquals(expectedAreaValue,actualArea,"Area test failed");
        int actualPerimeter = rectang.perimeter(base,height);
        assertEquals(expectedPerimeterValue,actualPerimeter,"Perimeter test failed");

    }

    @Test
    public void areaAndPerimeterTest3(){
        int expectedAreaValue = 8;
        int expectedPerimeterValue = 12;
        int base = 2;
        int height = 4;

        int actualArea = rectang.area(base,height);
        assertEquals(expectedAreaValue,actualArea,"Area test failed");
        int actualPerimeter = rectang.perimeter(base,height);
        assertEquals(expectedPerimeterValue,actualPerimeter,"Perimeter test failed");

    }

    @Test
    public void isTriangleTest(){
        boolean is = rectang.isTriangle(2,2,1);
        assertTrue(is);
    }
}
