package day03;

public class BitOperator { // 4강_2.이항연산자(비트연산자)
    public static void main(String[] args) {

        // 비트 연산
        byte a = 5; // 0000 0101
        byte b = 3; // 0000 0011

        // 비트곱: 각 자리수를 곱하라
        System.out.println(a&b); // 0000 0001 -> 1
        // 비트합: 각 자리수를 더하고 1+1은 1로 처리
        System.out.println(a|b); // 0000 0111 -> 7
        // 배타적 논리합: 다르면 1
        System.out.println(a^b); // 0000 0110 -> 6


        // 비트 이동 연산
        int x = 192;
        // << : 2에 주어진 값 제곱
        System.out.println(x << 3);
        // >> : 2에 주어진 값 -제곱
        System.out.println(x >> 2);

        // 비트 반전 (단항)
        int y = 8; // 0000 1000
        System.out.println(~y); // 1111 0111

    }
}
