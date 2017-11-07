import java.util.*;
public class T4Hoja1ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		int num1, indice;
		int v1[] = new int[80];
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Frase en mayusculas");
		frase = teclado.nextLine();
		while (frase.equals(frase.toUpperCase()) == false){
			System.out.println("Frase en mayusculas");
			frase = teclado.nextLine();
		}//while
		System.out.println("Numero de 1 a 10?");
		num1 = teclado.nextInt();
		while (num1 <= 0 || num1 > 10){
			System.out.println("Numero?");
			num1 = teclado.nextInt();
		}//while
		for (indice = 0; indice < frase.length(); indice++){
			v1[indice] = v1[indice] + num1;
		}//for
		for (indice = 0; indice < frase.length(); indice ++){
			System.out.println(v1[indice]);//NO VA, cambio a ascii?
		}
	}//main

}//class
