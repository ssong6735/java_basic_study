package day10.static_; // static 이 키워드이기 때문에 "_" 를 붙여준다.

public class Count {

    public int x; // 인스턴스 필드 (instance field)
    public static int y; // 스테틱 필드 (static field) - 공유 된다.

    // 인스턴스 메서드
    public void method1() {
        int z = x + y;
        System.out.println("z(instance) = " + z);
    }
    // 스태틱 메서드
    public static void method2(Count c) {
        // static 블록 내에서는 인스턴스 멤버를 직접 사용할 수 없다.
        // 매개변수로 누구인지 지정해줘야 사용가능.
        int z = c.x + y;
        c.method1();
    }

}
