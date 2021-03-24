package day08.modi.member.pac1;

public class E {

    E() {
        D d = new D();

        d.f1 = 1;
        d.f2 = 2;
//        d.f3 = 3; // private

        d.m1();
        d.m2();
//        d.m3(); // private

    }

}
