package Tasca1.N1ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean salir = false;
		Scanner menu = new Scanner(System.in);
	
		do {

			System.out.println("1. Agregar pedidos" + "\n" + 
							   "2. Eliminar pedido" + "\n" +
							   "3. Listar pedidos" + "\n"+
							   "4. Salir" + "\n");

			int opcion = Integer.parseInt(menu.nextLine());
			String nuevoComando;
			switch (opcion) {
			case 1:
				System.out.println("Ingrese el nuevo comando: " + "\n" );
				nuevoComando=menu.nextLine();				
				Undo.getInstance().agregarComando(nuevoComando);
				System.out.println("El comando " +nuevoComando +"ha sido agregado a la lista" + "\n" );
				break;
			case 2:
				Undo.getInstance().eliminarComando();
				break;
			case 3:
				Undo.getInstance().listarComandos();
				break;
			case 4:
				salir = true;
				System.out.println("Gracias..." + "\n");
				break;
			}
		} while (!salir);


	}

}
