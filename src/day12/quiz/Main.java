package day12.quiz;

class Tire {
    public void roll() {
        System.out.println("일반 타이어가 회전합니다.");
    }
}

class SnowTire extends Tire {
    @Override
    public void roll() {
        System.out.println("스노우 타이어가 회전합니다.");
    }
}

public class Main {

    public static void main(String[] args) {

        SnowTire snowTire = new SnowTire(); // SnowTire 생성
        Tire tire = snowTire; // SnowTire 를 업캐스팅한 것. (타입을 Tire 로 올림)

        snowTire.roll();
        tire.roll();

    }

}
