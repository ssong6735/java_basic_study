package day10.final_;

public class Korean {

    String name;
    // 상수(constant) : 메모리에 유일하며 값이 변하지 않음. 대문자사용. 띄어쓰기는 "_" (관례)
    static final String NATION = "대한민국"; // 국적
    final String ssn; // 주민번호

    Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

}
