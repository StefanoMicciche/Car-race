package org.example;

public class Vehiculo {

    private static String marca;
    private int velocity;
    private int ruedas;

    public Vehiculo(){
    }

    public Vehiculo(String marca, int ruedas) {
        this.marca = marca;
        this.velocity = 0;
        this.ruedas = ruedas;
    }

    public void acelerar(int gas){
        this.velocity += gas;
        System.out.println(velocity + " km/h - ");
    }

    public void frenar (int brake){
        this.velocity -= brake;
        System.out.println(velocity + "Km/h  - ");
    }
    public static String getMarca(){
        return marca;
    }
}
