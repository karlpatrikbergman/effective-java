package chapter4.item13;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Only the class Radio, which has access level public, is accessible from outside the package.
 * Transistor and Current classes have access level package-private, and are therefore not accessible
 * outside their package.
 */
public class RadioTest {

    //Transistor is not accessible
    //Transistor transistor;

    //Current is not accessible
    //Current current;

    Radio radio;
    final int TRANSISTOR_FACTOR = 5;

    @Before
    public void setup() {
        radio = Radio.of(TRANSISTOR_FACTOR);
    }

    @Test
    public void radioCanBeTurnedOn() {
        radio.turnOn();
        assertTrue(radio.isTurnedOn());
    }

    @Test
    public void radioCanBeTurnedOff() {
        radio.turnOff();
        assertFalse(radio.isTurnedOn());
    }

    @Test
    public void increaseVolume() {
        radio.increaseVolume();
        assertEquals(TRANSISTOR_FACTOR, radio.getVolume());
    }

    @Test
    public void decreaseVolume() {
        radio.decreaseVolume();
        assertEquals(-1*TRANSISTOR_FACTOR, radio.getVolume());
    }
}
