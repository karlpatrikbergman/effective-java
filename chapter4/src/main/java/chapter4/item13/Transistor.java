package chapter4.item13;

import lombok.Builder;
import lombok.Value;

import java.util.stream.IntStream;

@Builder()
@Value
class Transistor {
    final int factor;
    final Current current;

    void amplify() {
        IntStream.rangeClosed(1, factor)
                .forEach(i -> current.increment());
    }

    void attenuate() {
        IntStream.rangeClosed(1, factor)
                .forEach(i -> current.decrement());
    }

    int getCurrentValue() {
        return current.value();
    }
}
