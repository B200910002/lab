//imjak

import java.util.*;

public class MyQueue implements Queue{
	private Object[] elements;
	private int firstIndex = 0;
	private int lastIndex = -1;
	private int size;
	
	public MyQueue(int initialized_size){
		if(initialized_size < 1)
			throw new IllegalArgumentException("failed.Cause your input is valid!!!");
		elements = new Object[initialized_size];
		this.size = 0;
	}
	
	public MyQueue() {
		this(100);
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
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
			return this.elements[lastIndex];
		return null;
	}

	@Override
	public void put(Object theObject) {
		elements[++lastIndex] = theObject;
		size++;
	}

	@Override
	public Object remove() {
		Object result = elements[firstIndex];
		if(!isEmpty()) {
			elements[firstIndex] = null;
			firstIndex++;
			size--;
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
						else
							System.out.println("element alga bn!!\n");
						break;
					case 3:
						if(!mainQueue.isEmpty())
							System.out.println("Ene daraalaliin suuliin element = " + mainQueue.getRearEelement()+ "\n");
						else
							System.out.println("element alga bn!!\n");
						break;
					case 4:
						System.out.println("elementee oruulna uu?");
						Object input = new String(sc.next());
						mainQueue.put(input);
//						if(mainQueue.getFrontEelement().equals(input))
							System.out.println("daraalald '"+input+"' elementiig amjilttai nemlee\n");
//						else
//							System.out.println("daraalald nemj chadsangui!");
						break;
					case 5:
						System.out.println("daraallaas '"+mainQueue.remove()+"' element ustgagdlaa!"+"\n");
						break;
					default:
						System.out.println("is valid command!");
						break;
				}
			}
		}catch(Exception ex) {System.out.println("system-d ymar negen aldaa garlaa!!");main(args);}
		
		
	}
}
