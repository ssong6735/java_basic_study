package day04;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        // 입력받는 값을 계속 더하다가 0을 입력받으면 멈추기

        int total = 0;

        int n = 0;

        Scanner sc = new Scanner(System.in);
        // while 의 시작조건이 처음부터 false 이므로 0회 반복됨.
        /*while (n!=0) {
            System.out.println("정수(0입력시 종료): ");
            n = sc.nextInt();
            total += n;
        }*/

        do {
            System.out.println("정수(0입력시 종료): ");
            n = sc.nextInt();
            total += n;
        } while (n!=0);

        System.out.println("입력 누적값: " + total);
        sc.close();
    }

}
