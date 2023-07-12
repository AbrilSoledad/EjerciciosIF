package ar.edu.unlam.interfaz;

/*•código 1; 10; 100: 10 pesos la unidad.
•código 2; 22; 222: 7 pesos la unidad. La caja de 10 unidades vale 65 pesos.
•código 3; 33: 3 pesos la unidad. Si la compra es por más de 10 unidades se hace un descuento del 10% sobre el total de la compra.
•código 4; 44: 1 peso la unidad. */ 

import java.util.Scanner;

public class Negocio16 {

public static void main(String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese el codigo del articulo: ");
		int codigo = teclado.nextInt();
		System.out.println("Ingrese la cantidad a comprar: ");
		int cantidad = teclado.nextInt();
		
		double importe = 0;
		
		if(codigo == 1 || codigo == 100 || codigo == 100) {
			importe = cantidad *= 10;
		} else if(codigo == 2 || codigo == 22 || codigo == 222) {
			int cajas = cantidad / 10;
			int unidades = cantidad % 10;
			importe = cajas * 65 + unidades * 7;
		} else if(codigo == 3 || codigo == 33) {
			if(cantidad > 10) {
				importe = cantidad * 3 * 0.9;
			} else {
				importe = cantidad * 3;
			}
		} else if(codigo == 4 || codigo == 44) {
			importe = cantidad * 1;
		}
		
		System.out.println("ARITUCLO: XXXXX, CANTIDAD: " + cantidad + " IMPORTE A PAGAR: " + importe);
		
		teclado.close();
  }	
}
