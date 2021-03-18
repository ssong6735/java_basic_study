package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz { // 7강_1. 배열 탐색 quiz
    public static void main(String[] args) {

        // 동방신기 멤버들 중 수정할 멤버의 이름을 입력받기
        // 멤버가 아니면 없는 이름입니다 출력
        // 변경할때까지 반복

        Scanner sc = new Scanner(System.in);

        System.out.println("# 변경 전 정보: [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]");

        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        // 홍쌤 풀이
        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print("> ");
            String targetName = sc.next();

            int idx;
            for (idx = 0; idx < tvxq.length; idx++) {
                if (targetName.equals(tvxq[idx])) {
                    break;
                }
            }

            if (idx < tvxq.length) { //찾아냄
                System.out.println(tvxq[idx] + "의 별명을 변경합니다.");
                System.out.print("> ");
                tvxq[idx] = sc.next();
                System.out.println("변경 완료!");
                System.out.println("* 변경 후 정보: " + Arrays.toString(tvxq));
                sc.close();
                break;
            } else { //못찾음
                System.out.printf("%s은(는) 없는 이름입니다.\n", targetName);
            }
        }



        /*while (true) {
            System.out.print("> ");
            String modifyName = sc.next();

            // 순차 탐색 알고리즘
            boolean newArr = false;
            int i;
            for (i = 0; i < members.length; i++) {
                if (modifyName.equals(members[i])) {
                    newArr = true;
                    break;
                }
            }

            if (modifyName.equals(members[i])) {
            String[] temp = new String[members.length + 1];

            for (int i = 0; i < members.length; i++) {
                temp[i] = members[i];
            }

            temp[temp.length - 1] = modifyName;
            members = temp;
            temp = null;
            }


            if (newArr) {
                System.out.println("변경완료!");
                members[i] = modifyName;
            } else {
                System.out.printf("%s은(는) 없는 이름입니다.", modifyName);
            }
        }
                System.out.println("# 변경 후 정보: " + Arrays.toString(members));*/


    }
}
