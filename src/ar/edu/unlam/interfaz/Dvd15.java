package ar.edu.unlam.interfaz;

/*•sueltos, entre 1 y 9 a $15 c/u.
•la caja de 10 cuesta $120.
•la caja de 50 cuesta $500.
Si la compra excede las 100 unidades se efectúa un descuento del 10%.*/

import java.util.Scanner;

public class Dvd15 {

public static void main(String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Se aceptan compras entre 1 y 500 DVDs");
		System.out.println("Puede comprar por unidad, caja de 10, caja de 50, o si compra mas de 100 DVDs tiene un descuento del 10%");
		System.out.println("Ingrese la cantidad de DVDs que desea comprar: ");
		
		int cantidadDvd = teclado.nextInt();
		int precio = 0;
		double descuento = 0.10 ;
		
		if(cantidadDvd >= 1 && cantidadDvd <= 9) {
		    precio = cantidadDvd *= 15;
		} else if(cantidadDvd <= 10 || cantidadDvd <= 40) {
			precio = cantidadDvd *= 120;
		} else if(cantidadDvd == 50 || cantidadDvd == 100) {
			precio = cantidadDvd *= 500; 
		} else if(cantidadDvd > 100) {
			precio = cantidadDvd - (cantidadDvd *= descuento);
		}
		
		System.out.println("El importe a pagar es: $" + precio);
		
		teclado.close();
  }
}
