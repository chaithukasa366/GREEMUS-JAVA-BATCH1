package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Task1 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("s");
		l.add("d");
		l.add("f");
		l.add("g");
		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList<String> l1 = (ArrayList<String>) ((ArrayList<String>) l).clone();
		System.out.println(l1);
		l1.trimToSize();
		System.out.println("size of the list :" + l.size());
		System.out.println("containsAll() :" + l.containsAll(l1));
		System.out.println("get() of the list :" + l.get(3));
		System.out.println("indexof() of the list :" + l.indexOf("a"));
		System.out.println("isEmpty() of the list :" + l.isEmpty());
		System.out.println("subList() of the list :" + l.subList(1, 3));
		l.add(3, "h");
		l.set(0, "k");
		l.remove(4);
		System.out.println(l);
		l.sort(Comparator.naturalOrder());
		System.out.println(l);
		l.sort(Comparator.reverseOrder());
		System.out.println(l);
		String a[] = new String[l.size()];
		l.toArray(a);
		for (String s : a) {
			System.out.println(s);
		}
		String s1 = l.toString();
		System.out.println(s1);
		l1.clear();
		System.out.println("after clear() of list :" + l1);
		l1.add("m");
		l1.addAll(l);
		l1.retainAll(l);
		System.out.println("after retainAll() :" + l1);
	}
}
