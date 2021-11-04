package com.company;

public class Main {

    public static void main(String[] args) {
        Spider spider = new Spider(8);
        spider.walk();
        spider.eat();

        System.out.println("\n");
        Cat cat = new Cat(4,"Gatuno");
        cat.eat();
        cat.play();

        System.out.println("\n");
        Fish fish = new Fish(0);
        fish.eat();
        fish.walk();
        fish.play();

        System.out.println("\n");
        cat.play();
        fish.eat();
        spider.eat();
    }
}
