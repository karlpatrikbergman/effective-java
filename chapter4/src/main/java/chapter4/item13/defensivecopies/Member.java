package chapter4.item13.defensivecopies;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
class Member {
    int age;
    String firstName;
    String lastName;
}
