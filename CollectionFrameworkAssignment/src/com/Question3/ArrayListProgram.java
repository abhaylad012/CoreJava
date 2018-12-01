package com.Question3;

import java.util.*;
/*import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
*/
public class ArrayListProgram {
	
	public static void main(String[] args){
		
		List<String> arrayList= new  ArrayList<String>();
		
		arrayList.add("one");
		arrayList.add("two");
		arrayList.add("three");
		arrayList.add("four");
		arrayList.add("five");
		
		//Works on String data
		ListIterator<String> listIterator= arrayList.listIterator();
		
		 System.out.println("Traversing elements in backward direction");    
	        
		 while(listIterator.hasPrevious()){     
	        System.out.println("index:"+listIterator.previousIndex()+" value:"+listIterator.previous());    
	        }  
		 
		 
		 /*Collections.reverse(arrayList);
		 System.out.println("ArrayList After Reverse :");
		 System.out.println(arrayList);
		*/
		 while(listIterator.hasNext()){    
             
		        System.out.println("index:"+listIterator.nextIndex()+" value:"+listIterator.next());    
		     }
		
		

	}
	
	

}
