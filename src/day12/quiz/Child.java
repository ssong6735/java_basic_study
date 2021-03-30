package day12.quiz;

public class Child extends Parent {

    public Child(String name) {
        super(name);
        // 자식클래스 this.name 위에 super()가 자동으로 숨어있다.
        // 부모 클래스에 기본생성자가 없어서 에러
        // super("문자열") 넣어주면 해결
//        this.name = name; // super(name)을 넣으면 해당 코드는 필요 없음.
    }

}
