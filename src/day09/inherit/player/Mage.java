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

    public void meteo(Player... targets) {

        // targets 에는 메테오에 맞은 플레이어들이 있다.
        // 한명씩 꺼내서 10~15의 정수를 hp 에서 차감시킨다.
        // 결과로그를 출력
        // 자기 자신은 제외

        if (targets.length > 0) {

            System.out.printf("# %s님 메테오 시전!!\n", this.getNickName());
            System.out.println("=========================================");

            for (Player target : targets) {

                if (target == this) continue;

                // 10~15의 정수
                int damage = (int) (Math.random() * 6) + 10;
                target.hp -= damage; // hp 차감
                System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d)\n", target.getNickName(), damage, target.hp);
            }
        } else {
            System.out.println("# 타겟된 플레이어가 없습니다.");
        }

    }

}
