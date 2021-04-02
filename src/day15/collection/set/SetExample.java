package day15.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        // Set: 중복저장 허용x, 순서없이 빠른속도로 저장, 전체 탐색속도 빠름
        Set<String> set = new HashSet<>();

        // set 에 객체 추가: add()
        set.add("김말이");
        set.add("닭강정");
        set.add("김밥");
        set.add("단무지");
        set.add("떡볶이");

        System.out.println(set.size());
        System.out.println(set);

        // set 의 반복문 처리
        System.out.println("==========================");
        for (String str : set) {
            System.out.println(str);
        }

        // set 의 객체 삭제: remove(obj)
        set.remove("단무지");
        System.out.println(set);

        set.clear();
        System.out.println(set.isEmpty());



    }

}
