OBJETIVO

Armar un torneo de vóley playa que cuente con 8 equipos y dos jugadores por equipo. El resultado tiene que ser un equipo ganador.

EXPLICACION DEL CODIGO

Para el desarrollo de la consigna, se decidió utilizar Scanner por un motivo visual. Los cruces entre los equipos se muestran con una matriz doble, que permite ir indicando cual es el equipo que pasó a la siguiente fase. El resultado final es un equipo ganador
El ganador entre los cruces entre los equipos, se va decidiendo a través de la implementación de un número random entre 0 y 1.000, el cual si es par, se le asigna al equipo numero uno; caso contrario al equipo dos. A la vez, se crea una lógica para asignar los puntos de cada jugador, los cuales hacen referencia a la clase Jugador.

CLASES

El final se compone de cuatro clases y una interfaz: Jugador, Equipo, GestorTorneo, Partido y Braket, siendo esta ultima la interfaz que implementa GestorTorneo.

	A. Jugador
	
	Esta clase crea el jugador, asignado, id, nombre, apellido, dorsal, altura, junto a sus getters y setter y una clase toString().

	B. Equipo

	Esta clase crea el equipo y asigna a los jugadores, indicándonoslas id del equipo, nombre del equipo y en un ArrayList de la clase Jugador, se los jugadores, con el método “add”. 
	Además de los getter y setters, se crean tres métodos más para obtener los datos de un equipo, 	elegir un equipo y elegir un jugador.

	C. Gestor Torneo

	Agrupa a los equipos en un ArrayList de Equipo. Cuenta con los métodos de agregar equipo, eliminar equipo, ver los equipos, seleccionar un equipo y el métodos imprimirMatriz, el cual se implementa de la interfaz Braket.

	D. Partido

	La clase mas importante del programa, cuenta con los atributos de setGanados por equipo y puntosJugador por equipo. 
	El método jugarSet es el más importante de la clase y del programa, ya que decide qué equipo ganó el set y luego el partido. La lógica para decidir quién ganó el set es determinar si el número random que crea el método Random de la clase Math, es par o impar, utilizándoselo el módulo del número. La condición de corte, dentro de un bucle while es que algún equipo logre los 21 puntos, siempre y cuando la diferencia sea de 2 puntos, sino el contador sigue hasta que llegue a haber esta diferencia. Para esto se utiliza el método Abs de la clase Matt. Una vez que un equipo logre ganar los 	set correspondientes al mejor de tres, el equipo será el ganador. 
	A su vez, hay un contador de puntos por jugador por equipo, el cual tiene la lógica de ir asignado el punto al primer jugador del equipo numero uno, si el numero random es menor que 500 o al siguiente jugador del equipo, si el número s superior a 500. Lo mismo sucede con el equipo numero dos.
	

USO DEL PROGRAMA - CLASE MAIN

Para facilitar el uso del programa, ya se instancian los jugadores y los equipo. Una vez ejecutada la clase main, se debe ir eligiendo los equipos por su ID correspondiente. Luego el programa irá indicando que equipo ganó el partido y los puntos que ha convertido cada jugador. Se indicará al final el equipo ganador del torneo.
Por ultimo, se podrá volver a comenzar el torneo las veces que se desee, ya que toda la lógica se encuentra dentro de un bucle while.
