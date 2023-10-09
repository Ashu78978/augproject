package day17;
/*
 * 
 * It looks like you've provided a Java program that demonstrates the use of an ArrayList. 
 * This program creates an ArrayList called List and performs various operations on it.
 *  I'll explain the code step by step:

ArrayList List = new ArrayList();:
 This line declares an ArrayList named List without specifying the type of elements
  it will hold. In modern Java, it's recommended to use generics to specify the type, 
  such as ArrayList<Object> List = new ArrayList<>();.

List.add(...);: This code adds various elements to the ArrayList,
 including integers, strings, characters, null values, a double, and a boolean.

System.out.println("number of items:" + List.size());: It prints the number of items
 in the ArrayList using the size() method.

System.out.println(List);: This line prints the entire ArrayList, displaying its contents.

List.remove(1);: Removes the element at index 1 (the second element) from the ArrayList.

System.out.println("after removing:" + List);: Prints the ArrayList after removing an element.

List.add(4, "selenium");: Inserts the string "selenium" at index 4 in the ArrayList.

System.out.println(List.get(6));: Retrieves and prints the element at index 6 (which is "11.4" as a string).

The code then uses a for-each loop to iterate through the ArrayList and print each element.

It's worth noting that in modern Java, it's recommended to use generics 
to specify the type of elements that an ArrayList will hold, like this:

java
Copy code
ArrayList<Object> List = new ArrayList<>();
This provides better type safety and helps avoid issues related to type casting. Additionally, using specific types (e.g., ArrayList<String>, ArrayList<Integer>) is often more appropriate, as it allows you to work with elements of a known type without the need for explicit casting.





 * 
 * Collections
--------------
List
Set
HashMap

collection is a interface ,list,set      hashmap is alos a interface 

Collection - To represent group of elements/objects/data into single entity then go for collections.

"Collection"  is an interface in java avaialble in    java.util    package.

ArrayList - is class which is implemented List interface
-------

=======
//MID

====
1) Heterogenious data - allowed different type of data string char boolean int double type
2) Insertion order- preserved(Index) //like index stsrts from 0,1,2,3,4,5,6
3) Duplicate elements -- allowed
4) multiple nulls -- allowed


int ---> Integer
double ---> Double
char --> Character


HashSet   - a class implemented Set interface

---------
1) Heterogenios data ---> allowed
2) Insertion order  --> Not preserved (Index not supported)
3) Duplicate elements --> Not Allowed
4) Multiple nulls Not allowed/ only single null is allowed


HashMap - a class implemented Map interface
--------------
Data can be stored in the form of key, value pairs.
Key is unique. But we can have duplicate values.
Insertion order not preserved(Index not followed)
 */
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		
		//declaration
		
		ArrayList List=new ArrayList();
		
		
		List.add(100);
		List.add(100);
		List.add("hey");
		List.add('c');
		List.add(null);
		List.add(null);
		List.add(11.4);
		List.add(false);
		
		System.out.println("number of items:"+List.size());
		System.out.println(List);//[100, 100, hey, c, null, null, 11.4, false]

		List.remove(1);
		System.out.println("after removing:"+List);//after removing:[100, hey, c, null, null, 11.4, false]

		List.add(4,"selenium");//[100, hey, c, null, selenium, null, 11.4, false]

		
		//System.out.println(List);
		
		System.out.println(List.get(6)); //11.4

		
		//read data from arraylist
		
		
		
		for(Object f: List)
			
			
			
		{
			
			System.out.println(f);
			
		}
		
		
		
		/*
		 * 
		 * 
		 * 100
hey
c
null
selenium
null
11.4
false

		 */

		
		



		
		
		
	}

}
