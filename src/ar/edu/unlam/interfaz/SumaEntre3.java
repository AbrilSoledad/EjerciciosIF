package ar.edu.unlam.interfaz;

import java.util.Scanner;

/* programa que pueda determinar de 3 números enteros que se 
ingresan si alguno de ellos es igual a la suma de los otros dos.*/

public class SumaEntre3 {

	public static void main (String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Se informara si alguno de los numeros es igual a la suma de los otros dos");
		
		System.out.println("Ingrese el primer numero: ");
		int numUno = teclado.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int numDos = teclado.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		int numTres = teclado.nextInt();
		
		// si numUno = numDos + numTres //
		// si numDos = numUno + numTres //
		// si numTres = numUno + numDos //
		
		if ( numUno == numDos + numTres) {
			System.out.println("La suma de " + numDos + " + " + numTres + " es igual a " + numUno);
		} else if ( numDos == numUno + numTres) {
			System.out.println("La suma de " + numUno + " + " + numTres + " es igual a " + numDos);
		} else if ( numTres == numUno + numDos) {
			System.out.println("La suma de " + numUno + " + " + numDos + " es igual a " + numTres);
		} else {
			System.out.println("La suma de dos de los digitos no es equivalente al tercer numero");
		}
		
		teclado.close();
	}
}
