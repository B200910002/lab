import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue2<Integer> q = new MyQueue2<Integer>(10000000);
//		Stack<Integer> q = new Stack<Integer>();
//		Queue<Integer> q = new LinkedList<Integer>();
//		LinkedList<Integer> q = new LinkedList<Integer>();
		
		int count = 0;
		while(count <= 100) {
			q.put(count);
			count++;
			System.out.println(q.toString());
		}
		int count2 =0;
		while(count2 < 100) {
			q.remove();
			count2++;
			System.out.println(q.toString());
		}
		
	}

}
