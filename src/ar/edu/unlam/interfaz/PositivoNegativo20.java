package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class PositivoNegativo20 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero: ");
		int x = teclado.nextInt();

		if (x > 0) {
			System.out.println("Numero positivo");
		} else {
			System.out.println("Numero negativo");
		}

		if (x % 2 == 0) {
			System.out.println("Numero par");
		} else {
			System.out.println("Numero impar");
		}

		teclado.close();
	}
}
