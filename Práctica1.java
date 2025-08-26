import java.util.Scanner;
public class Práctica1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];
        double[] raicesPares = new double[15];
        int[] valoresPares = new int[15]; // Para guardar el valor original
        int negativos = 0;
        int sumaImpares = 0;
        int conteoImpares = 0;
        int conteoRaices = 0;

        // 1. Pedir 15 números
        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            // 2a. Raíz cuadrada de pares positivos
            if (numeros[i] > 0 && numeros[i] % 2 == 0) {
                raicesPares[conteoRaices] = Math.sqrt(numeros[i]);
                valoresPares[conteoRaices] = numeros[i];
                conteoRaices++;
            }

            // 2b. Contar negativos
            if (numeros[i] < 0) {
                negativos++;
            }

            // 2c. Promedio de impares
            if (numeros[i] % 2 != 0) {
                sumaImpares += numeros[i];
                conteoImpares++;
            }
        }

        // 3a. Mostrar raíces cuadradas
        System.out.println("\nRaíces cuadradas de números pares positivos:");
        if (conteoRaices == 0) {
            System.out.println("No hay números pares positivos.");
        } else {
            for (int i = 0; i < conteoRaices; i++) {
                System.out.printf("raiz cuadrada de %d es: %.2f\n", valoresPares[i], raicesPares[i]);
            }
        }

        // 3b. Mostrar total de negativos
        System.out.println("Total de números negativos: " + negativos);

        // 3c. Mostrar promedio de impares
        if (conteoImpares == 0) {
            System.out.println("No hay números impares.");
        } else {
            double promedio = (double) sumaImpares / conteoImpares;
            System.out.printf("Promedio de números impares: %.2f\n", promedio);
        }
    }
}