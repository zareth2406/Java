package Practica_2;

import java.util.Scanner;

public class Practica_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1, x2, x3, y1, y2, y3;
		double ab, bc, ca;
		
		Scanner captura = new Scanner(System.in);
		
		System.out.println("Ingresa las coordenadas del punto A:");
		System.out.println("X1: ");
		x1 = captura.nextDouble();
		System.out.println("Y1: ");
		y1 = captura.nextDouble();
		
		System.out.println("Ingresa las coordenadas del punto B:");
		System.out.println("X2: ");
		x2 = captura.nextDouble();
		System.out.println("Y2: ");
		y2 = captura.nextDouble();
		
		System.out.println("Ingresa las coordenadas del punto C:");
		System.out.println("X3: ");
		x3 = captura.nextDouble();
		System.out.println("Y3: ");
		y3 = captura.nextDouble();
		
		ab = Math.sqrt(Math.pow(x2 - x1,  2) + Math.pow(y2 - y1, 2));
		bc = Math.sqrt(Math.pow(x3 - x2,  2) + Math.pow(y2 - y1, 2));
		ca = Math.sqrt(Math.pow(x1 - x3,  2) + Math.pow(y2 - y1, 2));
		
		System.out.println("Lado AB: "+ ab);
		System.out.println("Lado BC: "+ bc);
		System.out.println("Lado CA: "+ ca);
		
		if (ab == bc && ca == bc && ab == ca){
			System.out.println("Tu triangulo es equilatero");
		}
		
		if (ab == bc || bc == ca || ca == ab) {
			System.out.println("Tu triangulo es isoceles");
		}
		
		if (ab != bc && ab != ca && bc != ca) {
			System.out.println("Tu triangulo es escaleno");
		}
		
		if (ab == 0 && bc == 0 && ca == 0) {
			System.out.println("Eso no es un triangulo");
		}
		
	}

}
