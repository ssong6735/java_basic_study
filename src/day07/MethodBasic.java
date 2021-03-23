package day07;

import java.util.Arrays;

public class MethodBasic { // 8강_1.메서드

    static int calculateTotal(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        return total;
    }

    // n개의 정수의 총합
    static int calcNumbersTotal(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    static String selectRandomFood() {
        String[] foods = {"김밥", "볶음밥", "오렌지", "닭강정", "귤"};
        return foods[(int) (Math.random() * foods.length)];
    }

    public static void main(String[] args) {

        int result = calculateTotal(10);
        System.out.println("result = " + result);

        int result2 = calculateTotal(50);
        System.out.println("result2 = " + result2);

        String food = selectRandomFood();
        System.out.println("food = " + food);
        // System.out.println("food = " + selectRandomFood()); [ctrl + alt + n ] 퇴근일찍비법.

        int total = calcNumbersTotal(new int[] {10, 20, 30, 100, 200});
        System.out.println("total = " + total);

        int total2 = calcNumbersTotal(10,20,30,40,80,99);
        System.out.println("total2 = " + total2);

        System.out.println("======================================================");

        sayHello("멍청이");

        System.out.println("======================================================");

        int[] results = operateAll(20,5);
        System.out.println(Arrays.toString(results)); //배열 내부 값 불러오기 Arrays.toString()
    }//end main

    // 함수는 메인 밖에 클래스 안에 정의
    // return 할게 없으면 타입을 void 로 적어준다.

    // 사용자의 이름을 전달하면 인사를 출력해주는 함수
    static void sayHello(String userName) {
        System.out.println(userName + "님 안녕하세요!");
    }

    // 여러 값을 리턴하고 싶은 경우
    static int[] operateAll(int n1, int n2) {
        return new int[] {n1+n2, n1-n2, n1*n2, n1/n2};
    }
}//end class