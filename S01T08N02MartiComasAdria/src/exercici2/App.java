package exercici2;

import java.util.ArrayList;

interface EvenOdd {
	void check(int a);
}

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>();
		ArrayList<String> strList = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			double a = Math.random() * 10;
			int b = (int) a;

			numList.add(b);
		}
		System.out.println(numList);


		numList.stream().forEach(n -> {
			if (n % 2 == 0) {
				strList.add("e" + n);
			} else {
				strList.add("o" + n);
			}
		});

		System.out.println(strList);

	}

}
