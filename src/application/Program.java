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

		System.out.println("Pegando todos os elementos do conjunto");
		for (String p : set) {
			System.out.println(p);
		}
	}

}
