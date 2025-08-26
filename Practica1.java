package practica_1;

import java.util.Scanner;

public class Practica1 {
	
	public static void main(String[] args) {
	
	int[] numeros = new int[15];
	int x, contador_neg = 0, promedio = 0, fin = 0, y =0;
	
	Scanner captura = new Scanner(System.in);
	
	System.out.println("Escribe 14 valores");
	for(x = 0; x < 16; x++) {
		int num;
		System.out.println("Dame el valor: "+ x);
		num = captura.nextInt();
		numeros[x] = num;
		}
	System.out.println("Estos son los resultados:");
	for(int i = 0; i < numeros.length; i ++) {
		//String n = numeros[i] %2 == 0 ? "hola" : "no"; (if "cortito" segun Soraya)
		if (numeros[i] %2 == 0) {
			double raiz;
			raiz = Math.sqrt(numeros[i]);
			if (raiz == (int) raiz && numeros[i]>0) {
				System.out.println("La raiz cuadrada de "+ numeros[i]+" es  "+(int)raiz);
			}
		}
	}
		System.out.println(" ");
		for(int i = 0; i<numeros.length; i++) {
			if (numeros[i] < 0) {
				contador_neg++;
			}
		}
		System.out.println("Total de numeros negativos"+ contador_neg);
		for(int i=0; i>numeros.length; i++) {
			if (numeros[i] != 0) {
				promedio += numeros[i];
				y++;
			}
		}
		if (fin == 0) {
			System.out.println("No hay numeros impares");
		}
		else {
			fin = promedio/y;
			System.out.println(" ");
			System.out.println("Promedio de numeros impares: "+ fin);
		}
	}
}
