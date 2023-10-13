import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JUnitAssertsTest {
    @Test
    public void AssertMethodstest() {
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        int var1 = 1;
        int var2 = 1;
        int var3 = 5;
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        assertEquals(obj1, obj2);
        assertSame(obj3, obj4);
        assertNotSame(obj2, obj4);
        assertNotNull(obj1);
        assertTrue(var1 == var2);
        assertFalse(var1 == var3);
        assertArrayEquals(a1, a2);
    }

}
