package org.example;

public class Coche extends Vehiculo {

    public Coche(String marca, int ruedas){
        super(marca, ruedas);
    }

    public void acelerar(){
        super.acelerar(20);
    }

    public void frenar(){
        super.frenar(10);
    }

}
