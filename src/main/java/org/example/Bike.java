package org.example;

public class Bike extends Vehiculo{

    public Bike(String marca, int ruedas){
        super(marca, ruedas);
    }

    public void acelerar(){
        super.acelerar(25);
    }
    public void frenar(){
        super.frenar(20);
    }

}
