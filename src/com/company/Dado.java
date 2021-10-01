package com.company;

import java.sql.Array;
import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas veces quieres tirar los dados?");
        int n = sc.nextInt();

        int dado1;
        int dado2;

        int[] total = new int[n];

        for (int i = 0; i < n; i++) {
            dado1 = (int) ((Math.random()*6)+1);
            dado2 = (int) ((Math.random()*6)+1);

            total[i] = dado1 + dado2;
        }

        int r = 0;

        for (int i = 2; i <= 12; i++) {
            r = 0;
            for (int j = 0; j < n; j++) {
                if (total[j]==i)r++;
            }
            System.out.println(i + " -> " + r);
        }

    }
}