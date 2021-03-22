package day03;

import java.util.Scanner;

public class Lec5_Quiz_12p { // 5강_12페이지 퀴즈2
    public static void main(String[] args) {

        /*
        얼마있어요?? 6000 // 5000원 이상
        선택된 음식: 김치찌개

        얼마있어요?? 3000 // 2500원 이상
        선택된 음식: 라면

        얼마있어요?? 0 // 0원 이면
        선택된 음식: 굶어!

        위와 같은 결과가 나오는 프로그램 코딩하기.

        1. 사용자는 가진 돈의 액수를 정수로 입력할 수 있음
        2. 프로그램은 돈의 정보를 입력하고 엔터를 누르면
           조건에 따라 출력 시켜야 함(조건 위에 있음)
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("얼마있어요?? ");
        int money = sc.nextInt();
        sc.close();

//        String food = money >= 5000 ? "김치찌개" : money == 0 ? "굶어!" : "라면";

        String food;

        /*if (money >= 5000) {
            food = "김치찌개";
        } else if (money >= 2500) {
            food = "라면";
        } else if (money == 0) {
            food = "굶어!";
        } else { // 문제에 1원부터 2500원 미만에 대한 얘기가 없음.
            food = "1원부터 2500원 미만";
        }*/

        if (money >= 5000) {
            food = "김치찌개";
        } else if (money >= 2500) {
            food = "라면";
        } else {
            food = "굶어!";
        }
        System.out.println("선택된 음식: " + food);

    }
}
