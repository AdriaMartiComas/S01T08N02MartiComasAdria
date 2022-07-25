package exercici3;

public class App {

	public static void main(String[] args) {
		
		float f1 = (float) 34.2;
		float f2 = (float) 17.8;
		
		Func suma = (a, b) -> a + b;
		Func resta = (a, b) -> a - b;
		Func muliplicacion = (a, b) -> a * b;
		Func division = (a, b) -> a / b;
		
		System.out.println(suma.operacio(f1, f2));
		System.out.println(resta.operacio(f1, f2));
		System.out.println(muliplicacion.operacio(f1, f2));
		System.out.println(division.operacio(f1, f2));
		
		


		
		
		
		
		
	}

}
