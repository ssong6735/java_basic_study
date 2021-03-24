package day07;

public class MethodQuiz1 { // 8강_17페이지 퀴즈

    static int calcDivisor(int number) {
        int divTotal = 0; // 약수 총합 저장 변수

        // 약수 판별
        System.out.printf("%d의 약수: ", number);
        for (int i = 1; i <= number ; i++) {
            if (number % i == 0) {
                divTotal += i;
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
        return divTotal;
    }

    public static void main(String[] args) {
        System.out.println("10의 약수의 총합: " + calcDivisor(10));
        System.out.println("-------------------------------");
        System.out.println("30의 약수의 총합: " + calcDivisor(30));
    }
}
