package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Roulette { // 룰렛 게임
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("게임 인원 (2 ~ 4명) ==> ");
        // 총 참여인원 수
        int playerNum = sc.nextInt();

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

        System.out.print("\n실탄 개수를 입력 (6미만) ==> ");
        // 총알 개수 입력받기
        int bulletNum = sc.nextInt();

        // 탄창 배열을 만든다 (공간 6개)
        boolean[] magazine = new boolean[6];

        // 입력된 실탄 수만큼 배열 내부값을 랜덤으로 변경
        int successCount = 0; // 정확하게 총알을 장전한 횟수
        while (successCount < bulletNum) { // 총알이 모두 정해진 수만큼 장전 될때까지 반복
            // 랜덤 실탄 위치 결정 (0~5)
            int position = (int) (Math.random() * magazine.length);
            if (magazine[position] == false) { // 만약에 실탄이 비어있다면
                magazine[position] = true; // 장전해라
                successCount++; // 장전횟수를 올려라
            }
        }
//        System.out.println("탄창: " + Arrays.toString(magazine));

        // 게임 시작
        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");

        // 첫번째 턴 플레이어 랜덤 결정
        int turn = (int) (Math.random() * players.length);
        String turnName = players[turn];
        System.out.printf("총을 돌렸습니다. %s부터 시작합니다.\n", turnName);

        // 턴 시작
        System.out.printf("\n[%s의 턴!] 탄창을 무작위로 돌립니다.\n", turnName);
        System.out.println("# 엔터를 누르면 격발합니다.");
        sc.nextLine();
        sc.nextLine();






    }
}
