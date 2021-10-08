package com.company;

public class Menu {

    Jugador jugador1 , jugador2;

    public Menu(Jugador jugador1 , Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    String menuInicio = "███    ███ ███████ ███    ██ ██    ██ \n" +
                        "████  ████ ██      ████   ██ ██    ██ \n" +
                        "██ ████ ██ █████   ██ ██  ██ ██    ██ \n" +
                        "██  ██  ██ ██      ██  ██ ██ ██    ██ \n" +
                        "██      ██ ███████ ██   ████  ██████ \n";

    String menuJuegos = "1. DADOS\n" + "2. 3 EN RAYA\n" + "3. PARXIS\n" + "4. SALIR";


    String pedirJugador1 = "Hola jugador 1, escribe tu nombre: ";
    String PedirJugador2 = "Hola jugador 2, escribe tu nombre: ";
    String menuJugador1 = "--TE TOCA--" + jugador1.nombre + "-----\n1 -> Tirar dados.\n2 -> Salir";
    String menuJugador2 = "--TE TOCA--" + jugador2.nombre + "-----\n1 -> Tirar dados.\n2 -> Salir";

    String ganaJugador1 = jugador1.nombre + " GANA!";
    String ganaJugador2 = jugador2.nombre + " GANA!";
    String empatan = "EMPATE!";
}
