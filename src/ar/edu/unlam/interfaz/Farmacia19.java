package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Farmacia19 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Inserte el precio original del producto: ");
		double precioOriginal = teclado.nextDouble();

		System.out.println("Inserte el codigo correspondiente (1 o 0): ");
		int codigo = teclado.nextInt();

		double precioFinal = 0;

		if (codigo == 1) {
			precioFinal = precioOriginal - (precioOriginal * 0.2);
		} else {
			precioFinal = precioOriginal;
		}

		System.out.println("El precio final del producto  es: $" + precioFinal);

		teclado.close();
	}
}
