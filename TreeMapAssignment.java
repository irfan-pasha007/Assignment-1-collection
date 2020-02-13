package collection1;

import java.util.*;

public class TreeMapAssignment 
{
public static void main(String[] args)
{
	//to create a TreeMap of <studentId(Integer), studentName(String)>. Add some student records with random student ids. 
	TreeMap<Integer,String> treemap=new TreeMap<Integer,String>(new SortKey());
	treemap.put(6, "irfan");
	treemap.put(2, "abhi");
	treemap.put(3, "ankit");
	treemap.put(1, "manju");
	System.out.println(treemap);
	
	//to get all keys from the given a Tree Map.
	System.out.println(treemap.keySet());
	
	//to get the first (lowest) key and the last (highest) key currently in a map.
	System.out.println("lowest key in treemap is "+treemap.firstKey()+" highest key in treemap is "+treemap.lastKey());
	
	// to get a reverse order view of the keys contained in a given map.
	System.out.println(treemap.descendingKeySet());
	
	//to delete all elements from a given Tree Map.
	treemap.clear();
	System.out.println("after deleting "+treemap);
	
	
}
}
//to sort keys in Tree Map by using comparator.
class SortKey implements Comparator<Integer>
{
     @Override
    public int compare(Integer i1,Integer i2)
     {
        return i1.compareTo(i2);
    }
}
