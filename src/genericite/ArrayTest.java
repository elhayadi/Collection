package genericite;


import java.util.*;

public class ArrayTest {
	 public static void main(String[] args) {
		 ArrayList<String> list= new ArrayList<String>();
		 list.add("1");
		 list.add("2");
		 list.add("3");
		 list.add("4");
		 list.add("5");
		 Iterator it =  list.iterator();
		 while(it.hasNext()) {
			 System.out.println(list);
			 String str = (String) it.next();
 it.remove();	 
		 }
		/******************************************************************************************/
		 Map <Integer,String> map = new HashMap<Integer,String>();
		 map.put(1,"contact1");
		 map.put(2,"contact2");
		 map.put(3,"contact3");
		 map.put(4,"contact4");
		 map.put(5,"contact5");
		 map.put(6,"contact6");
		 Set<Integer> SetInt = map.keySet();
		 Iterator it2 = SetInt.iterator();
		 
		 while (it2.hasNext()) { 
	           int key = (int) it2.next();
	            System.out.println("Value is "+key+" = "+map.get(key)); }
	 }
}
