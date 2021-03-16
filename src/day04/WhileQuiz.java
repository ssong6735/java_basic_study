package day04;

import java.util.Scanner;

public class WhileQuiz { // 6강_19페이지 퀴즈
    public static void main(String[] args) {
        /*
        정수 1: 5
        정수 2: 8
        5~8까지의 총합: 26

        위와 같은 결과가 나오는 프로그램은 코딩하시오.

        1. 사용자는 정수 2개를 각각 입력할 수있어야 함.
        2. 프로그램은 2번째 정수를 입력하고 엔터를 누르면
           1번째 정수부터 2번째 정수까지의 총합(2번째 정수 포함)을 출력해야 함.
        3. 반복문 while 을 사용할 것.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 1: ");
        int x= sc.nextInt();
        System.out.print("정수 2: ");
        int y = sc.nextInt();

        // x~y까지의 총합
        /*int total = 0;
        int n = x;
        while (n<=y) {
            total += n;
            n++;
        }*/

        // while 에서 for 로 변경시
        int total = 0;
        for (int n = x; n <= y; n++) {
            total += n;
        }

        System.out.printf("%d~%d까지의 총합: %d\n", x, y, total);

    }
}
