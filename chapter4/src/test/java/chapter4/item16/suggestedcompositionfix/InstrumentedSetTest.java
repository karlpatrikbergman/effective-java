package chapter4.item16.suggestedcompositionfix;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("unchecked")
public class InstrumentedSetTest {

    @Test
    public void getAddCount() {
        InstrumentedSet<String> s = new InstrumentedSet(new HashSet<String>());
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        assertEquals(3, s.getAddCount());
    }
}
