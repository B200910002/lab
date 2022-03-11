//imjak
//
import java.util.*;
//hfhgh
public class MyQueue<E> implements InterfaceQueue<E>{
	private E[] elements;
	private int firstIndex = 0;
	private int size = 0;
	private int lastIndex = size - 1;
	//
	public MyQueue(int initialized_size){
		if(initialized_size < 1)
			throw new IllegalArgumentException("failed.Cause your input is valid!!!");
		elements = (E[]) new Object[initialized_size];
		this.size = 0;
		//
	}
	
	public MyQueue() {
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
			return this.elements[firstIndex];
		return null;
	}

	@Override
	public E getRearEelement() {
		if(!isEmpty())
			return this.elements[lastIndex];
		return null;
	}

	@Override
	public void put(E theObject) {
		elements[++lastIndex] = theObject;
		size++;
	}

	@Override
	public E remove() {
		E result = elements[firstIndex];
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
		System.out.println("1.String\n2.Integer\3.Double\n4.Float");
		String type = sc.nextLine();
//		if(type == "")
			MyQueue<String> mainQueue = new MyQueue<String>();
//		else if(type.equals("Integer"))
			MyQueue<Integer> mainQueue = new MyQueue<Integer>();
//		else if(type.equals("String"))
			MyQueue<Double> mainQueue = new MyQueue<Double>();
//		else if(type.equals("String"))
			MyQueue<Float> mainQueue = new MyQueue<Float>();
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
