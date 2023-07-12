package ar.edu.unlam.interfaz;

import java.util.Scanner;

/* recibe un premio de $500 si trabajo más de 50 horas y,
además, si trabajó más de 150 horas se le otorgan $1000 adicionales */

public class Horas12 {

	public static void main(String []args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese el valor de una hora trabajada: ");
		double hora = teclado.nextDouble();
		System.out.println("Ingrese la cantidad de horas trabajadas: ");
		double horasTrabajadas = teclado.nextDouble();
		
		double paga = hora * horasTrabajadas;
		
		if(horasTrabajadas >= 50 && horasTrabajadas < 150) {
			paga += 500;
			System.out.println("El valor de su pago es de $" + paga);
		} else if(horasTrabajadas >= 150 ) {
			paga += 1000;
			System.out.println("El valor de su pago es de $" + paga);
		} else {
			System.out.println("El valor de su paga es de $" + paga);
		}
		
		
		teclado.close();
	}
}
