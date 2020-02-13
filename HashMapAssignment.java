package collection1;

import java.util.*;

public class HashMapAssignment 
{
	public static void main(String[] args) 
	{
		// to create a HashMap of key as student id(Integer) and value as Student name (String). Add some entries and print the hash map.
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1, "irfan");
		hashmap.put(2, "abhi");
		hashmap.put(3, "ankit");
		hashmap.put(4, "manju");
		System.out.println(hashmap);

		// to iterate over all the entries in the HashMap.
		for(Map.Entry<Integer,String> x:hashmap.entrySet())
		{  
			System.out.println(x.getKey()+" "+x.getValue());  
		} 

		// to get the specified value with the specified key in a HashMap.
		System.out.println("value presnt in key 2 is "+hashmap.get(2));

		//to count the number of key-value (size) mappings in a map.
		System.out.println(hashmap.size());

		//to copy all of the mappings from the specified map to another map.
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(10, "ir");
		hashmap1.put(20, "hi");
		hashmap1.put(30, "kit");
		hashmap1.put(40, "anju");
		hashmap.putAll(hashmap1);
		System.out.println("after coping "+hashmap);

		// to test if a map contains a mapping for the specified key.
		System.out.println(hashmap.containsKey(10));

		// to test if a map contains a mapping for the specified value.
		System.out.println(hashmap.containsValue("anjuv"));	

		//to get the value of a specified key in a map.
		System.out.println("element present in key 4 is "+hashmap.get(4));

		// to get a set view of the keys contained in this map.
		System.out.println("set of keys are"+hashmap.keySet());

		// to get a collection view of the values contained in this map.
		System.out.println("collection view of values are"+hashmap.values());

		//to remove all of the mappings from a map.
		hashmap.clear();
		System.out.println("after removing "+hashmap);

	}

}
