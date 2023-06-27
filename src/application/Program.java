package application;

import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		// TreeSet mantem os dados ordenados
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println("Se contem elementos: " + set.contains("Notebook"));

		System.out.println("Pegando todos os elementos do conjunto");
		for (String p : set) {
			System.out.println(p);
		}
	}

}
