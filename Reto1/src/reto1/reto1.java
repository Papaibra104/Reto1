package reto1;
import reto1.Funciones1;
import reto1.Funciones2;
import reto1.Funciones3;
import java.util.Scanner;

public class reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("Elige un numero: ");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Par");
			System.out.println("6. Impar");
			System.out.println("7. Positivo");
			System.out.println("8. Negativo");
			System.out.println("0. Salir");
		
			 num = Integer.parseInt(sc.nextLine());
		
		switch (num) {
		case 1:
			System.out.println(Funciones1.maximo3(4, 10, 2));
			break;
		case 2:
			System.out.println(Funciones2.suma(2, 6));
			break;
		case 3:
			System.out.println(Funciones3.dividir(10, 2));
			
		default:
			System.out.println("No.");
			break;
		}

		} while (num != 0);
		
		}

}
