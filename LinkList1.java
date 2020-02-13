package collection1;

import java.util.*;

public class LinkList1 
{
public static void main(String[] args) 
{
	//to append the specified element to the end of a linked list.
	LinkedList<String> l=new LinkedList<String>();
	l.add("one");
	l.add("two");
	System.out.println("before appending"+l);
	System.out.println(l);
	l.add("three");
	System.out.println("after appending"+l);
	
	// to iterate through all elements in a linked list.
	for(String i:l)
	{
		System.out.println(i);
	}
	
	// to iterate through all elements in a linked list starting at the specified position.
	Iterator<String> i=l.listIterator(2);
	while(i.hasNext())
	{
		System.out.println("starting from 2 pos \n"+i.next());
	}
	
	//to iterate a linked list in reverse order.
	Iterator<String> j=l.descendingIterator();
    System.out.println("reverse order");
	while(j.hasNext())
	{
		System.out.println(j.next());
	}
	
	//to insert the specified element at the specified position in the linked list.
	l.add(2, "2222");
	System.out.println("after inserting in pos 2"+l);
	
	//to insert the specified element at the front of a linked list.
	l.addFirst("111");
	l.offerFirst("ooo");
	System.out.println("after inserting ele in front pos"+l);
	
	//to insert the specified element at the end of a linked list.
	l.offerLast("last");
	System.out.println("after inserting ele in end pos"+l);
	
	//to display the elements and their positions in a linked list.
     for(int k=0; k<l.size(); k++)
     {
    	System.out.println( "element at pos "+k+" is "+l.get(k)); 
     }
     
    // to remove first and last element from a linked list.
     l.removeFirst();
 	System.out.println("after removing first ele"+l);
 	
 	// to join two linked lists.
 	LinkedList<String> l2=new LinkedList<String>();
 	l2.add("new1");
 	l2.add("new2");
 	LinkedList<String> l3=new LinkedList<String>();
 	l3.addAll(l);
 	l3.addAll(l2);
 	System.out.println("after join l1 and l2"+l3);
 	
 	//to clone an linked list to another linked list.
 	LinkedList<String> l4= (LinkedList<String>)l3.clone();
 	System.out.println("after clonning"+l4);
 	
 	// to remove and return the first element of a linked list.
 	System.out.println("remove first element of array and return "+l3.removeFirst());//popfirst pop
 	
 	//to retrieve but does not remove, the first element of a linked list.
 	System.out.println("retreive first ele with out deleting it "+l3.peek());//get
 	
 	//to check if a particular element exists in a linked list.
 	System.out.println("element exist in list "+l3.contains("last"));
 	
 	//to convert a linked list to array list.
 	List<String> list = new ArrayList<String>(l3);
 	      System.out.println(list);
 	 
 	
}
}
