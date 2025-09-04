package super_clase;

public class Auto {
	int cantidad_puertas;
	String color;
	int velocidades;
	String motor;
	//Constructor
	public Auto(int cant_puertas, String color) {
		this.color = color;
		this.cantidad_puertas = cant_puertas;
	}
	
	public void avanza() {
		//no retorna nada
		System.out.println("El auto esta avanzando...");
	}
	
	public double reversa(double revo) {
		//retorna el valor que pongas despues de public
		double velocidad = 2.5, resultado;
		resultado = velocidad * revo;
		return resultado;
	}
	
	public static void main(String[] args) {
		Auto auto = new Auto(4, "Amarillo");
		System.out.println(auto.color);
		auto.avanza();
		double velo = auto.reversa(8.8);
		System.out.println("Velocidad "+ velo);
	}
}
