package Tasca1.N2ejercicio1;

public class DireccionFactory implements AbstractFactory {

	@Override
	public ITelefono getTelefono(String telefono) {
		return null;
	}

	@Override
	public IDireccion getDireccion(String direccion) {

		if(direccion == null) {
			System.out.println("no se encontro pais");
		}
		if(direccion.equalsIgnoreCase("Peru")) {
			return new PeruDireccion();
		}else if (direccion.equalsIgnoreCase("España")) {
			return new EspañaDireccion();
		}
		
		
		return null;
	}

}
