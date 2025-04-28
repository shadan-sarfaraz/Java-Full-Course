package session20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration
		
		HashSet myset = new HashSet();
//		Set myset = new HashSet();
//		HashSet <String> myset = new HashSet <String>();
		
		
		//adding elements in to hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);// duplicate will be ignored
		System.out.println(myset);
		
		//Remove element
		myset.remove(10.5);// index is not supported so we have to pass value directly
		System.out.println(myset);
		
		//Inserted element
//		not possible cz no order is there in hashset
		
		//access specific element
//		not possible cz no order is there in hashset
		
		//We can do all the thing we do in arraylist by converting hashmap into arraylist
		ArrayList al = new ArrayList(myset); 
		System.out.println(al);
		System.out.println(al.get(2));
		
//		Read all the elements using for each ** for loop is not supported cz there is no indexing in hashset
		for(Object x:myset) {
			System.out.println(x);
		}
		
		//using iterator
		
		Iterator <Object> it = myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		myset.clear();
		System.out.println(myset.isEmpty());
		
	}

}
