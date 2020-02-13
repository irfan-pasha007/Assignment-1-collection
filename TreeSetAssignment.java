package collection1;

import java.util.*;

public class TreeSetAssignment
{
public static void main(String[] args) 
{
	//to create a new tree set, add some random numbers (Integer) and print out the tree set.
	TreeSet<Integer> treeset=new TreeSet<Integer>();
	treeset.add(7);
	treeset.add(6);
	treeset.add(14);
	System.out.println(treeset);
	
	 //to iterate through all elements in a tree set.
	for(int i:treeset)
	{
		System.out.println(i);
	}
	
	 // to add all the elements of a specified tree set to another tree set.
	TreeSet<Integer> treeset1=new TreeSet<Integer>();
	treeset1.add(1);
	treeset1.add(98);
	treeset1.add(10);
	treeset.addAll(treeset1);
	System.out.println(treeset);
	
	// to create a reverse order view of the elements contained in a given tree set.
	Iterator<Integer> it = treeset.descendingIterator();
    System.out.println("Elements in Reverse Order ");
    while (it.hasNext())
    {
       System.out.println(it.next());
    }
    
    // to get the first and last elements in a tree set.
    System.out.println("first element is "+treeset.first()+" and last element is "+treeset.last());
    
    //to get the number of elements in a tree set.
    System.out.println("number of element is "+treeset.size());
    
    //to find the numbers less than 7 in a tree set.
    Iterator<Integer> itr=treeset.iterator();
    System.out.println("numbers less than 7 are ");
    while(itr.hasNext())
    {
    	Integer i=itr.next();
    	if(i<7)
    	{
    		System.out.println(i);
    	}
    }
    
   // to get the element in a tree set which is greater than or equal to the given element.
    System.out.println("element greater than or equal to 96 is "+treeset.ceiling(96));
    
    //to retrieve and remove the first element of a tree set.
    System.out.println("first element removed "+treeset.pollFirst());
    
    //to retrieve and remove the last element of a tree set.
    System.out.println("last element removed "+treeset.pollLast());
    
    // to remove a given element from a tree set.
    treeset.remove(10);
    System.out.println(treeset);
}
}
