import org.junit.jupiter.api.Test;
import se.distansakademin.Office;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OfficeTests {

    @Test
    public void testGetMonthlyRent(){
        var office = new Office(14);

        var expected = 3908.33;
        var actual = office.getMonthlyRent();

        assertEquals(expected, actual);
    }

}
