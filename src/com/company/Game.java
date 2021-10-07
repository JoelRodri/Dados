package com.company;

import java.awt.*;
import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);

    //Creamos los dos jugadores.
    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();

    //Le pasamos los jugadores al menu para poder utilizarlos.
    Menu menu = new Menu(jugador1 , jugador2);


    Dau dau1 = new Dau();
    int valorDau1;

    Dau dau2 = new Dau();
    int valorDau2;

    Dau dau3 = new Dau();
    int valorDau3;

    void juego(){
        while (true){

            //Pintamos el menu y las opciones.
            System.out.println(menu.menuInicio);
            System.out.println(menu.menuJuegos);

            // eleccion de juego.
            int juego = sc.nextInt();

            //leemos el salto de linea.
            sc.nextLine();

            if (juego == 1){

                System.out.println("HOLA JUGADORES!");

                //Pedimos nombre jugador1.
                System.out.print(menu.pedirJugador1);
                jugador1.nombre = sc.nextLine();

                //Pedimos nombre jugador2.
                System.out.println(menu.PedirJugador2);
                jugador2.nombre = sc.nextLine();

                boolean a = true;

                //La variable jug para comprobar a que jugador le toca.
                int jug = 0;


                //Este while es el juego como tal
                while (a) {

                    //incrementamos jug para mas adelante comprovar a que jugador le toca.
                    jug ++;

                    //Si es divisible entre 2 le toca al jugador1, sino entra al else que es el jugador 2.
                    if (jug % 2 == 0){

                        //imprimimos el menu de juego para el jugador1.
                        System.out.println(menu.menuJugador1);

                        //leemos la opcion de juego que da el usuario.
                        int opcion = sc.nextInt();

                        //si seleccionamos la opcion para jugar entramos al caso 1,sino al 2 y se se sale del while (se acaba el juego).
                        switch (opcion) {
                            case 1:
                                //sumamos un intento al jugador1.
                                jugador1.intentos++;
                                //cogemos los resultados de los dados.
                                valorDau1 = dau1.tirar();
                                valorDau2 = dau2.tirar();
                                valorDau3 = dau3.tirar();

                                //si el valor de los 3 dados es igual suma un punto al jugador1.
                                if (valorDau1 == valorDau2 && valorDau2 == valorDau3) {
                                    jugador1.puntos++;
                                }
                                //salimos del switch para no hacer el resto de opciones.
                                break;
                            case 2:
                                //la variable a se vuelve "false" y se sale del while.
                                a = false;
                        }
                    }else{
                        //imprimimos el menu de juego para el jugador2.
                        System.out.println(menu.menuJugador2);

                        //leemos la opcion de juego que da el usuario.
                        int opcion = sc.nextInt();


                        switch (opcion) {
                            case 1:
                                //sumamos un intento al jugador2.
                                jugador2.intentos++;
                                //cogemos los resultados de los dados.
                                valorDau1 = dau1.tirar();
                                valorDau2 = dau2.tirar();
                                valorDau3 = dau3.tirar();
                                //si el valor de los 3 dados es igual suma un punto al jugador2.
                                if (valorDau1 == valorDau2 && valorDau2 == valorDau3) {
                                    jugador2.puntos++;
                                }
                                //salimos del switch para no hacer el resto de opciones.
                                break;
                            case 2:
                                //la variable a se vuelve "false" y se sale del while.
                                a = false;
                        }
                    }
                }
                //Imprime los resultados de cada jugador con su nombre.
                System.out.println("JUGADOR 1\nNombre:   " + jugador1.nombre + "\nIntentos: " + jugador1.intentos + "\nPuntos:   " + jugador1.puntos + "\n");
                System.out.println("JUGADOR 2\nNombre:   " + jugador2.nombre + "\nIntentos: " + jugador2.intentos + "\nPuntos:   " + jugador2.puntos);

                //comprueba las victorias de cada jugador para determinar quien gana, o si empatan.
                if (jugador1.puntos > jugador2.puntos){
                    System.out.println(menu.ganaJugador1);
                }else if (jugador2.puntos > jugador1.puntos){
                    System.out.println(menu.ganaJugador2);
                }else{
                    System.out.println(menu.empatan);
                }

            //Opciones de relleno que no tienen juego, avisan que no hay juego y vuelves a escojer jeugo.
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