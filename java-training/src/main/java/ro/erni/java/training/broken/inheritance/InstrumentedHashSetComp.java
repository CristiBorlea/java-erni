package ro.erni.java.training.broken.inheritance;

import java.util.Collection;
import java.util.Set;


/**
 * Wrapper class - uses composition in place of inheritage.
 *
 */
public class InstrumentedHashSetComp<E> extends ForwardingSet {

    //The number of attemted element insertions
    private int addCount=0;
	public InstrumentedHashSetComp(Set<E> e) {
		super(e);
    }

	public InstrumentedHashSetComp() {
		super();
	}
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

    @Override
    public boolean addAll(Collection c) {
        addCount += c.size();
        return super.addAll(c);
    }

    //    @Override
    //    public boolean addAll(Collection<? extends E> c) {
    //        addCount += c.size();
    //        return super.addAll(c);
    //    }

    public int getAddCount() {
        return addCount;
    }

}
