package day11.poly.overloading;

public class Basic {

    // typeCheck(String)
    void typeCheck(String s) {
        System.out.println("문자열 1개가 들어옴!");
    }
    // typeCheck(String, String)
    int typeCheck(String name, String abc) {
        return 0;
    }
    // typeCheck(int)
    void typeCheck(int i) {
        System.out.println("정수 1개가 들어옴!");
    }
    // typeCheck(String, int)
    void typeCheck(String s, int i) {
        System.out.println("문자열 1개, 정수 1개가 들어옴!");
    }
    // typeCheck(int, String)
    void typeCheck(int i, String s) {

    }

    public static void main(String[] args) {

        Basic b = new Basic();
        b.typeCheck("dddd");
        b.typeCheck(10);
        b.typeCheck(10,"gggg");

        System.out.println();

    }

}
