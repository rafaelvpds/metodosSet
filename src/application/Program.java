package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(3, 0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(1, 5, 6, 7, 8, 9, 10));
//union
		Set<Integer> c = new TreeSet<>(a);
		// uniao de c com b
		c.addAll(b);
		System.out.println(c);
//intersection
//apenas os elementos em comum entre os conjuntos
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		// difference
		// remove do conjunto "e" todos ques estão no conjunto "b"
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);

	}
}