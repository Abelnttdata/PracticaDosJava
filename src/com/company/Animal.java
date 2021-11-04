package com.company;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();


    public void walk(){
        System.out.println("Los animales caminan con sus número de pies");
    }
}
