package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		// LinkedHashSet a ordem conforme os elementos foram inseridos
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println("Se contem elementos: " + set.contains("Notebook"));

		System.out.println("Removendo um elemento da lista");

		set.remove("Tablet");
		System.out.println();

		System.out.println("Removendo um elemento satisfazendo uma condição ");
		set.removeIf(elem -> elem.length() >= 3);

		set.removeIf(elem -> elem.charAt(0) == 'T');

		System.out.println();
		System.out.println("Pegando todos os elementos do conjunto");
		for (String p : set) {
			System.out.println(p);
		}
	}

}
