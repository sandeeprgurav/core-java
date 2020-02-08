package com.collections;


import java.util.AbstractList;
import java.util.Arrays;

public class ArrayList<T> extends AbstractList<T> implements java.io.Serializable {

	private static final long serialVersionUID = 868345258112289223L;
	
	transient private Object[] objectStore; //transient not to serialize property so that it will not be stored in persist object.
	private int size = 0;
	private static final Object[] EMPTY_ELEMENTDATA = {};
	
	public ArrayList(){
		super();
		objectStore = EMPTY_ELEMENTDATA;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index){		
		if(index > size || index < 0){
			throw new ArrayIndexOutOfBoundsException();			
		} else {			
			return (T) objectStore[index];
		}
	}
	
	public boolean add(T obj){	
		increaseArraySize();
		objectStore[size++] = obj;
		return true;
		
	}
	
	@SuppressWarnings("unchecked")
	public T remove(int index) {
		if(index < size){
			Object obj = objectStore[index];
			objectStore[index] = null;
			int tmp = index;
			while(tmp < size-1){
				objectStore[tmp] = objectStore[tmp+1];
				objectStore[tmp+1] = null;
				tmp++;
			}			
			decreaseArraySize();
			return (T) obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	
	public int size(){
		return size;
	}
	
	private void increaseArraySize(){
		objectStore = Arrays.copyOf(objectStore, size+1);
	}
	
	private void decreaseArraySize(){
		size = size-1;
		objectStore = Arrays.copyOf(objectStore, size);
	}

	@Override
	public String toString() {
		return "CustomArrayList [objectStore=" + Arrays.toString(objectStore) + ", size=" + size + ", size()=" + size()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
		
}
