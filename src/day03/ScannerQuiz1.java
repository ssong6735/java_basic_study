package day03;

import java.util.Scanner;

public class ScannerQuiz1 { // 5강_11페이지 퀴즈1
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**** 상품 재고 총액 구하기 ****");
        System.out.print("- 상품의 가격: ");
        int money = sc.nextInt();
        System.out.print("- 상품의 개수: ");
        int count = sc.nextInt();

        // 재고 총액을 저장할 변수
        int totalPrice = money * count;
        System.out.println("----------------------------------");
        System.out.printf("- 상품 재고 총액: %d원", totalPrice);

    }
}
