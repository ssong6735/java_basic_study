package day03;

import java.util.Scanner;

public class SwitchExample { // 6강_1.조건문(다중분기조건문)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[ 여행을 원하는 계절을 입력하세요! ]");
        System.out.print(">> ");

        String  season = scanner.next();


        // switch 에는 문자, 정수형 변수 이외에는 작성 불가능!
        switch (season) {
            case "spring": case "봄":
                System.out.println("봄에는 여의도 공원으로 가보세요!");
                break;
            case "summer": case "여름":
                System.out.println("여름에는 낙산 해수욕장으로 가보세요!");
                break;
            case "가을":
                System.out.println("가을에는 대청댐으로 가보세요!");
                break;
            case "겨울":
                System.out.println("겨울에는 홍천 스키장으로 가보세요!");
                break;

            default:
                System.out.println("[봄, 여름, 가을, 겨울 중 하나를 입력하세요!]");
        }
        scanner.close();
    }
}
