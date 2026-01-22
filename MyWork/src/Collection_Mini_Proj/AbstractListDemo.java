package Collection_Mini_Proj;

import java.util.Iterator;

public class AbstractListDemo<E> extends AbstractCollectionDemo<E> implements ListDemo<E> {

	@Override
	public void add(int index, E Element) {
		throw new UnsupportedOperationException();
	}

	

	@Override
	public E remove(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void set(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean addAll(int index, CollectionDemo<? extends E> c) {
//		rangeCheckForAdd(index);
        boolean modified = false;
        for (E e : c) {
            add(index++, e);
            modified = true;
        }
        return modified;
	}

	
	
}
