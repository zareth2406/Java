package ejercicios_pseudocodigo;

import java.util.Scanner;

public class Ejercicios_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner captura = new Scanner(System.in);
		
		//Calificaciones
		float num1, num2, num3, promedio;
		System.out.println("Ingrese la primera calificacion:");
		num1 = captura.nextFloat();
		System.out.println("Ingrese la segunda calificacion:");
		num2 = captura.nextFloat();
		System.out.println("Ingrese la tercera calificacion:");
		num3 = captura.nextFloat();
		promedio = (num1+num2+num3)/3;
		if (promedio >= 6) {
			System.out.println("Aprobado con: "+ String.format("%.1f", promedio));
		} else if (promedio < 6) {
			System.out.println("Reprobado con: "+ String.format("%.1f", promedio));
		} else {System.out.println("ERROR");}
		
		//Edades
		int edad;
		System.out.println("Ingrese su edad: ");
		edad = captura.nextInt();
		if (edad <= 12){
			System.out.println("Niño de "+ (int)edad + " años");
	    } else if (edad > 12 && edad < 59){
	    	System.out.println("Adulto de "+ (int)edad + " años");
	    } else if (edad >= 59){
	    	System.out.println("Adulto mayor de "+ (int)edad + " años");
	    } else { System.out.println("ERROR");}
		
		//Sueldo
		int horas, sueldo, extras, sueldotot;
		System.out.println("Ingrese las horas trabajadas:");
	    horas = captura.nextInt();
	    if (horas <= 40){
	        sueldo = horas * 150;
	        System.out.println("Su sueldo es de: $" + sueldo + " pesos");
	    } else if (horas > 40){
	        extras = (horas - 40)*300;
	        sueldo = 6000;
	        sueldotot = sueldo + extras;
	        System.out.println("Su sueldo es de: $" + sueldotot + " pesos");
	    } else { System.out.println("ERROR");}
		
	    //Calificacion a letra
	    int calf;
	    System.out.println("Ingrese una calificacion del 1 al 100: ");
	    calf = captura.nextInt();
	    if (calf <= 100 && calf >= 90){
	    	System.out.println("Calificacion: A");
	    } else if (calf <= 89 && calf >= 80){
	    	System.out.println("Calificacion: B");
	    } else if (calf <= 79 && calf >= 70){
	    	System.out.println("Calificacion: C");
	    } else if (calf <= 69 && calf >= 60){
	    	System.out.println("Calificacion: D");
	    } else if (calf < 60){
	    	System.out.println("Calificacion: E");
	    } else {System.out.println("ERROR");}

	}
}