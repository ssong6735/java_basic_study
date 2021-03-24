package day08.compare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student kim1 = new Student("김철수");

        System.out.print("이름: ");
        String inputName = sc.next();

        System.out.println("kim = " + kim1.name);
        System.out.println("inputName = " + inputName);

        System.out.println(kim1.name == inputName); // 인스턴스의 주소를 비교
        System.out.println(kim1.name.equals(inputName)); // char[] 까지 접근해서 값 비교


    }
}
