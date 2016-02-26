package chapter4.item13.defensivecopies;

import lombok.Builder;
import lombok.Value;

import java.util.Collections;
import java.util.List;

@Value
@Builder
class Band {
    List<Member> members;

    /**
     * Returns a defensive copy of members.
     * Trying to modify the returned list won't give compile error though, but UnsupportedOperationException at
     * runtime.
     */
    List<Member> getMembers() {
        return Collections.unmodifiableList(members);
    }
}
