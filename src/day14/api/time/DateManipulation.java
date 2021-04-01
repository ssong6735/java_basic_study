package day14.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateManipulation {

    public static void main(String[] args) {

        LocalDate orderDate = LocalDate.now();
        LocalDate takeDate = orderDate.plusDays(3);

        System.out.println("주문날짜: " + orderDate);
        System.out.println("수령예상날짜: " + takeDate);

        // Builder 패턴 : 자기 자신을 계속 리턴
        LocalDateTime targetTime = LocalDateTime.now().plusYears(1).plusMonths(10).plusHours(3).minusMinutes(30);
        System.out.println("targetTime = " + targetTime);


        // 축제 시작일, 종료일
        LocalDateTime startDate = LocalDateTime.of(2021, 3, 1, 0, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2021, 3, 31, 23, 59, 59);
        // 현재 시간
        LocalDateTime now = LocalDateTime.now();

        if (now.isBefore(endDate)) { //if (now.minusDays(20).isBefore(endDate))
            System.out.println("현재 진행중인 행사입니다.");
        } else {
            System.out.println("종료된 행사입니다.");
        }


        // 날짜 연산 (뺄셈)
        long between = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("행사 진행 일수: " + between);


    }

}
