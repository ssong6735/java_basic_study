package day04;

import java.util.Scanner;

public class LoopQuiz { // 6강_36페이지 퀴즈
    public static void main(String[] args) {

        /*
        1. 일단 1~20의 랜덤 숫자로 두 수의 덧셈 문제를 1문제 출제한 후
           정답인지 오답인지 출력해보세요.
        2. 0을 입력할 때까지 반복해서 새로운 덧셈 문제를 출제하고
           지속해서 정답 오답을 출력해보세요.
        3. 프로그램 종료되면 그동안의 정답횟수와 오답횟수를 출력하세요.
        4. 빼기 기능을 추가하세요.
        5. 곱하기 기능을 추가하세요.
        6. 만약 두번째 숫자가 더 크다면 빼기 문제를 낼 때
           양수가 나올 수 있도록 앞숫자와 교체해주세요
           ex)  4 - 17 = ?    <- 이런문제가 출제될 경우
               17 - 4 = ?      <- 이렇게 바꿔서 출제할 것!
         */

        // 홍쌤풀이
        /*Scanner sc = new Scanner(System.in);

        System.out.println("~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]");

        System.out.println("# 엔터를 누르면 시작합니다.");
        System.out.println("=============================");
        sc.nextLine();



        // 질문 번호를 저장할 변수
        int qNumber = 1;

        //정답횟수와 오답횟수를 저장할 변수
        int correctCount = 0;
        int wrongCount = 0;

        while (true) {
            int first = (int) (Math.random() * 20) + 1;
            int second = (int) (Math.random() * 20) + 1;

            // 랜덤 정수 0,1,2 생성
            int MarkRn = (int) (Math.random()*3);
            // 연산 부호를 저장할 변수
            String mark = "-";

            // 실제 정답
            int realAnswer = 0;

            // 랜덤정수값에 따라 mark 의 부호 조건부 배치
            switch (MarkRn) {
                case 0:
                    mark = "+";
                    realAnswer = first + second;
                    break;
                case 1:
                    mark = "-";

                    // 만약 두 숫자가 같다면 2번째 숫자에서 1을 빼준다. (게임이 종료되지 않게)
                    if (first == second) {
                        second--;
                    }

                    // 뒷 숫자가 앞 숫자보다 크다면 두 값을 교체
                    if (first < second) {
                        int temp = first;
                        first = second;
                        second = temp;
                    }
                    realAnswer = first - second;
                    break;
                case 2:
                    mark = "x";
                    realAnswer = first * second;
                    break;
            }


            System.out.printf("\nQ%d) %d %s %d = ?\n", qNumber, first, mark, second);
            System.out.print(">> ");
            // 사용자의 입력값
            int userAnswer = sc.nextInt();

            qNumber++; // 다음 질문번호 셋팅

            if (userAnswer == 0) break;

            // 정답 검증
            if (userAnswer == realAnswer) {
                System.out.println("정답입니다!");
                correctCount++;
            } else {
                System.out.println("오답입니다!");
                wrongCount++;
            }
        } // end while

        // 프로그램 종료 이후
        System.out.println("=====================");
        System.out.printf("# 정답횟수: %d회, 오답횟수: %d회\n", correctCount, wrongCount);

        sc.close();*/




        /*Scanner sc = new Scanner(System.in);

        int right = 0;
        int wrong = 0;

        System.out.println("# 난이도를 입력하세요. [상, 중, 하]");
        System.out.print(">> ");

        String  level = sc.next();

        switch (level) {
            case "하":
                while (true) {
                    int num1 = (int) (Math.random() * (100 - 1 + 1)) + 1;
                    int num2 = (int) (Math.random() * (100 - 1 + 1)) + 1;

                    // 랜덤 정수 두 수의 합
                    System.out.printf("%d + %d = ?\n", num1, num2);
                    System.out.print("> ");
                    int answer = sc.nextInt();

                    if (answer == 0) {
                        break;
                    }
                    if (answer == num1 + num2) {
                        System.out.println("정답입니다!");
                        right++;
                    } else {
                        System.out.println("오답입니다!");
                        wrong++;
                    }
                }
                break;

            case "중":
                while (true) {
                    int num1 = (int) (Math.random() * (100 - 1 + 1)) + 1;
                    int num2 = (int) (Math.random() * (100 - 1 + 1)) + 1;

                    // 랜덤 정수 두 수의 뺄셈
                    System.out.printf("%d - %d = ?\n", num1, num2);
                    System.out.print("> ");
                    int answer = sc.nextInt();

                    if (answer == 0) {
                        break;
                    }
                    if (answer == num1 - num2) {
                        System.out.println("정답입니다!");
                        right++;
                    } else {
                        System.out.println("오답입니다!");
                        wrong++;
                    }
                }
                break;

            case "상":
                while (true) {
                    int num1 = (int) (Math.random() * (100 - 1 + 1)) + 1;
                    int num2 = (int) (Math.random() * (100 - 1 + 1)) + 1;

                    // 랜덤 정수 두 수의 곱셈
                    System.out.printf("%d X %d = ?\n", num1, num2);
                    System.out.print("> ");
                    int answer = sc.nextInt();

                    if (answer == 0) {
                        break;
                    }
                    if (answer == num1 * num2) {
                        System.out.println("정답입니다!");
                        right++;
                    } else {
                        System.out.println("오답입니다!");
                        wrong++;
                    }
                }
                break;

            default:
                System.out.println("[상, 중, 하] 중에서 입력하세요.");
        }
        sc.close();
        System.out.println("입력 종료!");
        System.out.println("=================");
        System.out.printf("정답횟수: %d회\n", right);
        System.out.printf("오답횟수: %d회", wrong);
        */


        Scanner sc = new Scanner(System.in);

        System.out.println("~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]");

        System.out.println("# 엔터를 누르면 시작합니다.");
        System.out.println("=============================");
        sc.nextLine();

        System.out.println("# 난이도를 입력하세요. [상, 중, 하]");
        System.out.print(">> ");
        String  gameLevel = sc.next(); // 입력받은 난이도

        //조건부로 입력한 난이도에 따라 랜덤 값 범위 지정
        int max = 0;
        switch (gameLevel) {
            case "상":
                max = 1000;
                System.out.println("상급 난이도를 선택하셨습니다. (1~1000)");
                break;
            case "중":
                max = 100;
                System.out.println("중급 난이도를 선택하셨습니다. (1~100)");
                break;
            case "하":
                max = 20;
                System.out.println("하급 난이도를 선택하셨습니다. (1~20)");
                break;
            default:
                max = 1000;
                System.out.println("난이도를 잘못 입력했습니다. 상급 난이도로 자동 시작합니다. (1~1000)");
        }

        // 질문 번호를 저장할 변수
        int qNumber = 1;
        //정답횟수와 오답횟수를 저장할 변수
        int correctCount = 0;
        int wrongCount = 0;


        while (true) {
            int first = (int) (Math.random() * max) + 1;
            int second = (int) (Math.random() * max) + 1;

            // 랜덤 정수 0,1,2 생성
            int MarkRn = (int) (Math.random()*3);
            // 연산 부호를 저장할 변수
            String mark = "-";

            // 실제 정답
            int realAnswer = 0;

            // 랜덤정수값에 따라 mark 의 부호 조건부 배치
            switch (MarkRn) {
                case 0:
                    mark = "+";
                    realAnswer = first + second;
                    break;
                case 1:
                    mark = "-";

                    // 만약 두 숫자가 같다면 2번째 숫자에서 1을 빼준다. (게임이 종료되지 않게)
                    if (first == second) {
                        second--;
                    }

                    // 뒷 숫자가 앞 숫자보다 크다면 두 값을 교체
                    if (first < second) {
                        int temp = first;
                        first = second;
                        second = temp;
                    }
                    realAnswer = first - second;
                    break;
                case 2:
                    mark = "x";
                    realAnswer = first * second;
                    break;
            }


            System.out.printf("\nQ%d) %d %s %d = ?\n", qNumber, first, mark, second);
            System.out.print(">> ");
            // 사용자의 입력값
            int userAnswer = sc.nextInt();

            qNumber++; // 다음 질문번호 셋팅

            if (userAnswer == 0) break;

            // 정답 검증
            if (userAnswer == realAnswer) {
                System.out.println("정답입니다!");
                correctCount++;
            } else {
                System.out.println("오답입니다!");
                wrongCount++;
            }
        } // end while

        // 프로그램 종료 이후
        System.out.println("=====================");
        System.out.printf("# 정답횟수: %d회, 오답횟수: %d회\n", correctCount, wrongCount);

        sc.close();

    }
}


