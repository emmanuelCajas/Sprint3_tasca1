package Tasca1.N3ejercicio1;

public class Bicicleta extends Vehiculo{

	@Override
	public void acelerar() {
		System.out.println("Bicicleta esta acelerando");
		
	}

	@Override
	public void arrancar() {
		System.out.println("Bicicleta Arranco");
	}

	@Override
	public void frenar() {
		System.out.println("Bicicleta esta frenando");
	}
}
