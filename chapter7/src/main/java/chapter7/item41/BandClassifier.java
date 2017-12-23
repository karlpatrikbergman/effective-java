package chapter7.item41;

/**
 * Because the classify method is overloaded, and the choice of which overloading to invoke
 * is made at compile time.
 *
 * For all three iterations of the loop, the compile-time type of the parameter is the same: Band.
 * The runtime type is different in each iteration, but this does not affect the choice of
 * overloading.
 *
 * Because the compile-time type of the parameter is Band, the only applicable overloading is
 * the third one, classify(Band), and this overloading is invoked in each iteration of the loop.
 *
 * The behavior of this program is counter intuitive because selection among overloaded methods is static,
 * while selection among overridden methods is dynamic.
 */

/**
 * A bunch of overloaded methods.
 */
enum  BandClassifier {
    INSTANCE;

    String classify(RockBand b) {
        return "RockBand";
    }

    String classify(JazzBand jazzBand) {
        return "JazzBand";
    }

    String classify(DiscoBand discoBand) {
        return "DiscoBand";
    }

    String classify(Band band) {
        return "Unknown band type";
    }

    String classifyUsingOvverride(Band band) {
        return band.getType();
    }
}