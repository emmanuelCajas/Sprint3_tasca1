package Tasca1.N1ejercicio1;

import java.util.ArrayList;

public class Undo {

	private static Undo instance;
	private ArrayList<String> comandos;
	
	private Undo(){
		this.comandos=new ArrayList<String>();
	}
	
	public static Undo getInstance(){
		if(instance==null) {
			instance = new Undo();
		}
		return instance;
	}
		
	public void  agregarComando(String  comando) {
			this.comandos.add(comando);
	}
	
	public void eliminarComando() {
			this.comandos.remove(comandos.size()-1);
	}
	
	public void listarComandos() {
		for (String string : comandos) {
			System.out.println(string);
		};
	}
	
}
