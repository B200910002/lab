

import java.util.*;

public class MyQueue implements Queue{
	private Object[] elements;
	private int firstIndex;
//	private int lastIndex;
	private int size;
	
	public MyQueue(int initialized_size){
		if(initialized_size < 1)
			throw new IllegalArgumentException("Ð­Ñ…Ð»Ò¯Ò¯Ð»Ñ�Ñ… Ð±Ð°Ð³Ñ‚Ð°Ð°Ð¼Ð¶ 1-Ñ�Ñ�Ñ� Ð·Ð°Ð°Ð²Ð°Ð» Ð¸Ñ… Ð±Ð°Ð¹Ñ… Ñ‘Ñ�Ñ‚Ð¾Ð¹!!!");
		elements = new Object[initialized_size];
		this.size = -1;
//		this.lastIndex = size - firstIndex;
	}
	
	public MyQueue() {
		this(100);
	}
	
	@Override
	public boolean isEmpty() {
		return size == -1;
	}

	@Override
	public Object getFrontEelement() {
		if(!isEmpty()) 
			return this.elements[firstIndex];
		return null;
	}

	@Override
	public Object getRearEelement() {
		if(!isEmpty())
			return this.elements[size];
		return null;
	}

	@Override
	public void put(Object theObject) {
		elements[++size] = theObject;
	}

	@Override
	public Object remove() {
		Object result = elements[firstIndex];
		if(!isEmpty()) {
			elements[firstIndex] = null;
			firstIndex++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue q = new MyQueue();
		q.put(new Integer(4));
		q.put(new Integer(6));
		q.put(new Integer(9));
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}
}
