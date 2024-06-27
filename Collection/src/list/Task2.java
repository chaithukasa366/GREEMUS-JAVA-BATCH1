package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Task2 {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList();
		l.add("a");
		l.add("s");
		l.add("d");
		l.add("f");
		l.add("g");
		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("========= clone========");
		LinkedList<String> l1 = (LinkedList<String>) l.clone();
		System.out.println(l1);
		System.out.println("==========methods==========");
		System.out.println("size of the list :" + l.size());
		System.out.println("containsAll() :" + l.containsAll(l1));
		System.out.println("get() of the list :" + l.get(3));
		System.out.println("indexof() of the list :" + l.indexOf("a"));
		System.out.println("isEmpty() of the list :" + l.isEmpty());
		System.out.println("subList() of the list :" + l.subList(1, 3));
		System.out.println("=========================");
		l.add(3, "h");
		l.addFirst("a");
		l.addLast("z");
		l.set(0, "k");
		l.remove(4);
		System.out.println(l);
		System.out.println("=========remove methods===========");
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		System.out.println("========sorting============");
		l.sort(Comparator.naturalOrder());
		System.out.println(l);
		l.sort(Comparator.reverseOrder());
		System.out.println(l);
		System.out.println("=======conversion==========");
		String a[] = new String[l.size()];
		l.toArray(a);
		for (String s : a) {
			System.out.println(s);
		}
		String s1 = l.toString();
		System.out.println("======clear and retain methods===========");
		System.out.println(s1);
		l1.clear();
		System.out.println("after clear() of list :" + l1);
		l1.add("m");
		l1.addAll(l);
		l1.retainAll(l);
		System.out.println("after retainAll() :" + l1);
		System.out.println("=======list iterator ==============");
		ListIterator<String> litr=l.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next()); 
			
		}
		System.out.println("=========================");
		while (litr.hasPrevious()) {
			System.out.println(litr.previous()); 
			
		}
	}
}
