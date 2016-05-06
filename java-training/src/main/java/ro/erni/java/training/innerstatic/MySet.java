package ro.erni.java.training.innerstatic;

import java.util.AbstractSet;
import java.util.Iterator;

/**
 * 
 * @author cara
 *
 *
 */
public class MySet<E> extends AbstractSet<E> {

	private int size;

	@Override
	public Iterator<E> iterator() {
		return new MyIterator();
	}

	private class MyIterator implements Iterator<E> {

		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public E next() {
			return null;
		}
	}

	@Override
	public int size() {
		return this.size;
	}

}
