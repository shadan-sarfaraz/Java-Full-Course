package session20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declaration
		ArrayList mylist = new ArrayList();
//		List mylist = new ArrayList();
//		ArrayList <String>myList = new ArrayList<String>();
		
		//Adding data into arraylist
		mylist.add(100);
		mylist.add(10.);
		mylist.add("Welcome");
		mylist.add('a');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//Size of arraylist
		System.out.println("Size of the arraylist: "+mylist.size());
		
		//Printing arraylist
		System.out.println("printing data from arraylist: "+mylist);
		
		//Remove elements from arraylist.
		mylist.remove(5);
		System.out.println("After removing:" +mylist);
		System.out.println("Size of the arraylist: "+mylist.size());
		
		//Insert element in the arraytlist
		mylist.add(2,"java");
		System.out.println("After insertion: "+mylist);
		
		//Modify/replace/change element in the arraylist
		mylist.set(2, "python");
		System.out.println("After replacing: "+mylist);
		
		//Access specific element from arraylist
		System.out.println(mylist.get(3));
		
		//reading all the element from arraylist
			//using normal for loop
		for (int i = 0; i < mylist.size(); i++) {
			System.out.print(mylist.get(i)+ ", ");
		}
		System.out.println();
		
		//using for each loop
		
		for(Object x:mylist) {
			System.out.print(x+ ", ");
		}
		System.out.println();
		
		//using iterator
		Iterator it = mylist.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ ", ");
		}
		System.out.println();
		
		//checking arraylist is empty or not
		System.out.println("Is arraylist empty "+ mylist.isEmpty());
		
		//remove all the elements from array list
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add("Welcome");
		mylist.removeAll(mylist2);
		System.out.println(mylist);
		
		//remove/clear all the elements
		mylist.clear();
		System.out.println("Is arraylist empty?: "+mylist.isEmpty());
		System.out.println(mylist);
		
	}

}
