package chapter4.item13;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Transistor is available for test since it has access level package-private
 */
public class TransistorTest {
    private Transistor transistor;
    private final int TRANSISTOR_FACTOR = 5;

    @Before
    public void setup() {
        transistor = Transistor.builder()
                .current(Current.of())
                .factor(TRANSISTOR_FACTOR)
                .build();
    }

    @Test
    public void amplify() {
        transistor.amplify();
        assertEquals(TRANSISTOR_FACTOR, transistor.getCurrentValue());
    }

    @Test
    public void attenuate() {
        transistor.attenuate();
        assertEquals(-1*TRANSISTOR_FACTOR, transistor.getCurrentValue());
    }

}
