package day08.player;

public class Player {

    String name;
    int level;
    int hp;

    /*Player(String pName) {
        name = pName;
    }*/

    Player() {
        // this(), super() 는 반드시 생성자의 첫라인에 적는다.
        this("이름없음", 1);
        System.out.println("1번 생성자 호출!");
    }

    Player(String name) {
        this(name, 1); // 나의 다른 생성자를 연계 호출하겠다.
        System.out.println("2번 생성자 호출!");
    }

    Player(String name, int level) {
        System.out.println("3번 생성자 호출!");
        this.name = name;
        this.level = level;
        this.hp = this.level * 50;
    }

    void attack(Player target) { // Player this 라는 매개변수가 숨어있다.
        System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name);

        /*System.out.println("===================");
        System.out.println("target 의 주소값: " + target);
        System.out.println("this 의 주소값: " + this);

        System.out.println("맞은 플레이어 이름: " + target.name);
        System.out.println("때린 플레이어 이름: " + this.name);*/

    }

    void info() {
        System.out.printf("이름: %s, 레벨: %d, 체력: %d\n", this.name, this.level, this.hp);
    }

}
