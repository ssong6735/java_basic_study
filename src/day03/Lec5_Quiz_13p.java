package day03;

import java.util.Scanner;

public class Lec5_Quiz_13p { // 5강_13페이지 퀴즈3
    public static void main(String[] args) {

        /*
        이름: 홍길동
        나이: 25
        ---------------------
        이름: 홍길동
        출생년도: 1995년생

        위와 같은 결과가 나오는 프로그램을 코딩하시오.

        1. 사용자는 이름과 나이를 입력할 수 있어야 함.
        2. 프로그램은 2가지 정보를 입력하고 엔터를 누르면
           이름정보와 출생년도 정보(한국나이 기준, 만나이x)를 출력해야 함.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.close();

        // 올해 연도 + 101 = (20)21+101 = 122
        // 2021 39 => 122-39 = 83 + 1900
        int year = 122 - age + 1900;

        System.out.printf("\n이름: %s\n", name);
        System.out.printf("출생년도: %d", year);

    }
}
