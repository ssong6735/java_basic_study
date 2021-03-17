package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch { // 7강_1. 배열 탐색 알고리즘
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] foods = {"치킨", "피자", "삼겹살", "족발"};

        System.out.print("찾을 음식: ");
        String targetFood = sc.next();

        // 순차 탐색 알고리즘
        boolean containFood = false;
        int i;
        for (i = 0; i < foods.length; i++) {
            if (targetFood.equals(foods[i])) {
                containFood = true;
                break;
            }
        }

        if (containFood) {
            System.out.println("해당 음식은 존재합니다.");
            System.out.println("찾은 음식의 인덱스: " + i);
            // 찾은 음식을 새로운 음식으로 바꾸고 싶을때
            System.out.print("새로운 음식명: ");
            foods[i] = sc.next();

            System.out.println("수정 후 음식: " + Arrays.toString(foods));
        } else {
            System.out.println("해당 음식은 없는 음식입니다.");
        }


    }
}
