package day05;

import java.util.Arrays;

public class ArrayDelete2 { // 7강_1. 배열 삭제 알고리즘
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11, 13};

        System.out.println("삭제 전: " + Arrays.toString(arr));

        /*
        # 2번 인덱스 값 5를 삭제할 경우
        arr[2] = arr[3];
        arr[3] = arr[4];
        arr[4] = arr[5];
        arr[5] = arr[6];
        */

        // 중간 삭제 알고리즘
        int delIndex = 2;
        for (int i = delIndex; i < arr.length - 1; i++) { //int i = 지우고 싶은 대상 인덱스
            arr[i] = arr[i+1];
        }
        int[] temp = new int[arr.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp; temp = null;

        System.out.println("삭제 후: " + Arrays.toString(arr));

    }
}
