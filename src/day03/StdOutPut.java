package day03;

public class StdOutPut {
    public static void main(String[] args) {

        String dog = "멍멍이";
        String cat = "야옹이";

//        System.out.print(dog + "\n");
        System.out.println(dog);
        System.out.println(cat);

        String filePath = "d:\\temp\\new.jpg";
        System.out.println(filePath);
        // 리눅스는 / 로 경로 구분

        String msg = "he said \"warning!\" to me";
        System.out.println(msg);

        int month = 4;
        int day = 5;
        String anni = "식목일";

        System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
        // printf %사용 자동 줄바꿈 안해줌 (%d: 정수, %s: 문자열)
        System.out.println("야호");

        double saleRate = 0.2512;
        System.out.printf("할인율은 %.2f%%입니다. \n", saleRate * 100);
        // printf (%f: 실수, 기본적으로 소수점 이하 6자리까지 강제로 표현)
        // %.1f: 소수점 1자리에서 반올림
        // 특수기호 % 사용할때는 두개 적어주기 %%


    }
}
