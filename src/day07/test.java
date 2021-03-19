package day07;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;//책 수량 카운트 변수

        String[][] books = new String[1000][5];//데이터베이스 2차배열
        int listLength = 0;

        boolean end = false; //프로그램 종료
        System.out.println(books.length);
        System.out.println(books[0].length);

        while (true) {
            System.out.println("=====도서관리 프로그램=====");
            System.out.println("# 1. 도서 신규 등록");
            System.out.println("# 2. 모든 도서정보 보기");
            System.out.println("# 3. 도서정보 검색");
            System.out.println("# 4. 도서정보 수정");
            System.out.println("# 5. 도서정보 삭제");
            System.out.println("# 6. 프로그램 종료");
            System.out.println("============================");
            System.out.print("메뉴 입력: ");
            int menuInsert = sc.nextInt();

            switch (menuInsert) {
                case 1:
                    System.out.println("# 신규도서 등록을 시작합니다.");

                    String[] temp = new String[5];
                    System.out.print("- 책 번호: ");
                    temp[0] = sc.next();
                    System.out.print("- 책 제목: ");
                    temp[1] = sc.next();
                    System.out.print("- 저자: ");
                    temp[2] = sc.next();
                    System.out.print("- 출판사: ");
                    temp[3] = sc.next();
                    System.out.print("- 가격: ");
                    temp[4] = sc.next();
                    // 1차원 배열 정보 입력

                    books[i] = temp; temp = null;
                    i++;
                    listLength++;
                    System.out.println(listLength);
                    break;
                case 2:

                    break;
                case 3:
                    while (true) {
                        // 찾을 책번호 입력받기
                        System.out.println("찾으려는 책의 책번호를 입력하세요.");
                        System.out.print("> ");
                        String bookName = sc.next();

                        // books 배열안에서 책번호가 있는 배열 찾기
                        for (int i = 0; i < listLength; i++) {
                            String temp2;
                            temp2 = books[i][0];

                            // 입력한 책번호가 배열안에 있는 책번호와 같으면 해당 배열 출력
                            if (temp2.equals(bookName)) {
                                System.out.println(Arrays.toString(books[i]));
                                break;
                            }
                            System.out.println();
                        }

                    }

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    end = true;
                    break;
                default:
                    System.out.println("메뉴를 잘못 입력했습니다.");
                    continue;

            }

        }

        sc.close();

    }
}
