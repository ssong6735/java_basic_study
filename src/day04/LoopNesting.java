package day04;

public class LoopNesting { // 6강_2.반복문(중첩반복문)
    public static void main(String[] args) {

        for (int level=2; level<=9; level++) {
            for (int line = 0; line < 9 ; line++) {
                System.out.printf("%d X %d = %d\n", level, line, level*line);
            }
            System.out.println("=================");
        }

    }
}
