package day04;

public class ForQuiz {
    public static void main(String[] args) {

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

        for (int line = 1; line <= 9; line++) {
            System.out.printf("%d X %d = %d\n", level, line, level*line);
        }

    }
}
