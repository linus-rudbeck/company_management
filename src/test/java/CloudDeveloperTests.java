import org.junit.jupiter.api.Test;
import se.distansakademin.CloudDeveloper;
import se.distansakademin.Website;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CloudDeveloperTests {
    @Test
    public void testFixWebsite(){
        var cloudDeveloper = new CloudDeveloper("linus", "java");
        var website = new Website(false); // false means website is not working
        cloudDeveloper.fixWebsite(website);

        var expected = true;
        var actual = website.isWorking();

        assertEquals(expected, actual);
    }
}
