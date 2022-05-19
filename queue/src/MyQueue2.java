//imjak

import java.util.*;
import com.google.java.contract.*;	

@Invariant("size != 0 && lastIndex != null")
public class MyQueue2<E> implements InterfaceQueue<E>{
	private Node<E> firstNode;
	private int size = 0;
	
	public MyQueue2(int initialized_size){
		if(initialized_size < 1)
			throw new IllegalArgumentException("failed.Cause your input is valid!!!");
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
			return firstNode.element;
		return null;
	}

	@Override
	public E getRearEelement() {
		Node<E> currentNode = firstNode;
		if(!isEmpty())
			for (int i = 0; i < this.size-1; i++)
				currentNode = currentNode.next;
		return currentNode.element;
	}

	@Override
	public void put(E theObject) {
		if (this.isEmpty())
	         firstNode = new Node<E>(theObject, firstNode);
		else {
			Node<E> p = firstNode;
			for (int i = 0; i < size-1; i++)
	            p = p.next;
	         p.next = new Node<E>(theObject, p.next);
		}
		size++;
	}

	@Override
	public E remove() {
		if(!this.isEmpty()) {
			E removedElement;
	        removedElement = firstNode.element;
	        firstNode = firstNode.next;
	        size--;
	        return removedElement;
		}
		return null;
	}
	
	public String toString() {
		StringBuilder r = new StringBuilder();
        r.append('[');
		if(this.isEmpty())
			return "[]";
		Node<E> p = firstNode;
		for(int i=0;i<size;i++) {
			r.append(p.element);
			p = p.next;
			if(i == this.size-1)
				return r.append("]").toString();
			r.append(",").append(" ");
		}	
		return r.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MyQueue<String> mainQueue = new MyQueue<String>();
//		MyQueue2<Integer> mainQueue = new MyQueue2<Integer>();
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
						String input = new String(sc.next());
//						Integer input = new Integer(sc.next());
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
						System.out.println(mainQueue.toString()+"\n");
						break;
					case 7:
						System.exit(0);
					default:
						System.out.println("is valid command!\n");
						break;
				}
			}
		}
//		catch(Exception ex) {System.out.println("system-d ymar negen aldaa garlaa!!");main(args);}
		catch(IllegalArgumentException ex) {System.out.println("turuliin aldaa garsan tul system dahin ajillaa!");main(args);}
	}
}