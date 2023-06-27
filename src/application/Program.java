package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		// HashSet nao mantem a ordem, porem e mais rapido
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println("Se contem elementos: " + set.contains("Notebook"));

		System.out.println("Pegando todos os elementos do conjunto");
		for (String p : set) {
			System.out.println(p);
		}
	}

}
