package org.example;

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche ("Ford", 4);
        Bike bike = new Bike ("Ducatti", 2);

        System.out.print(Coche.getMarca()+ ": ");
        for (int i = 0; i < 6 ; i++){
            coche.acelerar();
        }
        for (int i = 0; i < 6 ; i++){
            coche.frenar();
        }

        System.out.println();
        System.out.println(Bike.getMarca()+ ": ");
        for (int i = 0; i < 6 ; i++){
            bike.acelerar();
        }
        for (int i = 0; i < 6 ; i++){
            bike.frenar();
        }

}}

