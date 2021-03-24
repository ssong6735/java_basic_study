package day08.modi.cls.pac1;

import day08.modi.cls.pac2.C;

// 접근제한자 자리에 아무것도 쓰지 않으면 자동으로 default 제한이 걸린다.
// 클래스에는 default, public 제한만 사용 가능
class A {

    public int f1;
    public int f2;

    public void m1() {
        B b = new B(); // B: public
        C c = new C(); // C: public
    }
    public void m2() {}

}
