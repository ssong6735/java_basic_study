package day04;

public class LoopNesting {
    public static void main(String[] args) {

        // 중첩 반복문
        for (int level=2; level<=9; level++) {
            for (int line = 0; line < 9 ; line++) {
                System.out.printf("%d X %d = %d\n", level, line, level*line);
            }
            System.out.println("=================");
        }

    }
}
