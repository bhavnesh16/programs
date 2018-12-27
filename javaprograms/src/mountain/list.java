package mountain;

import java.util.*;

public class list {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 ArrayList<Integer> arrli = new ArrayList<Integer>(5);
		 for (int i=1; i<=5; i++) 
	            arrli.add(i); 
	        // Printing elements 
	        System.out.println(arrli); 
	        arrli.remove(3); 
	        System.out.println(arrli); 
	        // Printing elements one by one 
	        for (int i=0; i<arrli.size(); i++) 
	            System.out.print(arrli.get(i)+" ");
	        System.out.println();  
	        System.out.println("-------------");  
	        ArrayList<String> list=new ArrayList<String>();
	        list.add("Ravi");//Adding object in arraylist  
	        list.add("Vijay");  
	        list.add("Ravi");  
	        list.add("Ajay");
	        Iterator ite=list.iterator();
	        while(ite.hasNext())
	        {  
	        	   System.out.println(ite.next());  
	        }  
	        System.out.println("-------------");  
	        for(String obj:list)
	        {
	        	 System.out.println(obj); 
	        }
	}

}
