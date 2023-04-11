package Tasca1.N2ejercicio1;

public class App {

	public static void main(String[] args) {

		
		AbstractFactory abstractFactory = FactoryProducer.getFactory("telefono");	
		ITelefono iTelefono = abstractFactory.getTelefono("Peru");

		AbstractFactory abstractFactory1 = FactoryProducer.getFactory("direccion");	
		IDireccion iDireccion = abstractFactory1.getDireccion("Peru");
				
			String nombre = "Juan Castillo";
			String direccion = "Lima";
			String pais = "Peru";
			String phone = "327212354";
	


		System.out.println(nombre + ", " + direccion  + ", " + "Codigo Postal: " + iDireccion.formatoDireccion() 
		+ " phone: " + iTelefono.formatoTelefono() + phone);
	}

}
