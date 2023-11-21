
import org.junit.jupiter.api.Test;
import se.distansakademin.Developer;
import se.distansakademin.Employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeveloperTests {

    @Test
    public void testGetSound(){
        var developer = new Developer("linus", "java");

        var expected = "Woop woop!";
        var actual = developer.getSound();

        assertEquals(expected, actual);
    }
}
