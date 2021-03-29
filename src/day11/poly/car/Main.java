package day11.poly.car;

import day10.protec.pac2.D;

public class Main {

    public static void main(String[] args) {

        // 다형성 특징
        // 1. 객체의 교환성 증가
        /*Car myCar = new Car();
        myCar.frontLeft = new NexenTire();
        myCar.frontRight = new KumhoTire();*/

        // 2. 다른 타입간 배열 구성 가능 (이종 모음 배열)
        Tucson t1 = new Tucson();
        Tucson t2 = new Tucson();
        Tucson t3 = new Tucson();
        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();
        Boxter b1 = new Boxter();
        Boxter b2 = new Boxter();
        Boxter b3 = new Boxter();
        Boxter b4 = new Boxter();

        Car[] cars = {t1, t2, t3, s1, s2, s3, b1, b2, b3, b4};
        /*for (Car car : cars) {
            car.run();
        }*/

        Driver driver = new Driver();
        driver.drive(b1);

        System.out.println("=======================");
//        Car myCar = driver.buyCar("소나타");
        Sonata myCar = (Sonata) driver.buyCar("소나타");
        driver.drive(myCar);

//        ((Sonata) myCar).joinMembership();
        myCar.joinMembership1();
        myCar.joinMembership2();

        Car[] cars2 = {myCar};

        System.out.println("====================");

        CarShop shop = new CarShop();
        shop.sellCar(new Boxter());

        "".equals(t2);

    }

}
