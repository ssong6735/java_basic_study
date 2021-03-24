package day08.player;

public class Main {

    public static void main(String[] args) {

        Player kim = new Player("김철수");
        System.out.println("================================");
        Player park = new Player("박영희", 20);

        kim.info();
        park.info();

        /*System.out.println("kim 의 주소값: " + kim);
        System.out.println("park 의 주소값: " + park);

        kim.attack(park);
        park.attack(kim);
//        kim.attack(new Player("고길동"));

        new Player("둘리").attack(new Player("도우너"));*/

    }

}
