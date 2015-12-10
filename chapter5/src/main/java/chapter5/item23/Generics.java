package chapter5.item23;

import java.util.ArrayList;
import java.util.Collection;

class Generics {

    public static void main(String args[]) {
        Collection<?> collectionOfSomeType = new ArrayList();

        //Does not compile
        //collectionOfSomeType.add("some_value");

        collectionOfSomeType.add(null);
    }
}
