

public interface Queue<E> {   
	public boolean isEmpty();
	public E getFrontEelement();
	public E getRearEelement();	
	public void put(E theObject);
	public E remove(); 
}
