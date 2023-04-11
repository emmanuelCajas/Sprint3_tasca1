package Tasca1.N2ejercicio1;

public class FactoryProducer {
	

	public static AbstractFactory getFactory(String type) {
		if (type.equalsIgnoreCase("telefono")) {
			return new TelefonoFactory();
		} else if (type.equalsIgnoreCase("direccion")) {
			return new DireccionFactory();
		}
		return null;
	}
	
}
