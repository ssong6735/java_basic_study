package day04;

import java.util.Scanner;

public class WhileQuiz {
    public static void main(String[] args) {

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
