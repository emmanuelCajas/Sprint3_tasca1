package Tasca1.N3ejercicio1;

public class Frenar implements IOperacion{

	private Vehiculo vehiculo;
	
	public Frenar(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public void excecute() {
		this.vehiculo.frenar();
	}

}
