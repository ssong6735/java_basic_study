package day09.inherit.player;

// 공통 속성과 기능을 가진 클래스를 부모, 상위 클래스(super class) 라고 부른다.
public class Player { // 부모 클래스는 extends Object 를 자동으로 상속 (Object 제일 꼭대기 조상 root class)

    // 공통 필드
    public String nickName;
    int level;
    int hp;

    // 생성자
    public Player(String nickName) {
//        System.out.println("플레이어 생성자 호출!");
        this.nickName = nickName;
        this.level = 1;
        this.hp = level * 50;
    }

    // 공통 메서드
    void attack() {
        System.out.printf("%s님이 공격합니다.\n", this.nickName);
    }
    public void info() {
        System.out.println("\n================================");
        System.out.println("# 캐릭터명: " + nickName);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
    }

    public String getNickName() {
        return nickName;
    }
}
