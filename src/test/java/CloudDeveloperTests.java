import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.distansakademin.employees.CloudDeveloper;
import se.distansakademin.Website;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CloudDeveloperTests {

    CloudDeveloper cloudDeveloper;

    @BeforeEach
    public void init(){
        cloudDeveloper = new CloudDeveloper("linus", "java");
    }

    @Test
    public void testFixWebsite(){
        var website = new Website(false); // false means website is not working
        cloudDeveloper.fixWebsite(website);

        var expected = true;
        var actual = website.isWorking();

        assertEquals(expected, actual);
    }
}
