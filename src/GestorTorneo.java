import java.util.ArrayList;
import java.util.Iterator;

public class GestorTorneo implements Bracket{

	private ArrayList<Equipo> misEquipos;
	
	
	public GestorTorneo() {
		this.misEquipos=new ArrayList<>();
	}
	
	//AGREGAR EQUIPO AL TORNEO
	public void agregarEquipos(Equipo miEquipo) {
		misEquipos.add(miEquipo);
	}
	
	//EQUIPO ELIMINADO
	public void eliminarEquipo(Equipo miEquipo) {
		misEquipos.remove(miEquipo);
	}
	
	// VER EQUIPOS
	public void verEquipos() {
		for (Equipo equipo : misEquipos) {
			System.out.println(equipo.getNombre());
		}
	}
	
	public Equipo miEquipo(int id){
		for (Equipo equipo : misEquipos) {
			if (equipo.getId()==id) {
				return equipo;
			}
		}
		return null;
	}
	
	public Equipo seleccionarEquipo(int index) {
		return misEquipos.get(index);
		
	}
	
	@Override
	public void imprimirMatriz(String[][] matriz) {
		for (String[] fila : matriz) {
            for (String elemento : fila) {              
                System.out.print((elemento != null ? elemento : "") + "\t");
            }
            System.out.println();
        }
	}
	
}
