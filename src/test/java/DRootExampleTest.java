import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DRootExampleTest {
    @Test
    public void Tests() {
        assertEquals( "Nope!" , 7, DRootExample.digital_root(16));
        assertEquals( "Nope!" , 6, DRootExample.digital_root(456));
    }
}
