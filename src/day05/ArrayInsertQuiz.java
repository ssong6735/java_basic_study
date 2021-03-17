package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertQuiz { // 7강_1. 배열 insert quiz
    public static void main(String[] args) {

        // 음식 이름을 입력할때마다 배열의 뒤에 추가
        // 그만 을 입력하면 종료하고 배열 출력력

        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("# 먹고싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        String[] foodsArr = {};

        while (true) {
            System.out.print("> ");
            String newFood = sc.next();

            if (newFood.equals("그만")) {
                System.out.println("입력 종료!");
                break;
            } else {
                //1. 원본 배열보다 사이즈가 1개 큰 새로운 배열을 생성
                String[] temp = new String[foodsArr.length + 1];
                //2. 기존 배열의 데이터를 복사해서 신규 배열에 저장
                for (int i = 0; i < foodsArr.length; i++) {
                    temp[i] = foodsArr[i];
                }
                //3. 추가할 데이터를 마지막 위치에 저장
                temp[temp.length - 1] = newFood;
                //4. 기존 배열 변수가 신규 배열의 주소를 가질 수 있도록 설정
                //   임시 배열 temp 의 연결은 끊어준다.
                foodsArr = temp;
                temp = null;

            }
        }
        sc.close();

        System.out.println("foodsArr: " + Arrays.toString(foodsArr));
        */

        // 홍쌤 풀이

        System.out.println("# 먹고싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        // 음식명을 저장할 배열 생성
//        String[] foods = new String[0];
        String[] foods = {}; // 빈 배열

        while (true) {
            System.out.print("> ");
            String foodName = sc.nextLine();

            if (foodName.equals("그만")) {
                System.out.println("입력종료!");
                sc.close();
                break;
            }

            String[] temp = new String[foods.length + 1];

            for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];
            }

            temp[temp.length - 1] = foodName;
            foods = temp;
            temp = null;
        } // end while

        System.out.println("먹고싶은 음식: " + Arrays.toString(foods));


    }
}
