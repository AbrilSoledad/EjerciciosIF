package ar.edu.unlam.interfaz;

/*Un fabricante de repuestos para tractores ha descubierto
que ciertos artículos identificados por los números de catálogo
12121 al 18081; 30012 al 45565 y 67000 al 68000 son defectuosos.
Se desea confeccionar un programa al que informándole el número
de catálogo indique si el artículo es o no defectuoso. Los artículos
del catálogo van desde el 1200 al 90000. Si se ingresa otro número
informar “FUERA DE CATALOGO”. */

import java.util.Scanner;

public class Catalogo13 {

	public static void main(String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Los artículos del catálogo van desde el 1200 al 90000.");
		System.out.println("Inserte el numero de catalogo: ");
		int numCatalogo = teclado.nextInt();
		
		if(numCatalogo>=12121&&numCatalogo<=18081||numCatalogo>=30012&&numCatalogo<=45565||numCatalogo>=67000&&numCatalogo<=68000) {
			System.out.println("Articulo defectuoso");
		}else if(numCatalogo<1200 || numCatalogo>90000) {
			System.out.println("FUERA DEL CATALOGO");
		} else {
			System.out.println("El articulo no es defectuoso");
		}
		
		
		teclado.close();
	}
}
