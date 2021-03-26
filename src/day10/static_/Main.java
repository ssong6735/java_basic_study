package day10.static_;

public class Main {

    public static void main(String[] args) {

        Count c1 = new Count();
        c1.x = 5;
//        c1.y = 10;
        Count.y = 10;

        Count c2 = new Count();
        c2.x += 10;
//        c2.y += 10;
        Count.y += 10;

        System.out.println("c1.x = " + c1.x);
        System.out.println("c2.x = " + c2.x);
        System.out.println("==================================");
        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.y = " + c2.y);

        System.out.println("==================================");

        c1.method1();
        c2.method1();

//        c1.method2(); c2.method2();
        Count.method2(c1);
        Count.method2(c2);

        System.out.println("==================================");

//        Calculator.calcAreaCircle(5);

        System.out.println(Calculator.pi);
    }

}
