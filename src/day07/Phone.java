package day07;

// 설계도 클래스는 main 을 만들지 않습니다.
public class Phone {

    // 속성: 객체의 데이터
    // 필드(field) - 필드 선언시에는 값을 지정하지 않는다.
    String model;
    String color;
    int price;
    String[] recieveMessages; // 문자 메시지들
    int messageCount; // 총 문자메시지 수
    boolean isOn; // 전원이 켜진 여부

    // 생성자 선언 (직접 생성자를 만들지 않으면 자바가 알아서 만들어준다.)
    // 객체의 초기화 담당
    // 생성자는 무조건 void, 때문에 생략하고 적지 않는다.
    Phone() {
        model = "갤럭시S20";
        color = "블랙";
        price = 1000000;
        isOn = true;
        recieveMessages = new String[3];
    }
    Phone (String customModel) {
        model = customModel;
        color = "스노우 화이트";
        price = 1200000;
        isOn = true;
        recieveMessages = new String[5];
    }
    Phone (String customModel, String customColor) {
        model = customModel;
        color = customColor;
        price = 1500000;
        isOn = true;
        recieveMessages = new String[10];
    }


    // 기능: 객체의 행위
    // 메서드(method) - 여기는 static 을 붙이지 않는다.

    // 전원 켜는 기능
    void powerOn() {
        isOn = true;
        System.out.println(model + "의 전원을 켭니다.");
    }

    // 전원 끄는 기능
    void powerOff() {
        isOn = false;
        System.out.println(model + "의 전원을 끕니다.");
    }

    // 핸드폰 정보를 보여주는 기능
    void showSpec() {
        if (!isOn) {
            System.out.println("전원을 먼저 켜세요!");
            return;
        }

        System.out.println("\n*** 휴대폰의 정보 ***");
        System.out.println("# 모델명: " + model);
        System.out.println("# 색상: " + color);
        System.out.println("# 가격: " + price + "원");
    }

    // 문자를 보내는 기능
    void sendMessage(Phone targetPhone, String message) {
        if (!isOn) {
            System.out.printf("%s의 전원을 먼저 켜세요.\n", model);
            return;
        }
        if (!targetPhone.isOn) {
            System.out.printf("%s의 전원이 꺼져있습니다.\n", targetPhone.model);
            return;
        }

        if (targetPhone.messageCount < targetPhone.recieveMessages.length) {
            targetPhone.recieveMessages[targetPhone.messageCount++] = message;
            System.out.println("메시지를 성공적으로 보냈습니다.");
        } else {
            System.out.println("메시지를 성공적으로 보냈습니다.");
        }
    }

    // 수신메시지함을 확인하는 기능
    void checkMessages() {
        System.out.printf("===== %s의 메시지함 =====\n", model);
        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n", i+1, recieveMessages[i]);
        }
    }

}
