package Tasca1.N3ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Invoker {


	private List<IOperacion> operaciones = new ArrayList<>();

	public void recibirOperacion(IOperacion operacion) {
		this.operaciones.add(operacion);
	}

	public void realizarOperaciones() {
		this.operaciones.forEach(x -> x.excecute());
		this.operaciones.clear();
	}
}
