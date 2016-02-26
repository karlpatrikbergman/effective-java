package chapter4.item13;

import java.util.concurrent.atomic.AtomicInteger;

class Current {
    private final AtomicInteger c = new AtomicInteger(0);

    private Current() { }

    void increment() {
        c.incrementAndGet();
    }

    void decrement() {
        c.decrementAndGet();
    }

    int value() {
        return c.get();
    }

    static Current of() {
        return new Current();
    }
}
