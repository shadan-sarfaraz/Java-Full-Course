package session20;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;


public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration
//		Map hm =new HashMap();
//		HashMap hm = new HashMap();
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//Adding pairs
		hm.put(101, "john");
		hm.put(102, "Shdan");
		hm.put(103, "Zishan");
		hm.put(101, "Smith");//duplicate key will be replaced not value value can be duplicate
		hm.put(104, "Shdan");
		
		System.out.println(hm);
		
		System.out.println("Size of hashmap"+hm.size());
		
		//remove pair
		hm.remove(103);//103 is key of the pair
		System.out.println("After removing pair: "+hm);
		
		//access value of the key
		System.out.println(hm.get(102));//102 is key of the pair
		
		//get all the keys from hashmap
		System.out.println(hm.keySet());
		//get all the values from hashmap
		System.out.println(hm.values());
		
		//get all the keys along with values from hashmap
		System.out.println(hm.entrySet());
		
		//reading data from hashmap
		
		//using for.. each
		
		for(int k:hm.keySet()) {
			System.out.println(k+"  "+hm.get(k));
		}
		
		//using iterator
		
		Iterator<Entry<Integer,String>> it= hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry <Integer,String> entry = it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		hm.clear();
		System.out.println(hm.isEmpty());
	}

}
