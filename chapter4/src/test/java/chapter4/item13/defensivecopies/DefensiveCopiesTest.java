package chapter4.item13.defensivecopies;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertNotNull;

public class DefensiveCopiesTest {

    private final Band band = Band.builder()
            .members(Collections.singletonList(
                    Member.builder()
                            .age(25)
                            .firstName("Ian")
                            .lastName("Gillan")
                            .build()))
            .build();

    /**
     * Band.getMembers() returns a defensive copy of members.
     * Trying to modify the returned list won't give compile error though, but UnsupportedOperationException at
     * runtime.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void addMemberShouldThrowUnsupportedOperationException() {
        Member newMember = Member.builder()
                .age(30)
                .firstName("John")
                .lastName("Lennon")
                .build();
        band.getMembers().add(newMember);
    }

    @Test
    public void getMemberFirstInListShouldReturnMember() {
        Member member = band.getMembers().get(0);
        assertNotNull(member);
    }
}
