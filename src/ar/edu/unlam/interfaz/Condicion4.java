package ar.edu.unlam.interfaz;

import java.util.Scanner;

/*Ingresar 3 valores reales y:
a. Si los dos primeros son mayores al tercero informar “MAYORES AL TERCERO”
b. Si los tres son iguales informar “TRES IGUALES”
c. Si alguno de los dos primeros es menor al tercero informar “ALGUNO ES MENOR”*/

public class Condicion4 {

	public static void main(String []args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese el primer numero: ");
		int numUno = teclado.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int numDos = teclado.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		int numTres = teclado.nextInt();
		
		// numUno y numDos son mayores a numTres informar “MAYORES AL TERCERO”//
		if (numUno > numTres && numDos > numTres) {
			System.out.println("MAYORES AL TERCERO");
		// numUno = numDos = numTres informar “TRES IGUALES” //
		} else if (numUno == numDos && numDos == numTres) {
			System.out.println("TRES IGUALES");
		// numUno es menor a numTres o numDos es menor a numTres informar “ALGUNO ES MENOR” //
		} else if (numUno < numTres || numDos < numTres) {
			System.out.println("ALGUNO ES MENOR");
		}
		
		teclado.close();
	}
}
