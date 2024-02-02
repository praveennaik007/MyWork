package Mini_Proj;

import java.util.Iterator;
import java.util.Objects;

public abstract class AbstractCollectionDemo<E> implements CollectionDemo<E> {

	public abstract int size();

	public abstract Iterator<E> iterator();

	@Override
	public boolean add(E e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(CollectionDemo<? extends E> c) {
		boolean modified = false;
		for (E e : c)
			if (add(e))
				modified = true;
		return modified;
	}

	@Override
	public boolean remove(Object o) {
		Iterator<E> it = iterator();
		if (o == null) {
			while (it.hasNext()) {
				if (it.next() == null) {
					it.remove();
					return true;
				}
			}
		} else {
			while (it.hasNext()) {
				if (o.equals(it.next())) {
					it.remove();
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean removeAll(CollectionDemo<?> c) {
		Objects.requireNonNull(c);
		boolean modified = false;
		Iterator<?> it = iterator();
		while (it.hasNext()) {
			if (c.contains(it.next())) {
				it.remove();
				modified = true;
			}
		}
		return modified;
	}

	@Override
	public void clear() {
		Iterator<E> it = iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
	}

	@Override
	public boolean contains(Object o) {
		 Iterator<E> it = iterator();
	        if (o==null) {
	            while (it.hasNext())
	                if (it.next()==null)
	                    return true;
	        } else {
	            while (it.hasNext())
	                if (o.equals(it.next()))
	                    return true;
	        }
	        return false;
	}

	@Override
	public boolean containsAll(CollectionDemo<?> c) {
		for (Object e : c)
			if (!contains(e))
				return false;
		return true;
	}

	@Override
	public boolean isEmpty(Object o) {

		return size() == 0;
	}

	@Override
	public boolean retainAll(CollectionDemo<?> c) {
		Objects.requireNonNull(c);
		boolean modified = false;
		Iterator<E> it = iterator();
		while (it.hasNext()) {
			if (!c.contains(it.next())) {
				it.remove();
				modified = true;
			}
		}
		return modified;
	}

}
