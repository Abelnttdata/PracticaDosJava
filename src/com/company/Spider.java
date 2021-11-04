package com.company;

public class Spider extends  Animal{

    public Spider(int legs) {
        super(legs) ;
    }

    @Override
    public void eat() {
        System.out.println("Las arañas comen humanos");
    }

    @Override
    public void walk() {
        System.out.println("Las arañas caminan con sus número de pies que es " + legs);
    }
}
