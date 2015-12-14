package chapter4.item17.broken;

/**
 * You might expect this program to print out rockFactor 10 twice, but it prints out 0 the first time,
 * because the overrideMe method is invoked by the Band (super class) constructor before the RockBand
 * (sub class) constructor has a chance to set the rockFactor field.
 */


class RockBand extends Band {
    final int rockFactor;

    RockBand(int rockFactor) {
        this.rockFactor = rockFactor;
    }

    @Override
    void printRockFactor() {
        System.out.printf("In %s, rockFactor: %s%n", RockBand.class.getSimpleName(), rockFactor);
    }

    public static void main(String args[]) {
        RockBand rockBand = new RockBand(10);
        rockBand.printRockFactor();

    }
}
