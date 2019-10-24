import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DRootExampleTest {
    @Test
    public void tests() {
        assertEquals("Nope!", 7, DRootExample.digitalRoot(16));
        assertEquals("Nope!", 6, DRootExample.digitalRoot(456));
    }
}
