package collection1;

import java.util.*;

public class ArrayList1 
{
	public static void main(String[] args)
	{
		// to create a new array list containing student names, add some student (string) and print out the collection.
		ArrayList<String> a = new ArrayList<String>();
		a.add("abc");
		a.add("def");
		a.add("ghi");
		a.add("jkl");
		//to iterate through all elements in a array list.
		Iterator<String> itr = a.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());
		}
		
		
		// to insert an element into the array list at the first position.
		a.add(0, "first");
		System.out.println("item added in first pos");
		itr = a.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());
		}
		
		
		//to retrieve an element (at a specified index) from a given array list.
		String ele=a.get(3);
		System.out.println("element present in index 3 is "+ele);
		
		
		//to update specific array element by given element.
		a.set(2, "irfan");
		System.out.println("after update"+a);
		
		// to remove the third element from a array list.
		a.remove(2);
		System.out.println("after removing"+a);
		
		// to search an element in a array list.
		if(a.contains("irfan"))
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("not found");
		}
		
		//to sort a given array list.
		Collections.sort(a);
		System.out.println("after sorting"+a);
		
		//to copy one array list into another.
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("1");
		a1.add("2");
		a1.add("3");
		a1.add("4");
		Collections.copy(a1,a);
		System.out.println("after coping"+a1);
		
		//to reverse elements in a array list.
		Collections.reverse(a1);
		System.out.println("after reversing"+a1);
		
		// to join two array lists.
		a.addAll(a1);
		System.out.println("after joining "+a);
		
		//to clone an array list to another array list.
		ArrayList<String> cl= (ArrayList<String>)a.clone();
		System.out.println("after cloning"+cl);
		
		//to empty an array list.
		a.removeAll(a);
		System.out.println("after removing"+a);
		
		//to test an array list is empty or not.
        System.out.println("array list a is "+a.isEmpty());
        
	}
	
}
