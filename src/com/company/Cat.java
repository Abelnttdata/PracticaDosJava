package com.company;

public class Cat extends Animal implements Pet{
    private String Name;

    public Cat(int legs, String Name) {
        super(legs);
        this.Name = Name;
    }

    public Cat() {
        this(4,"");
    }

    @Override
    public String setName(String Name) {
        return Name;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void play() {
        System.out.println("El gato juega a los naipes");
    }

    @Override
    public void eat() {
        System.out.println("El gato llamado " + getName() +  " camina con sus " + legs + " patas");
    }
}
