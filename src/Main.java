import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Jugador miJugadorUno = new Jugador("Ignacio", "Heim", 1.85,9);
		Jugador miJugadorDos =  new Jugador("Marcos", "Heim", 1.80,2);
		
		Jugador miJugadorTres = new Jugador("Gustavo", "Marcone", 1.92,1);
		Jugador miJugadorCuatro =  new Jugador("Marcelo", "Badia", 1.70,14);
		
		Jugador miJugadorCinco = new Jugador("Santiago", "Salomon", 1.89,1);
		Jugador miJugadorSeis = new Jugador("Ruben", "Lapaglia", 1.78,10);
		
		Jugador miJugadorSiete = new Jugador("Jose", "Arthur", 1.76,8);
		Jugador miJugadorOcho = new Jugador("Osvaldo", "Doyle", 1.90,4);
		
		Jugador miJugadorNueve = new Jugador("Luis", "Heim", 1.84,32);
		Jugador miJugadorDiez = new Jugador("Raul", "Heim", 1.78,7);
		
		Jugador miJugadorOnce = new Jugador("Fernando", "Gonzalez", 1.80,9);
		Jugador miJugadorDoce = new Jugador("Nestor", "Cafferatta", 1.74,3);
		
		Jugador miJugadorTrece = new Jugador("Facundo", "Aguirre", 1.91,5);
		Jugador miJugadorCatorce = new Jugador("Martin", "Poyo", 1.80,9);
		
		Jugador miJugadorQuince = new Jugador("Ignacio", "Stern", 1.85,0);
		Jugador miJugadorDieciseis = new Jugador("Mariano", "Ruiz", 1.93,12);
		
		// LISTA DE EQUIPOS
		
		Equipo miEquipoUno = new Equipo("Dunas Sol");
		miEquipoUno.agregarJugadores(miJugadorUno);
		miEquipoUno.agregarJugadores(miJugadorDos);
		
		Equipo miEquipoDos = new Equipo("Los Warriors");
		miEquipoDos.agregarJugadores(miJugadorTres);
		miEquipoDos.agregarJugadores(miJugadorCuatro);
		
		Equipo miEquipoTres=new Equipo("Los Corales");
		miEquipoTres.agregarJugadores(miJugadorCinco);
		miEquipoTres.agregarJugadores(miJugadorSeis);
		
		Equipo miEquipoCuatro=new Equipo("Sol Smashers");
		miEquipoCuatro.agregarJugadores(miJugadorSiete);
		miEquipoCuatro.agregarJugadores(miJugadorOcho);
		
		Equipo miEquipoCinco=new Equipo("Los Tritones ");
		miEquipoCinco.agregarJugadores(miJugadorNueve);
		miEquipoCinco.agregarJugadores(miJugadorDiez);
		
		Equipo miEquipoSeis=new Equipo("Marea Dorada");
		miEquipoSeis.agregarJugadores(miJugadorOnce);
		miEquipoSeis.agregarJugadores(miJugadorDoce);
		
		Equipo miEquipoSiete=new Equipo("Saltos de Sirena");
		miEquipoSiete.agregarJugadores(miJugadorTrece);
		miEquipoSiete.agregarJugadores(miJugadorCatorce);
		
		Equipo miEquipoOcho=new Equipo("Los Surfistas");
		miEquipoOcho.agregarJugadores(miJugadorQuince);
		miEquipoOcho.agregarJugadores(miJugadorDieciseis);
		
		// TORNEO
		
		GestorTorneo miTorneo = new GestorTorneo();
		miTorneo.agregarEquipos(miEquipoUno);
		miTorneo.agregarEquipos(miEquipoDos);
		miTorneo.agregarEquipos(miEquipoTres);
		miTorneo.agregarEquipos(miEquipoCuatro);
		miTorneo.agregarEquipos(miEquipoCinco);
		miTorneo.agregarEquipos(miEquipoSeis);
		miTorneo.agregarEquipos(miEquipoSiete);
		miTorneo.agregarEquipos(miEquipoOcho);
		
		
		//Llave miLlave = new Llave();
		
		String[][] miMatriz = new String[9][7];
		
		miMatriz[0][0] = miEquipoUno.datosEquipos();
		miMatriz[1][0] = miEquipoDos.datosEquipos();
		miMatriz[7][0] = miEquipoTres.datosEquipos();
		miMatriz[8][0] = miEquipoCuatro.datosEquipos();
		miMatriz[0][6] = miEquipoCinco.datosEquipos();
		miMatriz[1][6] = miEquipoSeis.datosEquipos();
		miMatriz[7][6] = miEquipoSiete.datosEquipos();
		miMatriz[8][6] = miEquipoOcho.datosEquipos();
		
		Partido miPartido= new Partido();
		Equipo ganadorTorneo = null;
		Equipo finalistaTorneo = null;
		
		System.out.println("Comenzar torneo (si/no)");
		String mensaje = s.next();
		
		while (!mensaje.equalsIgnoreCase("no")) {
			// LLAVE DEL TORNEO
			miTorneo.imprimirMatriz(miMatriz);
			System.out.println();
			System.out.println("**** COMEINZAN LOS DE CUARTOS DE FINAL ****");
			System.out.println();
			for (int i = 0; i < 4; i++) {
				System.out.println("PARTIDO NUMERO "+ (i+1));
				System.out.println();
				System.out.println("Seleccionar ID equipo #1: ");
				int primerEquipo = s.nextInt();
				System.out.println("Seleccionar ID equipo #2: ");
				int segundoEquipo = s.nextInt();
				int j = 0;
				while(j<3) {	
					System.out.println(miPartido.jugarSet(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo)));	
						
					if(Math.abs(miPartido.getSetGanadoEquipoUno() - miPartido.getSetGanadoEquipoDos()) >= 2) {
						break;
					}
					j++;
				}
				System.out.println(miPartido.mensajeEquipoGanador(miPartido.devolverEquipoGanador(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo))));
				System.out.println(miPartido.jugadorPuntos(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo)));				
				Equipo equipoPerdedor = miPartido.devolverEquipoPerdedor(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo));
				miTorneo.eliminarEquipo(equipoPerdedor);
				System.out.println();
				miPartido.establecerSetGandosEquipoUno(0);
				miPartido.establecerSetGandosEquipoDos(0);
				miPartido.establecerSetPuntosJugadorUno(0);
				miPartido.establecerSetPuntosJugadorDos(0);
				miPartido.establecerSetPuntosJugadorTres(0);
				miPartido.establecerSetPuntosJugadorCuatro(0);
			}
			System.out.println("COMIENZA LA SEMIFINAL:");
			miMatriz[2][1] = miTorneo.seleccionarEquipo(0).datosEquipos();
			miMatriz[6][1] = miTorneo.seleccionarEquipo(1).datosEquipos();
			miMatriz[2][5] = miTorneo.seleccionarEquipo(2).datosEquipos();
			miMatriz[6][5] = miTorneo.seleccionarEquipo(3).datosEquipos();
			miTorneo.imprimirMatriz(miMatriz);
			for (int i = 0; i < 2; i++) {
				System.out.println("SEMIFINAL NUMERO "+ (i+1));
				System.out.println();
				System.out.println("Seleccionar ID equipo #1: ");
				int primerEquipo = s.nextInt();
				System.out.println("Seleccionar ID equipo #2: ");
				int segundoEquipo = s.nextInt();
				int j = 0;
				while(j<3) {	
					System.out.println(miPartido.jugarSet(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo)));	
					if(Math.abs(miPartido.getSetGanadoEquipoUno() - miPartido.getSetGanadoEquipoDos()) >= 2) {
						break;
					}
					j++;
				}
				System.out.println(miPartido.mensajeEquipoGanador(miPartido.devolverEquipoGanador(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo))));
				System.out.println(miPartido.jugadorPuntos(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo)));
				Equipo equipoPerdedor = miPartido.devolverEquipoPerdedor(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo));
				miTorneo.eliminarEquipo(equipoPerdedor);
				System.out.println();
				miPartido.establecerSetGandosEquipoUno(0);
				miPartido.establecerSetGandosEquipoDos(0);
				miPartido.establecerSetPuntosJugadorUno(0);
				miPartido.establecerSetPuntosJugadorDos(0);
				miPartido.establecerSetPuntosJugadorTres(0);
				miPartido.establecerSetPuntosJugadorCuatro(0);
			}
			System.out.println("COMIENZA LA GRAN FINAL:");
			miMatriz[4][2] = miTorneo.seleccionarEquipo(0).datosEquipos();
			miMatriz[4][4] = miTorneo.seleccionarEquipo(1).datosEquipos();
			miTorneo.imprimirMatriz(miMatriz);
			for (int i = 0; i < 1; i++) {				
				System.out.println("Seleccionar ID equipo #1: ");
				int primerEquipo = s.nextInt();
				System.out.println("Seleccionar ID equipo #2: ");
				int segundoEquipo = s.nextInt();
				int j = 0;
				while(j<3) {	
					System.out.println(miPartido.jugarSet(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo)));	
					if(Math.abs(miPartido.getSetGanadoEquipoUno() - miPartido.getSetGanadoEquipoDos()) >= 2) {
						break;
					}
					j++;
				}
				System.out.println(miPartido.mensajeEquipoGanador(miPartido.devolverEquipoGanador(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo))));
				System.out.println(miPartido.jugadorPuntos(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo)));
				System.out.println(miPartido.mensajeEquipoGanadorTorneo(miPartido.devolverEquipoGanador(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo))));
				System.out.println();
				ganadorTorneo = miPartido.devolverEquipoGanador(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo));
				finalistaTorneo = miPartido.devolverEquipoPerdedor(miTorneo.miEquipo(primerEquipo), miTorneo.miEquipo(segundoEquipo));
				miPartido.establecerSetGandosEquipoUno(0);
				miPartido.establecerSetGandosEquipoDos(0);
				miPartido.establecerSetPuntosJugadorUno(0);
				miPartido.establecerSetPuntosJugadorDos(0);
				miPartido.establecerSetPuntosJugadorTres(0);
				miPartido.establecerSetPuntosJugadorCuatro(0);
			}

			miMatriz[3][3] = ganadorTorneo.datosEquipos();
			miMatriz[5][3] = finalistaTorneo.datosEquipos();
			
			miTorneo.imprimirMatriz(miMatriz);
			
			System.out.println("Desea jugar un nuevo torneo? (si/no)");
			miMatriz[0][0] = miEquipoUno.datosEquipos();
			miMatriz[1][0] = miEquipoDos.datosEquipos();
			miMatriz[7][0] = miEquipoTres.datosEquipos();
			miMatriz[8][0] = miEquipoCuatro.datosEquipos();
			miMatriz[0][6] = miEquipoCinco.datosEquipos();
			miMatriz[1][6] = miEquipoSeis.datosEquipos();
			miMatriz[7][6] = miEquipoSiete.datosEquipos();
			miMatriz[8][6] = miEquipoOcho.datosEquipos();
			miPartido.establecerSetGandosEquipoUno(0);
			miPartido.establecerSetGandosEquipoDos(0);
			miPartido.establecerSetPuntosJugadorUno(0);
			miPartido.establecerSetPuntosJugadorDos(0);
			miPartido.establecerSetPuntosJugadorTres(0);
			miPartido.establecerSetPuntosJugadorCuatro(0);
			miTorneo.eliminarEquipo(miEquipoUno);
			miTorneo.eliminarEquipo(miEquipoDos);
			miTorneo.eliminarEquipo(miEquipoTres);
			miTorneo.eliminarEquipo(miEquipoCuatro);
			miTorneo.eliminarEquipo(miEquipoCinco);
			miTorneo.eliminarEquipo(miEquipoSeis);
			miTorneo.eliminarEquipo(miEquipoSiete);
			miTorneo.eliminarEquipo(miEquipoOcho);			
			miTorneo.agregarEquipos(miEquipoUno);
			miTorneo.agregarEquipos(miEquipoDos);
			miTorneo.agregarEquipos(miEquipoTres);
			miTorneo.agregarEquipos(miEquipoCuatro);
			miTorneo.agregarEquipos(miEquipoCinco);
			miTorneo.agregarEquipos(miEquipoSeis);
			miTorneo.agregarEquipos(miEquipoSiete);
			miTorneo.agregarEquipos(miEquipoOcho);
			miMatriz[2][1] = "";
			miMatriz[6][1] = "";
			miMatriz[2][5] = "";
			miMatriz[6][5] = "";
			miMatriz[4][2] = "";
			miMatriz[4][4] = "";
			miMatriz[3][3] = "";
			miMatriz[5][3] = "";
			mensaje = s.next();
		}
	}

}
