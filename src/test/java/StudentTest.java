import org.example.Student;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student fer;
    private Student ryan;
    @BeforeAll
    public static void onceExecutedBeforeAll() {
        System.out.println("Test Student Class");
    }
    @BeforeEach
    public void setup() {
        fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
    }
    @DisplayName("Check data in Student object")
    @Test
    public void testCreateStudent() {
        assertNull(ryan);
        assertNotNull(fer);
    }
    @Disabled
    @Test
    public void testStudentFields() {
        assertSame(1L, fer.getId());
        assertSame("fer", fer.getName());
        assertSame(2, fer.getGrades().size());
    }
    @Test
    public void testAddGrade() {
        assertSame(100, fer.getGrades().get(0));
        assertSame(80, fer.getGrades().get(1));
    }
    @Test
    public void testAverageGrade() {
        assertEquals(90, fer.getGradeAverage(), 0);
    }
}