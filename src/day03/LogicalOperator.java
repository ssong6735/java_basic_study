package day03;

public class LogicalOperator { // 4강_2.이항연산자(논리연산자)
    public static void main(String[] args) {

        int x = 10, y = 20;

        boolean result1 = (x != 10) && (++y == 21);
        boolean result2 = (x == 10) || (++y == 21);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);




    }
}
