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
        while (true){
            System.out.println(menu.menuInicio);
            System.out.println(menu.menuJuegos);

            int juego = sc.nextInt();
            if (juego == 1){

                System.out.println("HOLA JUGADORES!");

                System.out.print(menu.pedirJugador1);
                jugador1.nombre = sc.nextLine();

                System.out.println(menu.PedirJugador2);
                jugador2.nombre = sc.nextLine();

                boolean a = true;
                int jug = 0;

                while (a) {
                    jug ++;

                    if (jug % 2 == 0){

                        System.out.println(menu.menuJugador1);
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

                    }else{

                        System.out.println(menu.menuJugador2);
                        int opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                jugador2.intentos++;
                                valorDau1 = dau1.tirar();
                                valorDau2 = dau2.tirar();
                                valorDau3 = dau3.tirar();
                                if (valorDau1 == valorDau2 && valorDau2 == valorDau3) {
                                    jugador2.puntos++;
                                }
                                break;
                            case 2:
                                a = false;
                        }

                    }
                }

                System.out.println("JUGADOR 1\nNombre:   " + jugador1.nombre + "\nIntentos: " + jugador1.intentos + "\nPuntos:   " + jugador1.puntos);
                System.out.println("JUGADOR 2\nNombre:   " + jugador2.nombre + "\nIntentos: " + jugador2.intentos + "\nPuntos:   " + jugador2.puntos);

                if (jugador1.puntos > jugador2.puntos){
                    System.out.println(menu.ganaJugador1);
                }else if (jugador2.puntos > jugador1.puntos){
                    System.out.println(menu.ganaJugador2);
                }else{
                    System.out.println(menu.empatan);
                }

            }else if (juego == 2){
                System.out.println("NO HAY JUEGO");
            }else if (juego == 3){
                System.out.println("NO HAY JUEGO");
            } else{
                break;
            }

        }
    }

}
