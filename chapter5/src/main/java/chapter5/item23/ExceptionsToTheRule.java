package chapter5.item23;

import java.util.List;
import java.util.Set;

/**
 * Class Literal Example
 * Class<String> c = String.class
 *
 * To understand that, you have to understand that:
 *      String is an instance (object) of the class Class.
 *      A string literal (e.g. "I am a string.") is a notation which represents an instance (object) of the class String
 *      Whereas a class literal (e.g. Hashtable.class) is a notation which represents an instance of the class Class.

 */
class ExceptionsToTheRule {

    static void main(String args[]) {
        // Exception 1:
        // You must use raw types in class literals.
        Class<List> ListClassLiteral = List.class;
        Class<String[]> StringArrayClassLiteral = String[].class;
        Class<Integer> IntegerClassLiteral = int.class;

        //Not allowed
        //Class<List<String>> foo = List<String>.class;
    }

    // Exception 2:
    static void instanceOperatorAndGenericTypes(Object o) {
        if(o instanceof Set) {
            Set<?> m = (Set<?>) o;
            //Note that once you’ve determined that o is a Set, you must cast it to the
            // wildcardtype Set<?>, not the raw type Set.
            // This is a checked cast, so it will not cause acompiler warning.
        }

    }
}
