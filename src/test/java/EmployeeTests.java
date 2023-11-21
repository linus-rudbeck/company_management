import org.junit.jupiter.api.Test;
import se.distansakademin.Employee;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTests {

    @Test
    public void testConstructorSetName(){
        var employee = new Employee("linus");

        var expected = "Linus";
        var actual = employee.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetSound(){
        var employee = new Employee("linus");

        var expected = "Aaow!";
        var actual = employee.getSound();

        assertEquals(expected, actual);
    }
}
