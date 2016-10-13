package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListTest {
	
	public static void main(String args[]){
		
		List<String> listA = new ArrayList<String>();
		List<String> listB = new LinkedList<String>();
		
		listA = addListTest(listA, "ArrayList");
		iterateListTest(listA);
		 
		listB = addListTest(listB, "LinkedList");
		iterateListTest(listB);
		
	}
	
	
	
	public static List<String> addListTest(List<String> list, String tipoLista){
		
		System.out.println("//"+ tipoLista);
		
		long start = System.nanoTime();
		
		list.add("element 0");
		list.add("element 1");
		list.add("element 2");
		
		long end= System.nanoTime();	
		System.out.println("time to add :"+ (end - start));
		return list;
	}
	
	public static void iterateListTest(List<String> lista){
		
		long start = System.nanoTime();
		System.out.println("#1 normal for loop");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	    long end = System.nanoTime();
	    
	    System.out.println("time for :"+(end - start));
		
		System.out.println("#2 advance for loop");
		
		for(Object object : lista) {
		    String element = (String) object;
		    System.out.println("elemento:" + element);
		}
		
		for (String temp : lista) {
			System.out.println(temp);
		}
		
		System.out.println("#3 while");
		int j = 0;
		while (lista.size() > j) {
			System.out.println(lista.get(j));
			j++;
		}

		System.out.println("#4 iterator");
		Iterator<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
