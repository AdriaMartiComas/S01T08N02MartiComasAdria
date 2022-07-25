package exercici4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();

		strList.add("taules");
		strList.add("4");
		strList.add("erupcio");
		strList.add("45");
		strList.add("entesa");
		strList.add("interessant");
		strList.add("17");

		System.out.println("Llista sense ordenar".toUpperCase());
		System.out.println(strList + "\n");

		// Ordenar alfabeticament pel primer caracter
		System.out.println("Ordenar alfabeticament pel primer caracter".toUpperCase());

		List<String> strList1 = strList.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());

		System.out.println(strList1 + "\n");

//		strList.sort((a, b) -> a.compareTo(b));
//		System.out.println(strList + "\n");

		// Ordenar primer e
		System.out.println("Ordenar primer e".toUpperCase());
		ArrayList<String> strList2 = new ArrayList<String>();

		strList.stream().forEach(s -> {
			if (s.charAt(0) == 'e') {
				strList2.add(0, s);
			} else {
				strList2.add(s);
			}
		});

		System.out.println(strList2 + "\n");

		// Canviar a per 4
		System.out.println("Canviar a per 4".toUpperCase());
		ArrayList<String> strList3 = new ArrayList<String>();

		strList.stream().forEach(s -> {
			if (s.contains("a")) {
				s = s.replace("a", "4");
				strList3.add(s);
			} else {
				strList3.add(s);
			}
		});

		System.out.println(strList3 + "\n");

		// Mostrar nomes elements numerics
		System.out.println("Mostrar nomes elements numerics".toUpperCase());
		ArrayList<String> strList4 = new ArrayList<String>();

		strList.stream().forEach(s -> {
			if (s.matches(".*[0-9].*")) {
				strList4.add(s);
			}
		});

		System.out.println(strList4);

	}

}
