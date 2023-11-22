
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.distansakademin.employees.Developer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeveloperTests {

    Developer developer;

    @BeforeEach
    public void init(){
        developer = new Developer("linus", "java");
    }

    @Test
    public void testGetSound(){
        var expected = "Woop woop!";
        var actual = developer.getSound();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetProgrammingLanguage(){
        var expected = "java";
        var actual = developer.getProgrammingLanguage();

        assertEquals(expected, actual);
    }

    @Test
    public void testProgram(){
        var expected = "Linus writes some java";
        var actual = developer.program();

        assertEquals(expected, actual);
    }
}
