
public class Vectoresej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v[][] = new double [5][5];
		int posFila, posCol, fila, col;
		for (fila = 0; fila < 5; fila++){
			for(col = 0; col < 5; col++){
				v[fila][col] = (int)Math.floor(Math.random() * 201 - 100);
			}//for
		}//for
		
	}//main

}//class
