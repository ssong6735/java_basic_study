package day09.encap;

public class Main {

    public static void main(String[] args) {

        Cat myCat = new Cat("야옹이");
        myCat.setWeight(7.88);
        myCat.printWeight();

        double tripleWeight = myCat.getWeight(false) * 3;

    }

}
