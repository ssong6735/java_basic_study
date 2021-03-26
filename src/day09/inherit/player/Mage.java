package day09.inherit.player;

// 상위 클래스로부터 상속받은 클래스를 자식, 하위 클래스(sub class) 라고 부른다.
// 상속은 is-a 관계를 만족한다.
public class Mage extends Player {

    int mana;

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    @Override // 오버라이딩 룰을 위반했는지 확인
    public void info() {
        super.info();
        System.out.println("# 마력: " + mana);
    }

    void meteo() {

    }

}
