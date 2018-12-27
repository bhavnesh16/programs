package mountain;

import java.util.HashMap;
import java.util.Map;

public class hashmap
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();   
		  //System.out.println("Initial list of elements: "+hm);  
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");   
	     for(Map.Entry m:hm.entrySet())
	     {    
	      System.out.println(m.getKey()+" "+m.getValue());    
         }
	     hm.put(103, "anil");
	     hm.putIfAbsent(104, "vikas");
	     System.out.println("-------------------"); 
	     for(Map.Entry m:hm.entrySet())
	     {    
	      System.out.println(m.getKey()+" "+m.getValue());    
         }
     }
}