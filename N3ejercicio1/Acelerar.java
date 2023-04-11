package Tasca1.N3ejercicio1;

public class Acelerar implements IOperacion{

	private Vehiculo vehiculo;
	
	public Acelerar(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public void excecute() {
		this.vehiculo.acelerar();
	}

}
