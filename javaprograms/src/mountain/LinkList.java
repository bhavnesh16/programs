package mountain;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList<String> al =new LinkedList<String>();
		al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay"); 
		  System.out.println(al);
		  Iterator <String> li=al.iterator();
		  while(li.hasNext())
		  {
			  System.out.println(li.next());
		  }
		  System.out.println("----------------");
          for(String str:al)
          {
        	  System.out.println(str);
          }
          al.add(0, "Gaurav");  
          System.out.println(al);
          LinkedList<String> ll3=new LinkedList<String>();  
          ll3.add("John");  
          ll3.add("Rahul");
          al.addAll(1, ll3);
          System.out.println(al);
          al.remove(3);
          System.out.println(al);
          al.removeAll(ll3);
          System.out.println(al);
          al.addLast("Harsh");  
          System.out.println(al);
          Iterator iq=al.descendingIterator();
          while(iq.hasNext())  
          {  
              System.out.println(iq.next());  
          }  
	}
}
