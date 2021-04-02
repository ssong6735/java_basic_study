package day15.generic;

// 제네릭 타입 F : 복제타입은 아무거나 정할수 있음. 관례상 대문자 한글자
public class Basket<F extends Fruit> { // fruit 라서 F

    // 과일 필드
    private F fruit;

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    public F getFruit() {
        return fruit;
    }
}
