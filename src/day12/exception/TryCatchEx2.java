package day12.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc = null; // null point 에러 유도 코드

        try {
            System.out.print("정수1: ");
            int n1 = sc.nextInt(); // warning

            System.out.print("정수2: ");
            int n2 = sc.nextInt(); // warning

            int divResult = n1 / n2; // warning
            System.out.println("divResult = " + divResult);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력해주세요.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외사항 입니다. 점검하겠습니다.");
        }
        // 에러상황이 여러가지일때 catch 를 여러번 사용할 수 있다.
        // 대신 Exception 을 정확한 에러명칭으로 적어준다.
        // 마지막에 catch (Exception e) {} 를 넣어주면 기타 등등의 대비하지 못한 에러를 잡아준다.

        System.out.println("프로그램 정상 종료!");


    }

}
