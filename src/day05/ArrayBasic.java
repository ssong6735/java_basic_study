package day05;

import java.util.Arrays;

public class ArrayBasic { // 7강_1. 배열 기초
    public static void main(String[] args) {

        //1. 배열 변수를 선언
        int[] points;

        //2. 배열 객체의 생성
        points = new int[5];

//        System.out.println("points = " + points);

        //3. 배열 데이터 저장
        points[0] = 87;
        points[1] = 95;
        points[2] = points[0] + 3;
        points[3] = (int) 33.145; // 33만 저장
        points[4] = 100;
//        points[5] = 100;

        //4. 배열의 길이
        System.out.println("배열의 길이: " + points.length);

        //5. 배열의 반복문 처리 fori (인덱스 조절이 필요할때 ex)홀수만 참조, 짝수만 참조)
        int total = 0;
//        int total = Arrays.stream(points).sum(); // 고인물 언어 ㅋ
        /*for (int i = 0; i < points.length; i++) {
            total += points[i];
        }*/

        // 향상된 for 문 iter (내부 데이터 전부 사용할때)
        for (int n : points) {
            total += n;
        }
        System.out.println("배열 데이터 총합: " + total);

        // 간소화 문법
        double[] dArr = new double[4];

        // 값 목록으로 배열 생성하기
        // new type[] 을 생략할 수 있는 상황은 변수를 선언할 때 뿐입니다.
        String[] foods = {"탕수육", "김치볶음밥", "짬뽕"};

        foods = new String[] {"오렌지", "자몽", "레몬"};

        // 배열 내부값 한번에 출력하기
        System.out.println(Arrays.toString(foods));
        System.out.println(Arrays.toString(points));

        System.out.println("==============================");
        System.out.println(Arrays.toString(dArr));

        // 배열 값 초기화를 안하면 각 타입의 기본값이 저장됨.
        boolean[] bArr = new boolean[6];
        System.out.println(Arrays.toString(bArr));

        String[] sArr = new String[4];
        System.out.println(Arrays.toString(sArr));

        // 배열의 주소 개념
        int[] iArr = {1, 3, 5, 7, 9, 11};
//        int[] copyArr = iArr;

        // 배열 복사 알고리즘
        int[] copyArr = new int[iArr.length];
        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = iArr[i];
        }

        copyArr[0] = 100;
        iArr[1] = -50;
        System.out.println("===========================");
        System.out.println("copy: " + Arrays.toString(copyArr));
        System.out.println("iArr: " + Arrays.toString(iArr));
    }
}
