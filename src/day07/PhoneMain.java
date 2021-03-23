package day07;

// 실행용 클래스는 main 메서드를 포함합니다.
public class PhoneMain {

    public static void main(String[] args) {

        // 객체의 생성
        Phone galaxys20 = new Phone();

        // 객체의 속성과 기능을 참조: 참조연산자 . 을 사용
        galaxys20.showSpec();

        System.out.println("===============================");

        Phone iPhoneX = new Phone("아이폰X");
        iPhoneX.showSpec();

        System.out.println("===============================");

        Phone LgV6 = new Phone("LG V6", "에메랄드 그린");
        LgV6.showSpec();

        System.out.println("===============================");

        galaxys20.powerOff();
        iPhoneX.powerOff();

        galaxys20.powerOn();
        iPhoneX.powerOn();
        galaxys20.sendMessage(iPhoneX, "야 밥 먹었냐?");

        iPhoneX.checkMessages();

        iPhoneX.sendMessage(galaxys20, "ㅇㅇ 먹었어!");

        galaxys20.checkMessages();

        galaxys20.sendMessage(iPhoneX, "동해물과");
        galaxys20.sendMessage(iPhoneX, "백두산이");
        galaxys20.sendMessage(iPhoneX, "마르고");
        galaxys20.sendMessage(iPhoneX, "닳도록");
        galaxys20.sendMessage(iPhoneX, "하느님이");
        galaxys20.sendMessage(iPhoneX, "보우하사");

        iPhoneX.checkMessages();

        iPhoneX.sendMessage(LgV6, "엘지 ㅎㅇㅎㅇ");

        LgV6.checkMessages();



        /*Phone iPhoneX = new Phone();

        // 객체의 속성과 기능을 참조: 참조연산자 . 을 사용
        galaxys20.model = "갤럭시S20";
        galaxys20.color = "펄 블루";
        galaxys20.price = 1000000;

        iPhoneX.model = "아이폰X";
        iPhoneX.color = "스노우 화이트";
        iPhoneX.price = 1200000;

        galaxys20.powerOn();
        galaxys20.showSpec();

        iPhoneX.powerOn();
        iPhoneX.showSpec();
        iPhoneX.powerOff();

        galaxys20.showSpec();*/

    }
}
