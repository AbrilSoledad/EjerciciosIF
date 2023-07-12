package ar.edu.unlam.interfaz;

/*1. menor de $55 el descuento es del 4.5%.
2.entre $55 y $100 el descuento es del 8%.
3.más de $100 el descuento es del 10.5%.
informe: el descuento y el precio neto a cobrar.*/

import java.util.Scanner;

public class Farmacia14 {

	public static void main(String []args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese el importe de la compra: ");
		double importe = teclado.nextDouble();
		double descuento = 0;
		
		if(importe < 55) {
		descuento = importe - (importe * 0.045);
		} else if(importe >= 55 && importe <= 100){
			descuento = importe - (importe * 0.08);
		} else if(importe > 100) {
			descuento = importe - (importe * 0.105);
		}
		
		System.out.println("El precio neto a cobrar es: $" + importe + " y el precio con descuento es: $" + descuento);
		
		teclado.close();
	}
}
