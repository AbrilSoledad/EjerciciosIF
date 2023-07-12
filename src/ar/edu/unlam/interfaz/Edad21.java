package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Edad21 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese su edad: ");
		byte edad = teclado.nextByte();

		if (edad >= 60) {
			System.out.println("tercera edad");
		} else if (edad > 18 && edad < 60) {
			System.out.println("adulto");
		} else {
			System.out.println("adolescente");
		}

		teclado.close();
	}
}
