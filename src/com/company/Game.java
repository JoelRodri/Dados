package com.company;

import java.awt.*;
import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();
    Menu menu = new Menu(jugador1 , jugador2);


    Dau dau1 = new Dau();
    int valorDau1;

    Dau dau2 = new Dau();
    int valorDau2;

    Dau dau3 = new Dau();
    int valorDau3;

    void juego(){
        System.out.println("HOLA JUGADORES!");
        System.out.print(menu.pedirJugador1);
        jugador1.nombre = sc.nextLine();
        System.out.println(menu.PedirJugador2);
        jugador2.nombre = sc.nextLine();
        boolean a = true;
        int jug = 0;
        while (a) {
            jug ++;

            System.out.println(menu.menuJuego1);
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    jugador1.intentos++;
                    valorDau1 = dau1.tirar();
                    valorDau2 = dau2.tirar();
                    valorDau3 = dau3.tirar();
                    if (valorDau1 == valorDau2 && valorDau2 == valorDau3) {
                        jugador1.puntos++;
                    }
                    break;
                case 2:
                    a = false;
            }




        }
        System.out.println("JUGADOR 1\nNombre:   " + jugador1.nombre + "\nIntentos: " + jugador1.intentos + "\nPuntos:   " + jugador1.puntos);
    }

}
