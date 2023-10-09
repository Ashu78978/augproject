package day17;
/*
 * 
 * This Java program demonstrates the use of a HashMap. Let's break down the code step by step:

HashMap<Integer, String> mymap = new HashMap<Integer, String>();: This line declares a HashMap named mymap, specifying that it will store key-value pairs where the keys are integers and the values are strings.

mymap.put(...);: Several key-value pairs are added to the HashMap using the put method. The keys are integers, and the values are strings.

System.out.println(mymap);: Prints the entire HashMap, displaying its contents. Note that when you put a duplicate key (e.g., 102) with a different value, it overwrites the previous value associated with that key.

System.out.println(mymap.size());: Prints the size of the HashMap, which is the number of key-value pairs in it.

mymap.remove(104);: Removes the key-value pair with the key 104 from the HashMap.

System.out.println("After removing:" + mymap);: Prints the HashMap after removing a key-value pair.

mymap.put(106, "suresh");: Adds a new key-value pair to the HashMap.

System.out.println(mymap);: Prints the updated HashMap.

System.out.println(mymap.get(102));: Retrieves and prints the value associated with the key 102.

System.out.println(mymap.keySet());: Prints all the keys in the HashMap using the keySet() method. It returns a set of keys.

The code then uses a for-each loop to iterate through the keys in the HashMap and print both the key and its corresponding value.

The output of this program should be:

css
Copy code
{101=John, 102=David, 103=Mary, 104=Scott}
4
After removing:{101=John, 102=David, 103=Mary}
{101=John, 102=David, 103=Mary, 104=Scott, 106=suresh}
David
[101, 102, 103]
101  John
102  David
103  Mary
Note: In this code, when you added a new value for an existing key (e.g., 102), it overwrote the previous value. This behavior is typical for HashMaps, where keys must be unique, and adding a duplicate key updates the associated value.






 */
import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {

	public static void main(String[] args) {
		
		//declaration
		//HashMap mymap=new HashMap();
		//Map mymap=new HashMap();
		
		HashMap<Integer,String> mymap=new HashMap<Integer,String>();
		
		mymap.put(101,"John");
		mymap.put(102,"Scott");
		mymap.put(103,"Mary");
		mymap.put(104,"Scott");
		mymap.put(102,"David");
		
		System.out.println(mymap);		 //{101=John, 102=David, 103=Mary, 104=Scott}
		
		System.out.println(mymap.size()); //4
		
		mymap.remove(104);   // 104 is key
		System.out.println("After removing:"+mymap);	 //{101=John, 102=David, 103=Mary}
		mymap.put(106,"suresh");
		System.out.println(mymap);		 //{101=John, 102=David, 103=Mary, 104=Scott}

		System.out.println(mymap.get(102)); // 102 is key  //David
		
		//print all the keys from hashmap
		System.out.println(mymap.keySet()); //[101, 102, 103]
		
		//print values from hashmap
		for(int x:mymap.keySet())
		{
			System.out.println(x+"  "+mymap.get(x));
			
		}
		
		//mymap.clear();
		
		//System.out.println(mymap);
	}

}
/*
 * 101  John
102  David
103  Mary
 */


