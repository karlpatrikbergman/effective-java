package chapter5.item25;

import java.util.ArrayList;
import java.util.List;

class JenkovExamples {
    class A {
        String getValue() {
            return "Jabadabadoo";
        }
    }
    class B extends A { }
    class C extends A { }

    final List<A> listOfA = new ArrayList();
    final List<B> listOfB = new ArrayList();
    final List<C> listOfC = new ArrayList();

//    List<?>           list1 = new ArrayList<A>();
//    List<? extends A> list2 = new ArrayList<A>();
//    List<? super   A> list3 = new ArrayList<A>();

    /******************************************************************************************************************
     * The Unknown Wildcard
     * List<?> means a list typed to an unknown type. This could be a List<A>, a List<B>, a List<String> etc.
     *
     * Since the you do not know what type the List is typed to, you can only read from the collection, and you can
     * only treat the objects read as being Object instances.
     */
    void unknownWildcard() {
        processElementsUknownWildcard(listOfA);
        processElementsUknownWildcard(listOfB);
        processElementsUknownWildcard(listOfC);
    }
    void processElementsUknownWildcard(List<?> elements){
        elements.forEach(System.out::println);
        //Won't compile
        //elements.forEach(item -> System.out.println(item.getValue()));
    }


    /******************************************************************************************************************
     * Extends Wildcard boundry
     */
    void extendsWildcard() {
        processElementsExtendsWildcard(listOfA);
        processElementsExtendsWildcard(listOfB);
        processElementsExtendsWildcard(listOfC);
    }
    public void processElementsExtendsWildcard(List<? extends A> elements){
        elements.forEach(System.out::println);
        //Does compile!
        elements.forEach(item -> System.out.println(item.getValue()));
    }

}
