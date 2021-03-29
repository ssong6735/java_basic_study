package day11.poly.car;

public class CarShop {

    int sellCar(Car c) {
        if (c instanceof Sonata) {
            System.out.println("소나타는 1200만원 입니다.");
            return 1200;
        } else if (c instanceof Tucson) {
            System.out.println("투싼은 1300만원 입니다.");
            return 1300;
        } else if (c instanceof Boxter) {
            System.out.println("박스터는 5000만원 입니다.");
            return 5000;
        } else {
            System.out.println("알수 없는 차종입니다.");
            return 0;
        }
    }

}
