package day04;

public class ForQuiz { // 6강_24페이지 퀴즈
    public static void main(String[] args) {
        /*
        1. 2~9단중 랜덤 구구단이 등장하도록 코딩
        2. for 문과 while 문으로 각각 구현
        */

        // 2단 구구단
        /*int dan = 2;
        for (int i=1; i<=9; i++) {
            int val = dan * i;
            System.out.printf("%d X %d = %d\n", dan, i, val);
        }*/

        // 랜덤 구구단
        /*int dan = (int) (Math.random() * 8) + 2;
        System.out.printf("랜덤 구구단 %d단\n", dan);
        System.out.println("==============================");
        for (int i=1; i<=9; i++) {
            System.out.printf("%d X %d = %d\n", dan, i, dan*i);
        }*/

        // 홍쌤풀이
        int level = (int) (Math.random() * 8) + 2;

        System.out.printf("랜덤 구구단 %d단\n", level);
        System.out.println("----------------------------");

        /*// for 문
        for (int line = 1; line <= 9; line++) {
            System.out.printf("%d X %d = %d\n", level, line, level*line);
        }*/

        // while 문
        int line = 1;
        while (line <= 9) {
            System.out.printf("%d X %d = %d\n", level, line, level*line);
            line++;
        }

    }
}
