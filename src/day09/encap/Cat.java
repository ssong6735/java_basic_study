package day09.encap;

public class Cat {

    private String name;
    private double weight;

    public Cat(String name) {
        this.name = name;
    }

    // 값을 변경하거나 초기화하고 싶으면 setter 를 이용한다.
    public void setWeight(double weight) {
        if (weight <= 0 || weight >= 20) {
            this.weight = 3.5;
            return;
        }
        this.weight = weight;
    }

    // 값을 가져가서 참조하고 싶으면 getter 를 이용한다.
    public double getWeight(boolean pound) {
        if (pound) {
            return this.weight * 0.45; // pound
        } else {
            return this.weight; // kg
        }
    }

    public void printWeight() {
        System.out.printf("%s의 몸무게는 %.2f입니다.\n", this.name, this.weight);
    }

}
