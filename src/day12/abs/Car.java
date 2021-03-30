package day12.abs;

// 추상 메서드를 사용하려면 클래스도 추상클래스여야 한다.
// 추상클래스는 객체를 만들지 않는다. (자식에 의해서 생성)
// 인터페이스와 추상클래스는 같은개념. 인터페이스 때문에 추상클래스는 잘 사용하지 않음.

// 추상 클래스
public abstract class Car {

    private String model;
    private int price;

    public Car(String model, int price) {
        System.out.println("Car 생성자 호출!");
        this.model = model;
        this.price = price;
    }

    // 추상 메서드 : 하위 클래스에서 반드시 오버라이딩 하게끔 지정.
    public abstract void start(); // 주행 기능 명세

    // 스테틱 메서드 : 공통적인 기능
    public static void staticMet() {}
    // 인스턴스 메서드 : 있어도 그만 없어도 그만. 맘대로 변경 가능.
    public void instanceMet() {}
    // 파이널 메서드 : 필요하면 쓰는데 바꾸면 안된다.
    public final void finalmet() {}

}
