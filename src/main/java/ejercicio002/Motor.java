package ejercicio002;

public class Motor {
	
	public int potencia() {
		int potenciaRandom = (int) Math.floor(Math.random()*(40-20+1)+20);
		return potenciaRandom;
	}
}
