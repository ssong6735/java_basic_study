package day14.api.lang.string;

import java.util.*;

import static java.util.Scanner.*;

public class StrQuiz {

    public static void main(String[] args) {
        // 홍쌤 풀이
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호: ");
        String ssn = sc.next();

        UserData userData = new UserData(ssn);
        userData.printUserInfo();

        /*
        // 주민등록번호 넣으면 앞자리, 뒷자리, 00년도 00월 00일생 00세 성별
        Scanner sc = new Scanner(System.in);
        String ssn;

        while (true) {
            System.out.print("주민번호: ");
            ssn = sc.nextLine();

            if (ssn.length() != 14) {
                System.out.println("주민번호를 정확하게 입력해주세요.");
            } else {
                break;
            }
        }

        String frontNum = ssn.substring(0, 6);
        System.out.printf("앞자리: %s\n", frontNum);
        String backNum = ssn.substring(ssn.lastIndexOf("-")+1);
        System.out.printf("뒷자리: %s\n", backNum);

        String year = ssn.substring(0, 2);
        String month = ssn.substring(2, 4);
        String day = ssn.substring(4, 6);
        int age = 2021 - (1900 + Integer.parseInt(year) + 1);
        String gender = String.valueOf(ssn.charAt(7));

        if (Integer.parseInt(gender) == 1) {
            gender = "남자";
            year = 19 + year;
        } else if (Integer.parseInt(gender) == 2) {
            gender = "여자";
            year = 19 + year;
        } else if (Integer.parseInt(gender) == 3) {
            gender = "남자";
            year = 20 + year;
        } else if (Integer.parseInt(gender) == 4) {
            gender = "여자";
            year = 20 + year;
        } else {
            System.out.println("주민번호를 잘못 입력 했습니다.");
        }

        System.out.printf("%s년도 %s월 %s일생 %d세 %s\n", year, month, day, age, gender);

        sc.close();
        */




    }

}
