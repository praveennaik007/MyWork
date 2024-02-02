package Mini_Proj;

public interface CollectionDemo<E> extends Iterable<E>{
	boolean add(E e);

	boolean addAll(CollectionDemo<? extends E> c);

	boolean remove(Object o);

	boolean removeAll(CollectionDemo<?> c);

	void clear();

	int size();

	boolean contains(Object o);

	boolean containsAll(CollectionDemo<?> c);

	boolean isEmpty(Object o);

	boolean retainAll(CollectionDemo<?> c);

	int hashCode();

}
