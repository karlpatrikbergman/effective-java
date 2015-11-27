package chapter4.item16.broken;

// Broken - Inappropriate use of inheritance!

import java.util.Collection;
import java.util.HashSet;

class BrokenInstrumentedHashSet<E> extends HashSet<E> {
    private int addCount = 0;

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);}

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);}

    public int getAddCount() {
        return addCount;
    }
}
