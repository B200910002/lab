//imjak

import java.util.*;

public class MyQueue2<E> implements InterfaceQueue<E>{
	private Node<E> firstNode;
//	private int firstIndex = 0;
	private int size = 0;
//	private int lastIndex = size - 1;
	//
	public MyQueue2(int initialized_size){
		if(initialized_size < 1)
			throw new IllegalArgumentException("failed.Cause your input is valid!!!");
		this.size = 0;
	}
	
	public MyQueue2() {
		this(100);
	}
	
	public int size() {
		return this.size;
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public E getFrontEelement() {
		if(!isEmpty()) 
			return null;
		return null;
	}

	@Override
	public E getRearEelement() {
		if(!isEmpty())
			return null;
		return null;
	}

	@Override
	public void put(E theObject) {
		size++;
	}

	@Override
	public E remove() {
		E result = elements;
		if(!isEmpty()) {
			elements[firstIndex] = null;
			firstIndex++;
			size--;
		}
		return result;
	}
	
	public String toString() {
		StringBuilder r = new StringBuilder();
        r.append('[');
		if(this.isEmpty())
			return "[]";
		for(int i=this.firstIndex;i<this.lastIndex+1;i++) {
			r.append(this.elements[i]);
			if(i == this.lastIndex)
				return r.append("]").toString();
			r.append(",").append(" ");
		}	
		return r.toString();
	}
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		MyQueue<String> mainQueue = new MyQueue<String>();
		MyQueue<Integer> mainQueue = new MyQueue<Integer>();
//		MyQueue<Double> mainQueue = new MyQueue<Double>();
//		MyQueue<Float> mainQueue = new MyQueue<Float>();
		System.out.println("=====>>>>> Daraalal <<<<<<=====");
		System.out.println("=>uildliig ajilluulhiin tuld uildluudiin urdah dugaariig oruulna uu?");
		try {
			while(true) {
				System.out.println("1.isEmpty() \n2.getFrontEelement()\n3.getRearEelement()\n4.put\n5.remove\n6.toString\n7.exit");
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
//						String input = new String(sc.next());
						Integer input = new Integer(sc.next());
//						Double input = new Double(sc.next());
//						Float input = new Float(sc.next());
						mainQueue.put(input);
						System.out.println("daraalald '"+input+"' elementiig amjilttai nemlee\n");
						break;
					case 5:
						if(mainQueue.isEmpty())
							System.out.println("hooson daraallaas ustgah bolomjgui!");
						else
							System.out.println("daraallaas '"+mainQueue.remove()+"' element ustgagdlaa!"+"\n");
						break;
					case 6:
						if(!mainQueue.isEmpty())
							System.out.println(mainQueue.toString());
						break;
					case 7:
						System.exit(0);
					default:
						System.out.println("is valid command!");
						break;
				}
			}
		}catch(Exception ex) {System.out.println("system-d ymar negen aldaa garlaa!!");main(args);}
		
		
	}
}