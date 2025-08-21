package clase1;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result, numero, edad = 16, caso = 12; //variables enteras
		char sexo = 'f'; //datos char se guardan con una sola comilla
		boolean flag = false; //variables logicas, solo dos, verdadero o falso
		double precio = 45.4;
		float cantidad = 77.7f;
		String nombre = "Alejandra";
		
		System.out.println("Hola mi nombre es "+ nombre + " y tengo "+ edad + " años, y comprè a Memo por: " + precio);
		
		Scanner captura = new Scanner(System.in);
		boolean ext = true;
		while (ext == true) {
			System.out.println("Selecciona una opciòn");
			System.out.println("Suma 1");
			System.out.println("Resta 2");
			System.out.println("Salir 3");
			int opp = captura.nextInt();
			
			switch(opp){
				case 1: 
					System.out.println("Valor 1");
					int num1 = captura.nextInt();
					System.out.println("Valor 2");
					int num2 = captura.nextInt();
					result = num1+num2;
					System.out.println("Resultado "+ result);
				break;
				case 2:
					System.out.println("Valor 1");
					num1 = captura.nextInt();
					System.out.println("Valor 2");
					num2 = captura.nextInt();
					result = num1-num2;
					System.out.println("Resultado "+ result);
				break;
				case 3:
					ext = false;
				break;
			
			}	
		}
	}
}
