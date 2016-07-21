package ro.erni.java.training.broken.inheritance;

import java.util.HashSet;


/**
 *Broken - Innapropriate use of inheritance!
 *
 */
@SuppressWarnings({ "serial", "rawtypes" })
public class InstrumentedHashSet<E> extends HashSet {

    //The number of attemted element insertions
    private int addCount=0;
    public InstrumentedHashSet() {

    }

    public InstrumentedHashSet(int initCap, float loadFactor)
    {
        super(initCap,loadFactor);
    }

    @SuppressWarnings("unchecked")
	@Override
    public boolean add(Object e) {
        addCount++;
        return super.add(e);
    }

    //    @Override
    //    public boolean add(E e) {
    //        addCount++;
    //        return super.add(e);
    //    }


    //    @Override
    //    public boolean addAll(Collection<? extends E> c) {
    //        addCount += c.size();
    //        return super.addAll(c);
    //    }

    public int getAddCount() {
        return addCount;
    }

}
