package day07.startTeamproject;

import java.util.Arrays;
import java.util.Scanner;

public class bookSearch { // 3. 책검색
    public static void main(String[] args) {
        /*
        // 배열을 값 목록으로 생성
        String[][] books = {
            {"책번호", "책제목", "저자", "출판사", "가격", "선호도"},
            {"책번호", "책제목", "저자", "출판사", "가격", "선호도"},
            {"책번호", "책제목", "저자", "출판사", "가격", "선호도"},
            {"책번호", "책제목", "저자", "출판사", "가격", "선호도"}
        };

        String[] bookInfo = {"책번호", "책제목", "저자", "출판사", "가격", "선호도"};

        책번호 : A000-소설, B100-인문, C200-과학, D300-컴퓨터




        */
        Scanner sc = new Scanner(System.in);

        // 배열을 값 목록으로 생성
        String[][] books = {
                {"A000", "소설책제목", "소설저자", "소설출판사", "소설가격", "소설선호도"},
                {"B100", "인문책제목", "인문저자", "인문출판사", "인문가격", "인문선호도"},
                {"C200", "과학책제목", "과학저자", "과학출판사", "과학가격", "과학선호도"},
                {"D300", "컴퓨터책제목", "컴퓨터저자", "컴퓨터출판사", "컴퓨터가격", "컴퓨터선호도"}
        };

//        System.out.println("등록된 책 수: " + books.length);
//        System.out.println("책번호: " + books[0][0]); // 원하는 책의 책번호: books[찾을 책이 있는 인덱스번호][0]

        // 찾을 책번호 입력받기
        System.out.println("찾으려는 책의 책번호를 입력하세요.");
        while (true) {
            System.out.print("> ");
            String bookName = sc.next();

            // 순차 탐색 알고리즘
            boolean searchBooks = false;

            // books 배열안에서 책번호가 있는 배열 찾기
            for (int idx = 0; idx < books.length; idx++) {
                String temp2;
                temp2 = books[idx][0];

                // 입력한 책번호가 배열안에 있는 책번호와 같으면 해당 배열 출력
                if (temp2.equals(bookName)) {
                    System.out.println(Arrays.toString(books[idx]));
                    searchBooks = true;
                    break;
                }
                continue;
            }

            
            break;
        }


    }
}
