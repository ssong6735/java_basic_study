package day12.exception;

public class TryCatchEx1 {

    public static void main(String[] args) {

        // 시작시 n2=2, n2 를 0 으로 바꾸고 실행하면 에러남 (10은 0으로 나눌수 없음. 팅김)
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at day12.exception.TryCatchEx1.main(TryCatchEx1.java:10)

        int n1 = 10, n2 = 0;
        System.out.println("나눗셈 시작!");

        try {
            // 예외 발생 가능성이 있는 코드를 예외처리
            System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
        } catch (Exception e) { // Exception 의 매개변수는 관례적으로 e를 적어준다.
            // 예외 발생시 실행할 코드를 적는다.
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램 정상 종료!");

    }

}
