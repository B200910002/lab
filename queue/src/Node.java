
public class Node<E>
{
   E element;
   Node<E> next;

   Node() {}
     
   Node(E element)
      {this.element = element;}

   Node(E element, Node<E> next)
      {this.element = element;
       this.next = next;}
}
