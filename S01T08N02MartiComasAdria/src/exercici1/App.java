package exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		ArrayList<String> llista = new ArrayList<String>();

		llista.add("Adria");
		llista.add("Maria");
		llista.add("Pol");
		llista.add("Ali");
		llista.add("Lluc");
		llista.add("Aro");
		llista.add("Nil");
		llista.add("Marta");
		llista.add("Josefina");
		
		System.out.println(llista);
		
		List<String> llistaA3 = llista.stream()
				.filter(l -> l.length() == 3)
				.filter(l -> l.charAt(0) == 'A')
				.collect(Collectors.toList());
		
		
		System.out.println(llistaA3);
	}

}
