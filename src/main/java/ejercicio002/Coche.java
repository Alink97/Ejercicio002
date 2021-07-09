package ejercicio002;

public class Coche {
	
	private Motor engine = new Motor();
	
	public int arrancar() {
		int potencia;
		potencia = engine.potencia();
		potencia = potencia * 7;
		return potencia;
	}
}
