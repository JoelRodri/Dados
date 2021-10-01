package com.company;

public class Dau {
    int valor;

    int tirar(){
        this.valor = (int) ((Math.random()*6)+1);
        return valor;
    }
}
