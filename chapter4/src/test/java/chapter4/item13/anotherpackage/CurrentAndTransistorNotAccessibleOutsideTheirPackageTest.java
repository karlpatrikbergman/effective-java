package chapter4.item13.anotherpackage;

import chapter4.item13.Radio;

/**
 * Only the class Radio, which has access level public, is accessible from outside the package.
 * Transistor and Current classes have access level package-private, and are therefore not accessible
 * outside their package. Therefore Transistor and Current is "encapsulated" and hidden from classes using Radio.
 */
public class CurrentAndTransistorNotAccessibleOutsideTheirPackageTest {

    //Transistor is not accessible
    //Transistor transistor;

    //Current is not accessible
    //Current current;

    //Radio is accessible
    Radio radio = Radio.of(5);
}
