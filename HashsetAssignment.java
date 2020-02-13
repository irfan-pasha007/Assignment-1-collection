package collection1;

import java.util.*;

public class HashsetAssignment 
{
public static void main(String[] args)
{
	//to add student names in a hash set. 
	HashSet<String> hashset = new HashSet<String>();
	hashset.add("manju");
	hashset.add("irfan");
	hashset.add("lokesh");
	System.out.println("after adding"+hashset);
	
	//to append the specified element to the end of a hash set.
	hashset.add("abhi");
	System.out.println("after appending"+hashset);//duplicates are allowed insertion order is not preserved in hash set so we cannot insert in specified location
	
	//to iterate through all elements in a hash list.
	Iterator<String> p = hashset.iterator();
	System.out.println("using iterator");
	   while (p.hasNext())
	   {
	   System.out.println(p.next());
	   }
	   
	// to get the number of elements in a hash set.
	   System.out.println("Size of the Hash Set is " + hashset.size());
	   
	 //to convert a hash set to an array.
	   String[] st=new String[hashset.size()];
	   hashset.toArray(st);
	   for(String i:st)
	   {
		   System.out.print(i+",");
	   }
	   System.out.println();
	 
	 // to convert a hash set to a List/ArrayList.
	   List<String> list = new ArrayList<String>(hashset);
	    System.out.println("ArrayList "+ list);
	    
	//to compare two hash set.
        HashSet<String> hashset2 = new HashSet<String>();
        hashset2.add("irfan");
        hashset2.add("hi");
        hashset2.add("pasha");
        hashset2.add("ankit");
        hashset2.add("abhi");
       System.out.println(hashset.containsAll(hashset2));
		
		  for (String element : hashset2)
		 {
		 System.out.println(hashset.contains(element) ? "Yes" : "No"); 
		 }
		
       
     //to compare two sets and retain elements which are same on both sets.
       hashset.retainAll(hashset2);
       System.out.println("after retaining elements on both sets");
       System.out.println(hashset);
       
     //to remove all of the elements from a hash set.
       hashset.clear();
       System.out.println("after clearing "+hashset);
       
      // to empty an hash set.
       hashset2.removeAll(hashset2);
       System.out.println("after removing hashset2"+hashset2);
       
      

}
}
