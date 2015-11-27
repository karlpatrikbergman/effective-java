package chapter4.item16.broken;

import org.junit.Test;

import java.util.Arrays;

public class BrokenInstrumentedHashSetTest {

    /**
     * We expect getAddCount() to return 3, but it returns 6!
     * The reason for this is that HashSets addAll() is implemented on top of it's add()
     *
     * The addAll method in InstrumentedHash-Set added three to addCount and then invoked HashSet’s addAll
     * implementationusing super.addAll. This in turn invoked the add method, as overridden inInstrumentedHashSet,
     * once for each element. Each of these three invocationsadded one more to addCount, for a total increase of six:
     * each element added withtheaddAll method is double-counted.
     */
    @Test
    public void proofOfBrokenImplementation() {
        BrokenInstrumentedHashSet<String> s = new BrokenInstrumentedHashSet<String>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println(s.getAddCount());
    }
}
