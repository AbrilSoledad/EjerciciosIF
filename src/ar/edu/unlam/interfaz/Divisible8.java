package ar.edu.unlam.interfaz;

import java.util.Scanner;

//ingrese dos números e indique si el primer número es divisible por el segundo.//

public class Divisible8 {

	public static void main(String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese el primer numero: ");
		int numUno = teclado.nextInt();
		System.out.println("Ingrse el segundo numero: ");
		int numDos = teclado.nextInt();
		
		if(numUno % numDos == 0) {
			System.out.println(numUno + " es divisible por " + numDos);
		} else {
			System.out.println(numUno + " no es divisible por " + numDos);
		}
		
		
		teclado.close ();
	}
}
