package chapter5.item25;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class PreferListsToArrays {

    /**
     * If Circle is a subtype of Figure then array type Cirle[] is a subtype of Figure[]
     */
    class Figure {};
    class Circle extends Figure {};


    int arraysAreCovariant(Figure[] figures) {
        return figures.length;
    }

    int genericsAreInVariant(List<Figure> figureList) {
        return figureList.size();
    }

    void  runVariantInvariantExmamples(String args []) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle[] circles = {circle1, circle2};

        //Compiles since Circles[] is a subtype to Figure[] = arrays are Covariant
        arraysAreCovariant(circles);

        List<Circle> circleList = Stream.of(circle1, circle2).collect(Collectors.toList());;
        //Does not compile
        //genericsAreNot(circleList);
    }

    /**
     * Either way you can’t put a String into a Long container, but with an array you find out that you’ve made a
     * mistake at runtime; with a list, you find out at compile time. Of course you’d rather find out at compile time.
     */
    void runArraysAreDeficiant() {
        Object[] circles = new Circle[2];
        circles[0] = "I don't fit in"; //Throws ArrayStoreException

        //Won't compile
        //List<Object> objectList = new ArrayList<Circle>();
        //objectList.add("I don't fit in");

    }

}
