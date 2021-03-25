package day09.inherit.player;

// 상위 클래스로부터 상속받은 클래스를 자식, 하위 클래스(sub class) 라고 부른다.
// 상속은 is-a 관계를 만족한다.
public class Warrior extends Player {

    int rage;

    public Warrior(String nickName) {
        super(nickName); // 없으면 첫줄에 자동으로 무조건 삽입된다. (부모 생성자 호출)
        this.rage = 60;
    }

    @Override // 오버라이딩 룰을 위반했는지 확인
    void info() {
        super.info();
        System.out.println("# 분노: " + rage);
    }

    void fireSlash() {

    }

}
