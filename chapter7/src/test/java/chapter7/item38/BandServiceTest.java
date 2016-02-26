package chapter7.item38;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BandServiceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private Band band;
    private BandService bandService;

    @Before
    public void setup() {
        bandService = new BandService();
    }

    /**
     * Public methods should have proper checks and throw
     * exceptions of something goes wrong
     */
    @Test
    public void getBandName() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("Band cannot be null");
        bandService.getBandName(null);
    }

    /**
     * Internal methods should use assertions instead
     */
    @Test
    public void getNumberOfYearsActive() {
        thrown.expect(AssertionError.class);
        band = Band.builder()
                .name("Accept")
                .numberOfYearsActive(-1)
                .build();
        bandService.getBandNumberOfYearsActive(band);
    }
}
