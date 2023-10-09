package day17;
/*
 * 
 * 
 * 
This Java program demonstrates the use of a HashSet.
 Let's go through the code step by step:

HashSet myset = new HashSet();: This line declares a HashSet named myset.
 A HashSet is a collection that does not allow duplicate elements and does not guarantee the order of elements.

myset.add(...);: Various elements are added to the HashSet using the add method,
 including integers, strings, characters, null, a double, and a boolean. Note that duplicates (like 100 and null) are not added, and only unique elements are retained.

System.out.println("number of items:" + myset.size());: Prints the number of items in the HashSet using the size() method. As mentioned earlier, duplicates are not allowed, so only unique elements are counted.

System.out.println(myset);: Prints the entire HashSet, displaying its contents. 
Note that the order of elements may not be the same as when they were added because HashSets do not guarantee order.

myset.remove('c');: Removes the character 'c' from the HashSet.

System.out.println("after removing:" + myset);: Prints the HashSet after removing the character 'c'.

System.out.println(myset);: Prints the HashSet again after the removal operation.

The code then uses a for-each loop to iterate through the elements in the HashSet and prints each element.

The output of this program should be:

typescript
Copy code
number of items:6
[null, c, 100, false, 11.4, hey]
after removing:[null, 100, false, 11.4, hey]
[null, 100, false, 11.4, hey]
null
100
false
11.4
hey
As you can see, the HashSet only retains unique elements, and the order of elements may vary when you print the HashSet.






 * HashSet   - a class implemented Set interface
---------
1) Heterogenios data ---> allowed
2) Insertion order  --> Not preserved (Index not supported)
3) Duplicate elements --> Not Allowed
4) Multiple nulls Not allowed/ only single null is allowed
 */
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		
		//declaration
		
		HashSet myset=new HashSet();
		
		
		myset.add(100);
		myset.add(100);
		myset.add("hey");
		myset.add('c');
		myset.add(null);
		myset.add(null);
		myset.add(11.4);
		myset.add(false);
		
		System.out.println("number of items:"+		myset.size());//number of items:6

		System.out.println(myset);//[null, c, 100, false, 11.4, hey]

		myset.remove('c');
		System.out.println("after removing:"+		myset);//after removing:[null, 100, false, 11.4, hey]

		
		System.out.println(		myset);//[null, 100, false, 11.4, hey]

		

		
		//read data from arraylist
		
		
		
		for(Object x: 		myset)
			
			
			
		{
			
			System.out.println(x);
			
		}

		
		



		
		
		
	}

}


/*
 * null
100
false
11.4
hey
 * 
 * 
 */
