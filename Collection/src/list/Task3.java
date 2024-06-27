package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Task3 {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.offer("a");
		l.offerFirst("b");
		l.offerLast("z");
		System.out.println(l);
		l.push("s");
		System.out.println(l);
		l.pop();
		System.out.println(l);
		l.peek();
		System.out.println(l.peek()+" "+l.peekFirst()+" "+l.peekLast());
	
		l.peekFirst();
		l.peekLast();
			
		
	}
}
