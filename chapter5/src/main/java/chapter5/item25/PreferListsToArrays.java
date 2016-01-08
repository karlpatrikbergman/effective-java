package chapter5.item25;

import java.util.Arrays;
import java.util.List;

/**
 * covariant
 * Aadjective, Mathematics (of one magnitude with respect to another) varying in accordance with a fixed mathematical
 * relationship:
 * The area of a square is covariant with the length of a side.
 *
 * deficieant = undermålig
 *
 * reified = förtingligad
 */

class PreferListsToArrays {

    class Figure {}
    class Circle extends Figure {}

    /*******************************************************************************************************************
     * Arrays differ from generic types in two important ways. First, arrays are covariant.
     * This scary-sounding word means simply that:
     *
     * If Circle is a subtype of Figure then array type Cirle[] is a subtype of Figure[]
     */
    void arraysAreCovariant() {
        Circle[] circles = {new Circle(), new Circle()};
        //Compiles since Circles[] is a subtype to Figure[] = arrays are Covariant
        draw(circles);
    }
    void draw(Figure[] figures) {}


    /*******************************************************************************************************************
     * Generics, by contrast, are invariant:
     * for any two distinct types Type1 and Type2,List<Type1> is neither a subtype nor a supertype of List<Type2>
     */
    void genericsAreInvariant() {
        List<Circle> circles = Arrays.asList(new Circle(), new Circle());
        //Does not compile since List<Circle> is not a subtype of List<Figure>
        //draw(circles);

        List<Figure> figures= Arrays.asList(new Circle(), new Circle());
        draw(figures);
    }
    void draw(List<Figure> figures) {}


    /*******************************************************************************************************************
     * Either way you can’t put a String into a Integer container, but with an array you find out that you’ve made a
     * mistake at runtime
     * With a list, you find out at compile time. Of course you’d rather find out at compile time.
     */
    void arraysAreDeficiantComparedToLists() {
        Object[] circles = new Circle[2];
        circles[0] = "I don't fit in"; //Throws ArrayStoreException at runtime

        //Not allowed, won't compile, discovered at compile time
        //List<Object> objectList = new ArrayList<Circle>();
        //objectList.add("I don't fit in");
    }

    /*******************************************************************************************************************
     * Arrays are reified:
     * This means that arrays know and enforce their element types at runtime
     *
     * Generics are implemented by erasure:
     * This means that they enforce their type constraints only at compile time and discard (or erase) their element
     * type information at runtime.
     * Erasure is what allows generic types to interoperate freely with legacy code that does not use generics
     */

}
