package day02;

public class Casting2 { // 3강_2.형변환2

    public static void main(String[] args) {

        char c = 'B';
        int i = 2;

        System.out.println(c+i); // char 를 int 로 자동 형변환 해서 계산한다.

//        int result = c + i;
        char result = (char) (c+i);
        System.out.println("result = " + result);

        char result2 = (char) (50000+60000);
        System.out.println("result2 = " + result2);

        // int 보다 작은타입(byte, short, char)의 연산은 결과가 자동으로 int 로 변환됨.
        byte b1 = 100;
        byte b2 = 110;
//        byte b3 = b1 + b2;
        System.out.println('A'+'B');
        
        int n1 = 27;
        int n2 = 5;
        
        double res = (double) n1 / n2;
        System.out.println("res = " + res);

        System.out.println(10.0 / 4);

    }
}
