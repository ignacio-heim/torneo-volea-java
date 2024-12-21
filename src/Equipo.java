import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Equipo {
	//ATRIBUTOS
	private int id;
	public static int idSiguiente = 1;
	private String nombre;
	private ArrayList<Jugador> misJugadores;
	
	//GETTERS Y SETTERS
	public Equipo(String nombre) {
		this.id = idSiguiente;
		this.nombre=nombre;
		this.misJugadores=new ArrayList<>();
		idSiguiente++;
	}
	
	//GETTERS Y SETTERS
	public int getId() {
		return this.id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	//AGREGAR JUGADORES AL EQUIPO
	public void agregarJugadores(Jugador miJugador) {
		misJugadores.add(miJugador);
	}
	
	//EQUIPO Y ID
	public String datosEquipos() {
		return this.id +" "+getNombre();
	}
	
	public Equipo elegirEquipo(int id) {
		Equipo miEquipo = null;
		if (getId()==id) {
			return miEquipo;
		}
		return null; 
	}
	
	//ELEGIR UN JUGADOR
	public Jugador elegirJugador(int id) {
		return misJugadores.get(id);
	}
	
}
