package chapter5.item23;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
class DontUseRawTypesInNewCode {

    /**
     * Set<E> is a generic class
     * E is the type parameter
     * Generic classes and interfaces are collectively known as generic types
     *
     * Set<String> is a parameterized type representing a set whose elements are of type String.
     * Set<Object> is a parameterized type representing a set that can contain objects of any type
     * Set<?> is a wildcard type representing a set that can contain only objects of some unknown type,
     * Set is a raw type, which opts out of the generic type system. DON'T USE!
     *
     * In Set<String> "String" is the actual type parameter corresponding to the formal type parameter E
     *
     * Each generic type defines a raw type, which is the name of the generic type used without any accompanying
     * actual type parameters
     */

    public static void main(String args[]) {
        //This is dangerous.
        // You can put any element into a collection with a raw type, easily corrupting the collection’s type invariant
        Set set1 = new HashSet<>();
        set1.add(1);
        Set set2 = new HashSet<>();
        set2.add("A String");
        Set commonItems = rawGetCommonItems(set1, set2);
        System.out.println(commonItems.size());

        //You can’t put any element (other than null) into a Set<?>.
        // Attempting to do so will generate a compile-time error
        Set<?> wildcardSet = new HashSet<>();
        //Does not compile
        //wildcardSet.add("Rob Halford");
        //Since the you do not know what type the Set is typed to, you can only read from the collection,
        // and you can only treat the objects read as being Object instances

        Set<String> stringSet1 = new HashSet<>();
        stringSet1.add("Rob Halford");
        Set<String> stringSet2 = new HashSet<>();
        stringSet2.add("Rob Halford");
        Set<?> commonItemsInStringSets = wildcardGetCommonItems(stringSet1, stringSet2);
        System.out.println(commonItemsInStringSets.size());

    }

    /**
     * Don't do this
     */
    private static Set rawGetCommonItems(Set set1, Set set2) {
        Set commonMembers = new HashSet<>();
        set1.stream().filter(set2::contains).forEach(commonMembers::add);
        return commonMembers;
    }

    /**
     * Do this instead
     */
    private static Set<?> wildcardGetCommonItems(Set<?> set1, Set<?> set2) {
        return set1.stream().filter(set2::contains).collect(Collectors.toSet());
    }

}
