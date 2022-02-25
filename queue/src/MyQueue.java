

import java.util.*;

public class MyQueue implements Queue{
	private Object[] elements;
	private int firstIndex;
//	private int lastIndex;
	private int size;
	
	public MyQueue(int initialized_size){
		if(initialized_size < 1)
			throw new IllegalArgumentException("failed.Cause your input is valid!!!");
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
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MyQueue mainQueue = new MyQueue();
//		System.out.println("");
//		MyQueue mainQueue = new MyQueue(sc.nextInt());
		System.out.println("=====>>>>> Daraalal <<<<<<=====");
		System.out.println("=>uildliig ajilluulhiin tuld uildluudiin urdah dugaariig oruulna uu?");
		System.out.println("1.isEmpty() \n2.getFrontEelement()\n3.getRearEelement()\n4.put\n5.remove");
		int command = sc.nextInt();
		while(true) {
			switch(command) {
			case 1:
				System.out.println(mainQueue.isEmpty());
				break;
			case 2:
				System.out.println(mainQueue.getFrontEelement());
			case 3:
				System.out.println(mainQueue.getRearEelement());
			case 4:
				
//				System.out.println(mainQueue.put());
			}
		}
		
	}
}
