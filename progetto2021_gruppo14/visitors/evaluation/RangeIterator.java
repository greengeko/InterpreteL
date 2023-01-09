package progetto2021_gruppo14.visitors.evaluation;

import java.util.Iterator;
import java.util.NoSuchElementException;

class RangeIterator implements Iterator<Integer> {

	private int next;
	private final int end;

	RangeIterator(int start, int end) {
		this.next = start;
		this.end = end;
	}

	@Override
	public boolean hasNext() {
		return next != end;
	}

	@Override
	public Integer next() {
		if (!hasNext())
			throw new NoSuchElementException();
		return next < end ? next++ : next--;
	}

}