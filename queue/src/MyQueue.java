//imjak

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
		
		try {
			while(true) {
				System.out.println("1.isEmpty() \n2.getFrontEelement()\n3.getRearEelement()\n4.put\n5.remove");

				int command = sc.nextInt();
//				System.out.println("command-iin ur dun: ");
				//
				switch(command) {
					case 1:
						if(mainQueue.isEmpty())
							System.out.println("ene daraalal hooson baina!\n");
						else
							System.out.println("ene daraalal hooson bish baina!\n");
						break;
					case 2:
						if(!mainQueue.isEmpty())
							System.out.println("Ene daraalaliin ehnii element = " + mainQueue.getFrontEelement()+"\n");
						System.out.println("element alga bn!!");
						break;
					case 3:
						System.out.println("Ene daraalaliin suuliin element = " + mainQueue.getRearEelement()+ "\n");
						break;
					case 4:
						System.out.println("elementee oruulna uu?");
						Object input = new String(sc.next());
						mainQueue.put(input);
						
						break;
					case 5:
						System.out.println(mainQueue.remove());
						break;
					default:
						System.out.println("is valid command!");
						break;
				}
			}
		}catch(Exception ex) {System.out.println("system-d ymar negen aldaa garlaa!!");;}
		
		
	}
}
