package day15.generic;

import day10.protec.pac1.A;

public class Main {

    public static void main(String[] args) {

        Basket<Apple> ab = new Basket<>();
        ab.setFruit(new Apple());

        Apple apple = ab.getFruit();
        System.out.println("apple = " + apple);

        System.out.println("============================");

        Basket<Peach> pb = new Basket<>();
        pb.setFruit(new Peach());

        Peach peach = pb.getFruit();
        System.out.println("peach = " + peach);

        System.out.println("============================");

        Basket basket = new Basket();

        basket.setFruit(new Apple());
        basket.setFruit(new Peach());

        Object fruit = basket.getFruit();

        System.out.println("============================");

//        Basket<Water> waterBasket = new Basket<>();

        Basket<Fruit> fruitBasket = new Basket<>();
        fruitBasket.setFruit(new Apple());
        fruitBasket.setFruit(new Peach());
//        fruitBasket.setFruit(new Water());

    }
    
}
