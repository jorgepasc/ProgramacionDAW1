import java.util.*;
public class Vectoresej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v[][] = new double [10][10], sumaFila, sumaCol;
		int fila, col;
		
		for( fila = 0; fila < 10; fila ++){
			for (col = 0; col < 10; col ++){
			//v[fila][col] = (int)Math.floor(Math.random() * 11 -5);
				v[fila][col] = Math.floor(Math.random() * 11 -5);
			}
		}//for
		for (fila = 0; fila < 10; fila++) {
			sumaFila=0;
			for (col = 0; col < 10; col ++){
				//sumaFila = sumaFila + (int)v[fila][col];
				sumaFila = sumaFila + v[fila][col];
				System.out.printf("%8.0f", v[fila][col]);
			}//for
			System.out.printf("%12.0f", sumaFila);
			System.out.println("");
		}//for
		System.out.println("");
		for (col = 0; col < 10; col ++) {
			sumaCol=0;
			for( fila = 0; fila < 10; fila ++){
				sumaCol = sumaCol + v[fila][col];
			}//for
			
			System.out.printf("%8.0f", sumaCol);
		}//for
		
	}//main

}//class
