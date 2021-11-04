package com.company;

import com.company.Animal;
import com.company.Pet;

public class Fish extends Animal implements Pet{
    public Fish(int legs) {
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("EL pez come tiburones");
    }

    @Override
    public void walk() {
        System.out.println("El pez no puede caminar el vuela en el agua");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String setName(String Name) {
        return null;
    }

    @Override
    public void play() {
        System.out.println("EL pez no juega");
    }
}
