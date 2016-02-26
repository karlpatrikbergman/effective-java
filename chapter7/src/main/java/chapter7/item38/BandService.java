package chapter7.item38;

import com.google.common.base.Preconditions;

class BandService {

    /**
     * Public methods should have proper checks and throw exceptions of something goes wrong
     *
     * @param band
     * @return Band name
     * @throws NullPointerException
     */
    String getBandName(Band band) {
        Preconditions.checkNotNull(band, "Band cannot be null");
        return band.getName();
    }


    /**
     * Internal methods should use assertions instead (Pretend this method is only used internally)
     *
     * "In essence, these assertions are claims that the asserted condition will be true, regardless of how the
     * enclosing package is used by its clients."
     */
    int getBandNumberOfYearsActive(Band band) {
        assert band.getNumberOfYearsActive() > 0;
        return band.getNumberOfYearsActive();
    }
}
