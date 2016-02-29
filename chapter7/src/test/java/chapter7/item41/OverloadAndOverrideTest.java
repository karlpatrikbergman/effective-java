package chapter7.item41;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;

public class OverloadAndOverrideTest {

    ImmutableList<Band> bands;
    BandClassifier bandClassifier = BandClassifier.INSTANCE;

    @Before
    public void setup() {
        bands = new ImmutableList.Builder<Band>()
                .add(new RockBand())
                .add(new JazzBand())
                .add(new DiscoBand())
                .build();
    }

    @Test
    public void tryOverLoadedMethods() {
        bands.stream()
                .map(bandClassifier::classify)
                .forEach(System.out::println);
    }

    /**
     * If an instance method is overridden in a subclass and this method is invoked on an instance of the subclass, the
     * subclass’s overriding method executes, regardless of the compile-time type of the subclass instance.
     */
    @Test
    public void tryOverridenMethods() {
        bands.stream()
                .map(Band::getType)
                .forEach(System.out::println);
    }
}
