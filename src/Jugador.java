
public class Jugador {

	private int id;
	private static int idSiguiente;
	private String nombre;
	private String apellido;
	private double altura;
	private int numero;
	
	//CONSTRUCTOR
	public Jugador(String nombre, String apellido, double altura, int numero) {
		this.id=idSiguiente;
		this.nombre=nombre;
		this.apellido=apellido;
		this.altura=altura;
		this.numero=numero;
		idSiguiente++;
	}
	
	//GETTERS 
	public String getNombre() {
		return this.nombre;		
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getId() {
		return this.id;
	}
	
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	
	public void setAltura(double altura) {
		this.altura=altura;
	}
	
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	@Override
	public String toString() {
		return "Ficha tecnica: \nNombre y apellido: "+this.nombre + " " + this.apellido+".\nAltura: "+this.altura+"\nNumero: "+this.numero;
	}
	
}
