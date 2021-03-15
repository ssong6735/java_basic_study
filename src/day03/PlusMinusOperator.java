package day03;

public class PlusMinusOperator {
    public static void main(String[] args) {
        
        int x = 3;
        int y = ++x + 5 * 3;
        int z = 5 * y-- + x++ - --y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

//        증감연산자를 제외하고 계산순서 확인하기
//        y = x + (5*3)
//        z = (5*y) + x - y
        
    }
}
