package day03;

import java.util.Scanner;

public class Lec4_Quiz_18p { // 4강_18페이지 퀴즈
    public static void main(String[] args) {

        /*
        가진돈 : 7000 // 5천원이상
        오늘 먹을 음식: 육개장

        가진돈 : 3000 // 0원이상 5천원미만
        오늘 먹을 음식: 라면

        가진돈 : 0 // 0원
        오늘 먹을 음식: 굶어!

        3항 연산자 사용하여 코딩하기.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("돈을 입력하세요!");
        int money = sc.nextInt();
        sc.close();

        System.out.println("가진 돈: " + money);

        String food = money >= 5000 ? "육개장" : money == 0 ? "굶어!" : "라면";

        System.out.println("선택된 음식: " + food);

    }
}
