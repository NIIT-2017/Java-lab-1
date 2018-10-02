import org.junit.Test;

import static org.junit.Assert.*;

public class KollatzTest extends Kollatz{

    @Test
    public void kollatzTest() {
        long correctResult = 525;
        assertEquals(counter(), correctResult);
    }
}