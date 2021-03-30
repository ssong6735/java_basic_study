package day06;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Roulette { // 룰렛 게임

    private static Scanner sc = new Scanner(System.in);

    // 예외 처리를 위한 메서드 (기존 sc.nextInt 를 safeNextInt 로 변경해준다)
    public static int safeNextInt(String question) {
        while (true) {
            try {
                System.out.print(question);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine(); // nextInt 의 공백 처리때문에 넣어줌
                System.out.println("정수로만 입력하세요.");
            }
        }
    }

    public static void main(String[] args) {


        // 총 참여인원 수
        int playerNum = safeNextInt("게임 인원 (2 ~ 4명) ==> ");

        // 인원 수의 범위가 적당한지 판단
        if (playerNum < 2 || playerNum > 4) {
            System.out.println("인원 수가 바르지 않습니다. Game Over!");
            return;
        }

        // 플레이어 이름 저장할 배열
        // 크기는 참여인원 수 만큼 설정
        String[] players = new String[playerNum];

        // 참여 인원 수대로 이름을 반복 입력 받은 후 배열에 저장
        System.out.println("플레이어 이름을 등록합니다.");
        for (int i = 0; i < players.length; i++) {
            System.out.printf("%d번 플레이어 이름: ", i + 1);
            players[i] = sc.next();
        }

        // 참여 인원 이름 출력
        System.out.println(Arrays.toString(players) + " 참가!");

        // 총알 개수 입력받기
        int bulletNum = safeNextInt("\n실탄 개수를 입력 (6미만) ==> ");
        sc.nextLine(); // 위에서 발생한 nextInt 의 \n 을 처리하는 구문

        // 총알 개수가 6보다 크게 들어왔을때 처리
        if (bulletNum > 6) {
            bulletNum = safeNextInt("\n실탄 개수를 다시 입력해주세요. (6미만) ==> ");
            sc.nextLine(); // 위에서 발생한 nextInt 의 \n 을 처리하는 구문
        }

        // 탄창 배열을 만든다 (공간 6개)
        boolean[] magazine = new boolean[6];

        // 입력된 실탄 수만큼 배열 내부값을 랜덤으로 변경
        int successCount = 0; // 정확하게 총알을 장전한 횟수
        while (successCount < bulletNum) { // 총알이 모두 정해진 수만큼 장전 될때까지 반복
            // 랜덤 실탄 위치 결정 (0~5)
            int position = (int) (Math.random() * magazine.length);
            if (magazine[position] == false) { //만약에 실탄이 비어있다면
                magazine[position] = true; //장전해라
                successCount++; //장전횟수를 올려라
            }
        }
//        System.out.println("탄창: " + Arrays.toString(magazine));

        // 게임 시작
        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");

        // 첫번째 턴 플레이어 랜덤 결정
        // 턴 수를 저장할 변수를 선언(players 배열의 인덱스)
        // ex) 현재 턴수: 0번 이면 첫번째 플레이어의 턴
        int turn = (int) (Math.random() * playerNum);

        System.out.printf("%s부터 시작합니다.\n", players[turn]);

        // 게임이 종료될 때까지 반복
        while (true) {
            // 격발 전 총알 위치를 랜덤으로 설정
            int bulletPosition = (int) (Math.random() * magazine.length);
            System.out.printf("\n[%s의 턴!] 탄창을 무작위로 돌립니다.\n", players[turn]);

            System.out.println("# 엔터를 누르면 격발합니다.");
            sc.nextLine(); // 실제로 엔터를 입력받는 기능

            // 사망 판정
            if (magazine[bulletPosition]) {
                // 사망
                System.out.printf("\n빵!! [%s]님 사망....\n", players[turn]);
                // 사망자를 배열에서 삭제하고
                for (int i = turn; i < players.length - 1; i++) {
                    players[i] = players[i + 1];
                }
                String[] temp = new String[players.length - 1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = players[i];
                }
                players = temp;
                temp = null;
                playerNum--;

                // 탄창배열에서 총알이 나간 위치를 수정
                magazine[bulletPosition] = false;
                bulletNum--;

                // 게임 종료 조건 판단
                // 남은 플레이어가 1명일 때, 총알이 모두 소진되었을 때
                if (playerNum == 1) {
                    System.out.println("단 한명만 생존했습니다. 게임을 종료합니다.");
                    System.out.println("최후 생존자: " + players[0]);
                    break;
                } else if (bulletNum == 0) {
                    System.out.println("총알이 모두 소진되었습니다. 게임을 종료합니다.");
                    System.out.println("남은 인원 정보: " + Arrays.toString(players));
                    break;
                } else {
                    System.out.println("\n남은 인원으로 게임을 계속 진행합니다.");
                    System.out.println("남은 인원 정보: " + Arrays.toString(players));
                    //혹시 사망자가 마지막플레이어면 turn을 0으로 조정
                    if (turn == playerNum) {
                        turn = 0;
                    }
                    continue;
                }

            } else {
                // 생존
                // 턴을 넘겨야 한다.
                System.out.println("휴.... 살았습니다!");
                // turn 인덱스를 조정
                if (turn == players.length - 1) {
                    // 마지막번 플레이어는 다음턴을 0으로 조절
                    turn = 0;
                } else {
                    turn++;
                }
            }
        }

// 브랜치 테스트 feat/doolri
    }
}
