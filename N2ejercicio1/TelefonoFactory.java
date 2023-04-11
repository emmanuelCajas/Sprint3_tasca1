package Tasca1.N2ejercicio1;

public class TelefonoFactory implements AbstractFactory {

	@Override
	public ITelefono getTelefono(String telefono) {
		if(telefono == null) {
			System.out.println("No se encontro pais");
		}
		
		if(telefono.equalsIgnoreCase("Peru")) {
			return new PeruTelefono();
		}else if(telefono.equalsIgnoreCase("España")) {
			return new EspañaTelefono();
		}
		
		return null;
	}

	@Override
	public IDireccion getDireccion(String direccion) {
		return null;
	}

}
