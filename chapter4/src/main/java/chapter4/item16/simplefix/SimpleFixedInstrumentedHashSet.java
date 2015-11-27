package chapter4.item16.simplefix;

// Broken - Inappropriate use of inheritance!

import java.util.Collection;
import java.util.HashSet;

class SimpleFixedInstrumentedHashSet<E> extends HashSet<E> {
    private int addCount = 0;

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);}

    /**
     *  Page 82:
     *  We could “fix” the subclass by eliminating its override of the addAll method.While the resulting class
     *  would work, it would depend for its proper function onthe fact that HashSet’s addAll method is implemented
     *  on top of its add method.This “self-use” is an implementation detail, not guaranteed to hold in all
     *  implementations of the Java platform and subject to change from release to release.
     *  Therefore, the resulting InstrumentedHashSet class would be fragile.
     */
    public boolean addAll(Collection<? extends E> c) {
//        addCount += c.size();
        return super.addAll(c);}

    public int getAddCount() {
        return addCount;
    }
}
