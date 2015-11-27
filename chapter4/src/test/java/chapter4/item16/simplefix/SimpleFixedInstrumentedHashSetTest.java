package chapter4.item16.simplefix;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SimpleFixedInstrumentedHashSetTest {

    @Test
    public void getAddCount() {
        SimpleFixedInstrumentedHashSet<String> s = new SimpleFixedInstrumentedHashSet<String>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
       assertEquals(3, s.getAddCount());
    }
}
