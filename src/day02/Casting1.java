package day02;

public class Casting1 { // 3강_2.형변환

    public static void main(String[] args) {

        // 대입연산
        // 묵시적 형변환, upcasting(promotion)
        byte a = 100;
        int b = a; // a가 byte -> int 자동 형 변환

        double c = b; // b가 int -> double 자동 형 변환
        System.out.println(c);

        // 명시적 형변환, downcasting / 데이터가 날라갈수 있다.
        int n = 1000;
        byte m = (byte) n;
        System.out.println("m = " + m);
        
        double d = 500.3333;
        int i = (int) d; // 소수점 이하 절삭 i=500
        System.out.println("i = " + i);
        
        
    }

}
