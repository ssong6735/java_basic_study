package day01;

public class dataType {

    public static void main(String[] args) {
        // 정수형 1.byte(1byte), 2.short(2byte), 3.int(4byte), 4.long(8byte)
        // 기본적으로 int 사용, 큰 용량이 필요하면 long 사용
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 2147483648L; // long에 대입하려는 리터럴의 기본타입이 int라서 long 선언할때는 리터럴 뒤에 L을 붙여준다.
        System.out.println("d = " + d);

        int i;
        double n = 0.0;
        for (i = 0; i < 100; i++) {
            n += 0.1;
        }
        System.out.println("0.1을 100번 더한 결과: " + n);

        // float에 대입하려는 리터럴의 기본타입이 double이기 때문에 float 사용시 리터럴 뒤에 F를 붙여준다.
        float f1 = 3.73454521321321F; // 4byte
        double d1 = 3.7665232345495; // 8byte
        System.out.println(f1);
        System.out.println(d1);
    }

}
