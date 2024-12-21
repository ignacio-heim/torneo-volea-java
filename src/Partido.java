import java.util.ArrayList;

public class Partido {
	
	private int setGanadoEquipoUno=0;
	private int setGanadoEquipoDos=0;
	private int puntosJugadorUno=0;
	private int puntosJugadorDos=0;
	private int puntosJugadorTres=0;
	private int puntosJugadorCuatro=0;	 
	
	public Partido() {
	}
	
	public String jugarSet(Equipo equipoUno, Equipo equipoDos) {
		int puntosEquipoUno=0;
		int puntosEquipoDos=0;	
	
		while (true) {
			int numRan = (int) (Math.random()*1000);
	        if (numRan % 2 ==0) {
	            puntosEquipoUno++;
	            if(numRan<500) {
	            	puntosJugadorUno++;            		            	
	            } else {	
	            	puntosJugadorDos++;
	            }
	        } else {
	            puntosEquipoDos++;
	            if(numRan<500) {
	            	puntosJugadorTres++;            		            	
	            } else {	
	            	puntosJugadorCuatro++;
	            }
	        }

	        if ((puntosEquipoUno >= 21 || puntosEquipoDos >= 21) && 
	            Math.abs(puntosEquipoUno - puntosEquipoDos) >= 2) {
	        		if(puntosEquipoUno>puntosEquipoDos) {
	        			setGanadoEquipoUno++;
	        		} else {
	        			setGanadoEquipoDos++;	        			
	        		}
	            break;
	        }

	        if (puntosEquipoUno >= 20 && puntosEquipoDos >= 20 && 
	            Math.abs(puntosEquipoUno - puntosEquipoDos) >= 2) {
		        	if(puntosEquipoUno>puntosEquipoDos) {
	        			setGanadoEquipoUno++;	        			
	        		} else {
	        			setGanadoEquipoDos++;	        			
	        		}
	            break;
	        }
	        
		}
		
		String mensaje = (puntosEquipoUno>puntosEquipoDos) ? "El ganador del set fue "+equipoUno.getNombre()+". El resultado fue: "+ puntosEquipoUno +"-"+puntosEquipoDos:"El ganador del set fue "+equipoDos.getNombre()+". El resultado fue: "+ puntosEquipoDos +"-"+puntosEquipoUno;
		return mensaje;
		
	}
	//GETTERS
	
	public int getSetGanadoEquipoUno() {
		return this.setGanadoEquipoUno;
	}
	
	
	public int getSetGanadoEquipoDos() {
		return this.setGanadoEquipoDos;
	}
	
	
	//SETTERS
	public void establecerSetGandosEquipoUno(int i) {
		this.setGanadoEquipoUno=i;
	}
	public void establecerSetGandosEquipoDos(int i) {
		this.setGanadoEquipoDos=i;
	}
	
	public void establecerSetPuntosJugadorUno(int i) {
		this.puntosJugadorUno=i;
	}
	
	public void establecerSetPuntosJugadorDos(int i) {
		this.puntosJugadorDos=i;
	}
	
	public void establecerSetPuntosJugadorTres(int i) {
		this.puntosJugadorTres=i;
	}
	
	public void establecerSetPuntosJugadorCuatro(int i) {
		this.puntosJugadorCuatro=i;
	}

	
	public Equipo devolverEquipoGanador(Equipo equipoUno, Equipo equipoDos) {
		if(this.getSetGanadoEquipoUno()>this.getSetGanadoEquipoDos()) {
			return equipoUno;
		} else {
			return equipoDos;
		}
	}
	
	public Equipo devolverEquipoPerdedor(Equipo equipoUno, Equipo equipoDos) {
		if(this.getSetGanadoEquipoUno()<this.getSetGanadoEquipoDos()) {
			return equipoUno;
		} else {
			return equipoDos;
		}
	}
	
	
	public String mensajeEquipoGanador(Equipo equipoGanador) {
		return "\nEl equipo ganador fue "+equipoGanador.getNombre();
	}
	
	public String mensajeEquipoPerdedor(Equipo equipoPerdedor) {
		return "El equipo perdedor fue "+equipoPerdedor.getNombre();
	}
	
	public String mensajeEquipoGanadorTorneo(Equipo equipoGanador) {
		return "\nEl equipo ganador del torneo fue "+equipoGanador.getNombre();
	}
	
	
	public String jugadorPuntos(Equipo miEquipoUno, Equipo miEquipoDos) {
		return "\nESTADISTICAS DEL PARTIDO\nEquipo Uno: "+miEquipoUno.getNombre().toUpperCase()+". El jugador "+miEquipoUno.elegirJugador(0).getNombre()+" "+miEquipoUno.elegirJugador(0).getApellido() +" convirtió "+puntosJugadorUno+". El jugador "+ miEquipoUno.elegirJugador(1).getNombre()+" "+miEquipoUno.elegirJugador(1).getApellido()+" convirtio "+puntosJugadorDos
				
				+"\nEquipo Dos: "+miEquipoDos.getNombre().toUpperCase()+". El jugador "+miEquipoDos.elegirJugador(0).getNombre()+" "+miEquipoDos.elegirJugador(0).getApellido() +" convirtió "+puntosJugadorTres+". El jugador "+ miEquipoDos.elegirJugador(1).getNombre()+" "+miEquipoDos.elegirJugador(1).getApellido()+" convirtio "+puntosJugadorCuatro;
	}
	
}
