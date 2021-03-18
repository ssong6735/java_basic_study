package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz { // 7강_1. 배열 삭제 알고리즘 quiz
    public static void main(String[] args) {

        // 동방신기 멤버들 중 삭제할 멤버의 이름을 입력받기
        // 멤버가 아니면 없는 이름입니다 출력
        // 변경할때까지 반복

        // 홍쌤 풀이
        Scanner sc = new Scanner(System.in);

        String[] students = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 우리반 학생들의 별명: " + Arrays.toString(students));


        while(true) {
            System.out.println("- 삭제할 학생의 별명을 입력하세요! ");
            System.out.print("> ");
            String name = sc.next();

            //탐색 알고리즘
            int idx;
            for (idx=0; idx<students.length; idx++) {
                if(name.equals(students[idx])) {
                    break;
                }
            }
            //데이터가 탐색되었는지 조건 판단!
            if(idx < students.length) {
                System.out.println(students[idx] + "의 별명을 삭제합니다.");

                //삭제 알고리즘
                for(int i=idx; i<students.length-1; i++) {
                    students[i] = students[i+1];
                }

                //배열 복사 알고리즘
                String[] temp = new String[students.length-1];
                for(int i=0; i<temp.length; i++) {
                    temp[i] = students[i];
                }
                students = temp; temp = null;
                System.out.print("* 삭제 후 정보: "+ Arrays.toString(students));
                break;
            }else {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다.\n", name);
                continue;
            }
        }
        sc.close();


        /*Scanner sc = new Scanner(System.in);

        System.out.println("# 우리반 학생들의 별명: [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]");

        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        while (true) {
            System.out.println("- 삭제할 학생의 별명을 입력하세요.");
            System.out.print("> ");
            String targetName = sc.next();

            // 입력받은 이름의 index 번호 찾기
            int idx;
            for (idx = 0; idx < tvxq.length; idx++) {
                if (targetName.equals(tvxq[idx])) {
                    break;
                }
            }

            if (idx < tvxq.length) { // 찾은 index 번호가 배열보다 작으면
                System.out.println(tvxq[idx] + "의 별명을 삭제합니다.");

                // 중간 삭제 알고리즘
                int  delIndex = idx;
                for (int i = delIndex; i < tvxq.length - 1; i++) { //int i = 지우고 싶은 대상 인덱스
                    tvxq[i] = tvxq[i+1];
                }
                String [] temp = new String[tvxq.length-1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = tvxq[i];
                }
                tvxq = temp; temp = null;

                System.out.println("* 삭제 후 정보: " + Arrays.toString(tvxq));
                sc.close();
                break;
            } else { // 그렇지 않은경우 (못찾음 = idx 가 배열의 length 와 같다.)
                System.out.printf("%s은(는) 존재하지 않습니다.\n", targetName);
            }
        }*/

    }
}
