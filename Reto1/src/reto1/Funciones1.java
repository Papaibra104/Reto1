package reto1;

public class Funciones1 {

	public static int maximo3(int n1, int n2, int n3) {
		
		int mayor = Math.max(Math.max(n1, n2), n3);
		
		return mayor;
	// Devuelve el mayor de los 3 numeros
		
	}
	
	
	public static int minimo3(int n1, int n2, int n3) {
		
		int menor = Math.min(Math.min(n1, n2), n3);
		
		return menor;
		// Devuelve el menor de los 3 numeros
	}
	
	
	
}
