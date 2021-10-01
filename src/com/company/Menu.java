package com.company;

public class Menu {

    Jugador jugador1 , jugador2;

    public Menu(Jugador jugador1 , Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    String pedirJugador1 = "Hola jugador 1, escribe tu nombre: ";
    String PedirJugador2 = "Hola jugador 2, escribe tu nombre: ";
    String menuJuego1 = "-----" + jugador1.nombre + "-----\n1 -> Tirar dados.\n2 -> Salir";
    String MenuJuego2 = "-----" + jugador2.nombre + "-----\n1 -> Tirar dados.\n2 -> Salir";
}
