package day09.inherit.player;

// 상위 클래스로부터 상속받은 클래스를 자식, 하위 클래스(sub class) 라고 부른다.
// 상속은 is-a 관계를 만족한다.
public class Hunter extends Player {

    String beast;

    public Hunter(String nickName) {
        super(nickName);
        this.beast = "멍멍이";
    }

    @Override // 오버라이딩 룰을 위반했는지 확인
    void info() {
        super.info();
        System.out.println("# 동물: " + beast);
    }

    void frozenShot() {

    }

}
