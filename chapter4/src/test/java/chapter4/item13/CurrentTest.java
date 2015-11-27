package chapter4.item13;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Current is available for test since it has access level package-private
 */
public class CurrentTest {
    Current current;

    @Before
    public void setup() {
        current = Current.of();
    }

    @Test
    public void increment() {
        current.increment();
        assertEquals(1, current.value());
    }

    @Test
    public void decrement() {
        current.decrement();
        assertEquals(-1, current.value());
    }
}
