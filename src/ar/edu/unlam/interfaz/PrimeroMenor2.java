package ar.edu.unlam.interfaz;

import java.util.Scanner;

/*Dados tres números determinar e informar con un mensaje si
 el primer número ingresado es menor que los otros dos. */

public class PrimeroMenor2 {

	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in); 
		
		System.out.println(" A continuacion se solicitara el ingreso de tres numeros y se informara si el primer ingresado es menor que los otros dos.");
		
		System.out.println("Ingrese el primer numero: ");
		int numUno = teclado.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int numDos = teclado.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		int numTres = teclado.nextInt();
		
		//si numUno es < que numDos y numTres //
		
		if (numUno < numDos && numUno < numTres) {
			System.out.println("El primer numero ingresado es menor que los otros dos");
		} else {
			System.out.println("El primer numero ingresado no es menor que los otros dos");
		}
		
		teclado.close();
	}
}
