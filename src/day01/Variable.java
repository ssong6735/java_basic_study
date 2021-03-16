package day01;

public class Variable { // 2강_2.변수 //class 이름은 파일명과 동일해야한다. (대소문자구분)
    public static void main(String[] args) {

        // 변수 선언
        int number = 20;
//        int point = 78.9; // 선언 타입이 다르면 저장 불가

        number = 70;
        System.out.println("number = " + number);

        int tripleNumber = number * 3;
        System.out.println("tripleNumber = " + tripleNumber);

        String name = "김철수"; // 문자열은 무조건 "" 사용
        System.out.println("name = " + name);

        // 변수의 범위: 변수는 선언된 블록을 벗어나면 메모리에서 제거된다.
        int n1 = 1, n2 = 2;

        if (true) {
            int n3 = n1+n2;
//            int n3 = 10;
        } // end if

//        System.out.println(n3);
//        int n3 = 100;

    } // end main
//    int n4 = n1+n2;


} // end class
