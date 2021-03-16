package day03;

public class Lec4_Quiz_5p { // 4강_5페이지 퀴즈
    public static void main(String[] args) {

        int x = 3;
        int y = ++x + 5 * 3;
        int z = 5 * y-- + x++ - --y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        /*
        위의 코드를 보고 연산 종료 후
        x, y, z에 대입된 값을 구하세요.

        1. x=3
        2. y= 4 + 15 = 19
        3. z= 5*19-- + 4++ - 17
        4. x=5, y=17, z=95+4-17 = 82
        */

    }
}
