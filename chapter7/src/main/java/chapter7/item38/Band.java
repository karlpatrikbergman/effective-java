package chapter7.item38;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
class Band {
    String name;
    int numberOfYearsActive;
}
