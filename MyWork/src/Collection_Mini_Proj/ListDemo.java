package Collection_Mini_Proj;

public interface ListDemo<E> extends CollectionDemo<E> {

	boolean add(E e);

	void add(int index, E Element);

	boolean addAll(int index, CollectionDemo<? extends E> o);

	E remove(int index);

	void set(Object o);

}
