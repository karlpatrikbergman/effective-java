package chapter4.item13;

import java.util.concurrent.atomic.AtomicBoolean;

public class Radio {

    private final Transistor transistor;
    private AtomicBoolean isOn;

    private Radio(int transistorFactor) {
        transistor = Transistor.builder()
                .current(Current.of())
                .factor(transistorFactor)
                .build();
        isOn = new AtomicBoolean();
    }

    public void turnOn() {
        boolean expectedValue = false;
        boolean newValue      = true;
        isOn.compareAndSet(expectedValue, newValue);
    }

    public void turnOff() {
        boolean expectedValue = true;
        boolean newValue      = false;
        isOn.compareAndSet(expectedValue, newValue);
    }

    public boolean isTurnedOn() {
        return isOn.get();
    }

    public void increaseVolume() {
        transistor.amplify();
    }

    public void decreaseVolume() {
        transistor.attenuate();
    }

    public int getVolume() {
        return transistor.getCurrent().value();
    }

    public static Radio of(int transistorFactor) {
        return new Radio(transistorFactor);
    }
}
