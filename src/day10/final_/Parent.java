package day10.final_;

class Child extends Parent {
    @Override
    void m2() {
        super.m2();
        m1();
    }
}

public class Parent {

    final void m1() {}
    void m2() {}

}
