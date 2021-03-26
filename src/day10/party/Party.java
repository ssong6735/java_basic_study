package day10.party;

import day09.inherit.player.Player;

// 플레이어 그룹
public class Party {

    private static final int NOT_FOUND = -1;
    
    // 클래스 배열
    Player[] players;
    int participation; // 현재 참여 인원 수 저장할 변수
    
    Party(int partyNum){
        players = new Player[partyNum];
        System.out.println(partyNum+"인 파티가 생성되었습니다.");
    }

    // 파티원 추가 기능
    public void addPlayer(Player player){

        // 파티 인원 수 초과 검증
        if(participation >= players.length) {
            System.out.println("정원이 초과하였습니다.");
            return;
        }
        players[participation++] = player;
        System.out.printf("%s님 파티 참여 완료!\n", player.getNickName());
    }
    
    // 파티원 추방 기능
    public void kickPlayer(String kickTargetName) {
        
        // 추방할 이름과 일치하는 객체가 들어있는 인덱스 번호를 알아낸다.
        int index = findIndexByPlayerNickName(kickTargetName);
//        System.out.println("index = " + index);

        if (index != NOT_FOUND) {
            // 삭제 로직
            for (int i = index; i < participation -1; i++) {
                players[i] = players[i+1];
            }
            participation--;
            System.out.printf("%s님을 추방했습니다.\n", kickTargetName);
        } else {
            System.out.println("파티원을 찾을 수 없습니다.");
        }
    }

    // 파티원 이름으로 인덱스 찾아주는 기능
    private int findIndexByPlayerNickName(String targetName) {

        for (int i = 0; i < participation; i++) {
            if(targetName.equals(players[i].getNickName())) {
                return i;
            }
        }
        return NOT_FOUND; // 못찾았을때 -1 리턴
    }
   

    // 파티원 전체 정보 보기
    public void showPartiInfo(){
        System.out.printf("+++++ 현재 파티원 정보 (%d명 참여 중) +++++\n", participation);
        for (int i = 0; i < participation; i++) { // 파티원 수 만큼만 반복문
            players[i].info();
        }
    }
    
}
