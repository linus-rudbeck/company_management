
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

    @Test
    public void testGetProgrammingLanguage(){
        var developer = new Developer("linus", "java");

        var expected = "java";
        var actual = developer.getProgrammingLanguage();

        assertEquals(expected, actual);
    }
}
